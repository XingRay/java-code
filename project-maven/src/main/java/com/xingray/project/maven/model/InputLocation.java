package com.xingray.project.maven.model;

import java.util.Map;

public class InputLocation {
    private int lineNumber = -1;

    private int columnNumber = -1;

    private InputSource source;

    private Map<Object, InputLocation> locations;

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    public void setColumnNumber(int columnNumber) {
        this.columnNumber = columnNumber;
    }

    public InputSource getSource() {
        return source;
    }

    public void setSource(InputSource source) {
        this.source = source;
    }

    public Map<Object, InputLocation> getLocations() {
        return locations;
    }

    public void setLocations(Map<Object, InputLocation> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "InputLocation{" +
                "lineNumber=" + lineNumber +
                ", columnNumber=" + columnNumber +
                ", source=" + source +
                ", locations=" + locations +
                '}';
    }
}
