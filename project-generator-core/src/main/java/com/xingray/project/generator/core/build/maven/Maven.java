package com.xingray.project.generator.core.build.maven;

import com.xingray.code.common.FileTreeNode;
import com.xingray.java.command.CommandExecutor;
import com.xingray.java.command.JavaRuntimeCommandExecutor;
import com.xingray.project.generator.core.entity.BuildSystem;
import com.xingray.project.maven.model.MavenProject;

import java.io.File;

public class Maven implements BuildSystem {
    private File root;
    private MavenProject mavenProject;
    private MavenFileGenerator mavenFileGenerator;

    public MavenFileGenerator getMavenFileGenerator() {
        return mavenFileGenerator;
    }

    public void setMavenFileGenerator(MavenFileGenerator mavenFileGenerator) {
        this.mavenFileGenerator = mavenFileGenerator;
    }

    public MavenProject getMavenProject() {
        return mavenProject;
    }

    public void setMavenProject(MavenProject mavenProject) {
        this.mavenProject = mavenProject;
    }

    @Override
    public String toString() {
        return "Maven{" +
                "mavenProject=" + mavenProject +
                ", mavenFileGenerator=" + mavenFileGenerator +
                '}';
    }

    @Override
    public FileTreeNode generatorBuildSystemFile() {
        return mavenFileGenerator.generatorFileTreeNode(this);
    }

    @Override
    public void build(File location) {
        CommandExecutor executor = new JavaRuntimeCommandExecutor();
        executor.execute("mvn clean package", location);
    }

    @Override
    public void run(File location) {
        CommandExecutor executor = new JavaRuntimeCommandExecutor();
        String jarFileName = mavenProject.getArtifactId() + "-" + mavenProject.getVersion() + ".jar";
        executor.execute("java -jar " + jarFileName, new File(location, "target"));
    }

    @Override
    public void clean(File location) {
        CommandExecutor executor = new JavaRuntimeCommandExecutor();
        executor.execute("mvn clean", location);
    }
}
