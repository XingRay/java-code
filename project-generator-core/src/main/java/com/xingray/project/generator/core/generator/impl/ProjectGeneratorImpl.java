package com.xingray.project.generator.core.generator.impl;

import com.xingray.code.common.FileTreeNode;
import com.xingray.code.common.SourceCode;
import com.xingray.project.generator.core.entity.Project;
import com.xingray.project.generator.core.generator.ProjectGenerator;

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
        SourceCode sourceCode = project.getSourceCodeList();
        if (sourceCode != null) {
            sourceCodeRootNode.addChildren(sourceCode.generate());
        }


//        String packageName = project.getGroupId() + "." + project.getArtifactId().replaceAll("-", ".");
//        String mainClassName = "Main";
//
//        String[] packageNames = packageName.split("\\.");
//        FileTreeNode packageRootTree = sourceCodeRootNode.addAndGetDescendantTree(packageNames);
//
//        String content = generateCode(packageName, mainClassName);
//        packageRootTree.addChildNode(mainClassName + ".java", content);

        FileTreeNode buildSystemFile = project.generatorBuildSystemFile();
        projectRootTree.addChild(buildSystemFile);

        return projectRootTree;
    }
}
