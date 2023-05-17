package com.xingray.project.maven.model;

public class Resource {
    private String targetPath;

    private String filtering;

    private String mergeId;

    public String getTargetPath() {
        return targetPath;
    }

    public void setTargetPath(String targetPath) {
        this.targetPath = targetPath;
    }

    public String getFiltering() {
        return filtering;
    }

    public void setFiltering(String filtering) {
        this.filtering = filtering;
    }

    public String getMergeId() {
        return mergeId;
    }

    public void setMergeId(String mergeId) {
        this.mergeId = mergeId;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "targetPath='" + targetPath + '\'' +
                ", filtering='" + filtering + '\'' +
                ", mergeId='" + mergeId + '\'' +
                '}';
    }
}
