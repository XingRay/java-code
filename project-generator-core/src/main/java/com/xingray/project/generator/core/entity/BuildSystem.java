package com.xingray.project.generator.core.entity;

import com.xingray.code.common.FileTreeNode;
import com.xingray.project.generator.core.generator.BuildSystemFileGenerator;

import java.io.File;

/**
 * 目前只支持 Maven
 */
public interface BuildSystem {

    FileTreeNode generatorBuildSystemFile();

    void build(File location);

    void run(File location);

    void clean(File location);
}
