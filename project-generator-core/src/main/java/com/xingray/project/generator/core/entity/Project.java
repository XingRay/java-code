package com.xingray.project.generator.core.entity;

import com.xingray.code.common.FileTreeNode;
import com.xingray.project.generator.core.generator.ProjectGenerator;

import java.io.File;
import java.util.List;
import java.util.function.Supplier;

public class Project {
    private String name;
    private File location;
    private BuildSystem buildSystem;
    private List<Module> moduleList;
    private List<Supplier<FileTreeNode>> sourceCodeList;
    private ProjectGenerator projectGenerator;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public File getLocation() {
        return location;
    }

    public void setLocation(File location) {
        this.location = location;
    }

    public BuildSystem getBuildSystem() {
        return buildSystem;
    }

    public void setBuildSystem(BuildSystem buildSystem) {
        this.buildSystem = buildSystem;
    }

    public List<Module> getModuleList() {
        return moduleList;
    }

    public void setModuleList(List<Module> moduleList) {
        this.moduleList = moduleList;
    }

    public List<Supplier<FileTreeNode>> getSourceCodeList() {
        return sourceCodeList;
    }

    public void setSourceCodeList(List<Supplier<FileTreeNode>> sourceCodeList) {
        this.sourceCodeList = sourceCodeList;
    }

    public ProjectGenerator getProjectGenerator() {
        return projectGenerator;
    }

    public void setProjectGenerator(ProjectGenerator projectGenerator) {
        this.projectGenerator = projectGenerator;
    }

    public FileTreeNode generate() {
        return projectGenerator.generate(this);
    }

    public void build() {
        buildSystem.build(location);
    }

    public void run() {
        buildSystem.run(location);
    }

    public void clean() {
        buildSystem.clean(location);
    }

    public FileTreeNode generatorBuildSystemFile() {
        return buildSystem.generatorBuildSystemFile();
    }

    //    public String[] getGav() {
//        return new String[]{groupId, artifactId, version};
//    }
//
//    public Project() {
//    }
//
//    public Project(String groupId, String artifactId, String version) {
//        this.groupId = groupId;
//        this.artifactId = artifactId;
//        this.version = version;
//    }

//    public static Project ofGav(String[] gav) {
//        return new Project(gav[0], gav[1], gav[2]);
//    }
//
//    public static Project ofGav(String gav) {
//        return ofGav(gav.split(":"));
//    }
}
