package com.xingray.java.lang;

import com.xingray.code.common.FileTreeNode;
import com.xingray.java.util.collection.CollectionUtil;

import java.util.List;

public class JavaPackage {
    private final String name;
    private List<JavaPackage> javaPackageList;
    private List<JavaFile> javaFileList;

    public JavaPackage(String name) {
        this.name = name;
    }

    public JavaPackage(String name, List<JavaPackage> javaPackageList, List<JavaFile> javaFileList) {
        this.name = name;
        this.javaPackageList = javaPackageList;
        this.javaFileList = javaFileList;
    }

    public List<JavaPackage> getJavaPackageList() {
        return javaPackageList;
    }

    public void setJavaPackageList(List<JavaPackage> javaPackageList) {
        this.javaPackageList = javaPackageList;
    }

    public List<JavaFile> getJavaFileList() {
        return javaFileList;
    }

    public void setJavaFileList(List<JavaFile> javaFileList) {
        this.javaFileList = javaFileList;
    }

    @Override
    public String toString() {
        return "JavaPackage{" +
                "javaPackageList=" + javaPackageList +
                ", javaFileList=" + javaFileList +
                '}';
    }

    public FileTreeNode createFileTree() {
        FileTreeNode fileTreeNode = FileTreeNode.createTree(name);

        CollectionUtil.forEach(javaPackageList, (javaPackage, i) ->
                fileTreeNode.addChild(javaPackage.createFileTree()));

        CollectionUtil.forEach(javaFileList, (javaFile, i) ->
                fileTreeNode.addChild(javaFile.createFileTreeNode()));

        return fileTreeNode;
    }
}
