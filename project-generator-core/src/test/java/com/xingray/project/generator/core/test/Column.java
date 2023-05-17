package com.xingray.project.generator.core.test;

public class Column {
    public String attrType;
    public String attrName;
    public String comment;

    public Column(String attrType, String attrName, String comment) {
        this.attrType = attrType;
        this.attrName = attrName;
        this.comment = comment;
    }

    public String getAttrType() {
        return attrType;
    }

    public void setAttrType(String attrType) {
        this.attrType = attrType;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Column{" +
                "attrType='" + attrType + '\'' +
                ", attrName='" + attrName + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
