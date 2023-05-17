package com.xingray.project.generator.core.build.none;

import com.xingray.code.common.FileTreeNode;
import com.xingray.project.generator.core.entity.BuildSystem;

import java.io.File;

public class None implements BuildSystem {
    @Override
    public FileTreeNode generatorBuildSystemFile() {
        return null;
    }

    @Override
    public void build(File location) {

    }

    @Override
    public void run(File location) {

    }

    @Override
    public void clean(File location) {

    }
}
