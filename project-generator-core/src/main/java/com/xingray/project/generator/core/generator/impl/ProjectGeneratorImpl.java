package com.xingray.project.generator.core.generator.impl;

import com.xingray.code.common.FileTreeNode;
import com.xingray.java.util.collection.CollectionUtil;
import com.xingray.project.generator.core.entity.Project;
import com.xingray.project.generator.core.generator.ProjectGenerator;

import java.util.List;
import java.util.function.Supplier;

public class ProjectGeneratorImpl implements ProjectGenerator {

    public ProjectGeneratorImpl() {

    }

    @Override
    public FileTreeNode generate(Project project) {
        FileTreeNode projectRootTree = FileTreeNode.createTree(project.getName());

        projectRootTree.addAndGetDescendantTree("src", "main")
                /**/.addAndGetChildTree("java").parent()
                /**/.addAndGetChildTree("resource");

        FileTreeNode sourceCodeRootNode = projectRootTree.descendant("src", "main", "java");
        List<Supplier<FileTreeNode>> sourceCodeList = project.getSourceCodeList();
        CollectionUtil.forEach(sourceCodeList, (fileTreeNodeSupplier, i) -> {
            FileTreeNode child = fileTreeNodeSupplier.get();
            sourceCodeRootNode.addChild(child);
        });

        FileTreeNode buildSystemFile = project.generatorBuildSystemFile();
        projectRootTree.addChild(buildSystemFile);

        return projectRootTree;
    }
}
