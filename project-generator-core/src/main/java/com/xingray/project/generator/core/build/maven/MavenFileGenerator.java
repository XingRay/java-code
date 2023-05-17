package com.xingray.project.generator.core.build.maven;

import com.xingray.code.common.FileTreeNode;
import com.xingray.project.generator.core.generator.BuildSystemFileGenerator;
import com.xingray.project.maven.model.MavenProject;

public class MavenFileGenerator implements BuildSystemFileGenerator<Maven> {

    private final XmlConverter xmlConverter;

    public MavenFileGenerator(XmlConverter xmlConverter) {
        this.xmlConverter = xmlConverter;
    }

    @Override
    public FileTreeNode generatorFileTreeNode(Maven buildSystem) {
        MavenProject mavenProject = buildSystem.getMavenProject();
        String content = xmlConverter.objectToXml(mavenProject);
        return FileTreeNode.createNode("pom.xml", content);
    }
}
