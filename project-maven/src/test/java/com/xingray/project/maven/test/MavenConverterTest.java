package com.xingray.project.maven.test;

import com.xingray.project.maven.io.MavenConverter;
import com.xingray.project.maven.io.MavenConverterFactory;
import com.xingray.project.maven.model.MavenProject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;

public class MavenConverterTest {

    private MavenConverter converter;

    @BeforeEach
    public void beforeEach() {
        converter = new MavenConverterFactory().createMavenConverter();
    }

    @Test
    public void testReadPomFile() {
        try {
            MavenProject mavenProject = converter.readFromFile(new File("pom.xml"));
            assert mavenProject != null;
            System.out.println(mavenProject);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
