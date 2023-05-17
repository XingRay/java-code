package com.xingray.project.generator.core.build.maven;

public interface XmlConverter {
    String objectToXml(Object o);

    <T> T xmlToIbject(String s, Class<T> cls);
}
