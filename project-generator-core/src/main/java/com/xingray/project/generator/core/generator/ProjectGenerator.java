package com.xingray.project.generator.core.generator;

import com.xingray.code.common.FileTreeNode;
import com.xingray.project.generator.core.entity.Project;

public interface ProjectGenerator {
    FileTreeNode generate(Project project);
}
