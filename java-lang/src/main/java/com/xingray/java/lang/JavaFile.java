package com.xingray.java.lang;

import com.xingray.code.common.FileTreeNode;

import java.util.List;

public class JavaFile {
    private final String name;
    private List<JavaClass> javaClassList;
    private List<JavaInterface> javaInterfaceList;

    public JavaFile(String name) {
        this.name = name;
    }

    public JavaFile(String name, JavaClass javaClass) {
        this.name = name;
        this.javaClassList = List.of(javaClass);
    }

    public JavaFile(String name, JavaInterface javaInterface) {
        this.name = name;
        this.javaInterfaceList = List.of(javaInterface);
    }

    public FileTreeNode createFileTreeNode() {
        return null;
    }
}
