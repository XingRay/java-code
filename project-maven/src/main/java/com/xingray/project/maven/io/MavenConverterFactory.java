package com.xingray.project.maven.io;

public class MavenConverterFactory {
    public MavenConverter createMavenConverter() {
        return new JacksonMavenConverter();
    }
}
