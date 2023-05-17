package com.xingray.project.maven.io;

import com.xingray.project.maven.model.MavenProject;

import java.io.File;

public interface MavenConverter {
    String toXmlString(MavenProject model) throws Exception;

    MavenProject fromXmlString(String s) throws Exception;

    void writeToFile(MavenProject model, File file) throws Exception;

    MavenProject readFromFile(File file) throws Exception;
}
