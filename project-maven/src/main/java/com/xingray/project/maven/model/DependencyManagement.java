package com.xingray.project.maven.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class DependencyManagement {

    @JacksonXmlElementWrapper(localName = "dependencies")
    @JacksonXmlProperty(localName = "dependency")
    List<Dependency> dependencies;
}
