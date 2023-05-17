module com.xingray.project.maven {
    requires com.fasterxml.jackson.dataformat.xml;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.core;

    exports com.xingray.project.maven.model;
    opens com.xingray.project.maven.model;

    exports com.xingray.project.maven.io;
}
