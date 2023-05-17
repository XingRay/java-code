package com.xingray.project.generator.core.generator;

import com.xingray.code.common.FileTreeNode;
import com.xingray.project.generator.core.entity.BuildSystem;
import com.xingray.project.generator.core.entity.Project;

public interface BuildSystemFileGenerator<T extends BuildSystem> {
    FileTreeNode generatorFileTreeNode(T buildSystem);
}
