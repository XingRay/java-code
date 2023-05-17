package com.xingray.project.generator.core.build.gradle;

import com.xingray.code.common.FileTreeNode;
import com.xingray.project.generator.core.entity.BuildSystem;
import com.xingray.project.generator.core.entity.Project;

import java.io.File;

public class Gradle implements BuildSystem {
    @Override
    public FileTreeNode generatorBuildSystemFile() {
        return null;
    }

    @Override
    public void clean(File location) {

    }

    @Override
    public void build(File location) {

    }

    @Override
    public void run(File location) {

    }
}
