package com.xingray.java.lang;

import com.xingray.code.common.FileTreeNode;
import com.xingray.code.common.SourceCode;
import com.xingray.java.util.collection.CollectionUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaSourceCode implements SourceCode {
    private List<JavaPackage> javaPackageList;
    private List<JavaFile> javaFileList;

    public JavaSourceCode() {
    }

    public JavaSourceCode(List<JavaPackage> javaPackageList, List<JavaFile> javaFileList) {
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
        return "JavaSourceCode{" +
                "javaPackageList=" + javaPackageList +
                ", javaFileList=" + javaFileList +
                '}';
    }

    @Override
    public List<FileTreeNode> generate() {
        List<FileTreeNode> fileTreeNodeList = new ArrayList<>();

        CollectionUtil.forEach(javaPackageList, ((javaPackage, i) -> {
            fileTreeNodeList.add(javaPackage.createFileTree());
        }));
        CollectionUtil.forEach(javaFileList, ((javaFile, i) -> {
            fileTreeNodeList.add(javaFile.createFileTreeNode());
        }));

        return fileTreeNodeList.size() > 0 ? fileTreeNodeList : Collections.emptyList();
    }
}
