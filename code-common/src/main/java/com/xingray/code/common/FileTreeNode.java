package com.xingray.code.common;


import com.xingray.java.util.FileUtil;
import com.xingray.java.util.collection.CollectionUtil;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class FileTreeNode {
    private String name;
    private String content;
    private List<FileTreeNode> children;

    private FileTreeNode parent;

    private boolean isNode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<FileTreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<FileTreeNode> children) {
        this.children = children;
    }

    public boolean isNode() {
        return isNode;
    }

    public void setNode(boolean isNode) {
        this.isNode = isNode;
    }

    public FileTreeNode getParent() {
        return parent;
    }

    public void setParent(FileTreeNode parent) {
        this.parent = parent;
    }

    public FileTreeNode(String name, String content, List<FileTreeNode> children, FileTreeNode parent, boolean isNode) {
        this.name = name;
        this.content = content;
        this.children = children;
        this.parent = parent;
        this.isNode = isNode;
    }

    @Override
    public String toString() {
        return "FileTreeNode{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", children=" + children +
                ", parent=" + (parent == null ? "null" : parent.getName()) +
                ", isNode=" + isNode +
                '}';
    }

    public static FileTreeNode createNode(String name, String content) {
        return new FileTreeNode(name, content, null, null, true);
    }

    public static FileTreeNode createNode(FileTreeNode parent, String name, String content) {
        if (parent.isNode) {
            throw new IllegalArgumentException("parent is node, only tree can add child");
        }
        FileTreeNode node = createNode(name, content);
        parent.addChild(node);
        return node;
    }

    public static FileTreeNode createTree(String name) {
        return new FileTreeNode(name, null, null, null, false);
    }

    public static FileTreeNode createTree(String... names) {
        FileTreeNode root = createTree(names[0]);
        FileTreeNode current = root;
        for (int i = 1; i < names.length; i++) {
            FileTreeNode child = createTree(names[i]);
            current.addChild(child);
            current = child;
        }
        return root;
    }

    public static FileTreeNode createTree(String[]names, FileTreeNode node) {
        FileTreeNode root = createTree(names[0]);
        FileTreeNode current = root;
        for (int i = 1; i < names.length; i++) {
            FileTreeNode child = createTree(names[i]);
            current.addChild(child);
            current = child;
        }
        current.addChild(node);
        return root;
    }

    public static FileTreeNode createTree(FileTreeNode parent, String name) {
        if (parent.isNode) {
            throw new IllegalArgumentException("parent is node, only tree can add child");
        }

        FileTreeNode node = createTree(name);
        parent.addChild(node);
        return node;
    }

    public void write(File location) throws IOException {
        if (location.exists()) {
            if (location.isFile()) {
                location.delete();
                location.mkdirs();
            }
        } else {
            location.mkdirs();
        }

        File file = new File(location, name);
        FileUtil.deleteFileRecursive(file);

        if (isNode()) {
            file.createNewFile();
            if (content != null && content.length() > 0) {
                Files.writeString(file.toPath(), content == null ? "" : content);
            }
        } else {
            file.mkdirs();
            if (children != null && children.size() > 0) {
                for (FileTreeNode node : children) {
                    node.write(new File(location, name));
                }
            }
        }
    }

    public FileTreeNode addAndGetChildTree(String name) {
        return createTree(this, name);
    }

    public FileTreeNode addChildTree(String name) {
        createTree(this, name);
        return this;
    }

    public FileTreeNode addAndGetChildNode(String name) {
        return addAndGetChildNode(name, null);
    }

    public FileTreeNode addAndGetChildNode(String name, String content) {
        return createNode(this, name, content);
    }

    public FileTreeNode addChildNode(String name) {
        return addChildNode(name, null);
    }

    public FileTreeNode addChildNode(String name, String content) {
        createNode(this, name, content);
        return this;
    }

    public FileTreeNode parent() {
        return parent;
    }

    public FileTreeNode child(String name) {
        for (FileTreeNode node : children) {
            if (node.getName().equals(name)) {
                return node;
            }
        }
        return null;
    }

    public FileTreeNode descendant(String... names) {
        FileTreeNode node = this;
        for (String name : names) {
            node = node.child(name);
        }
        return node;
    }

    public FileTreeNode addAndGetDescendantTree(String... names) {
        FileTreeNode node = this;
        for (String name : names) {
            node = node.addAndGetChildTree(name);
        }
        return node;
    }

    public FileTreeNode addDescendantTree(String... names) {
        addAndGetDescendantTree(names);
        return this;
    }

    public FileTreeNode addChild(FileTreeNode child) {
        child.setParent(this);
        if (children == null) {
            children = new ArrayList<>();
        }
        children.add(child);
        return this;
    }

    public FileTreeNode addChildren(List<FileTreeNode> nodeList) {
        if (CollectionUtil.isEmpty(nodeList)) {
            return this;
        }
        for (FileTreeNode child : nodeList) {
            child.setParent(this);
        }
        if (children == null) {
            children = new ArrayList<>(nodeList);
        } else {
            children.addAll(nodeList);
        }
        return this;
    }
}
