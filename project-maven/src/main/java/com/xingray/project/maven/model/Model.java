package com.xingray.project.maven.model;

import java.util.List;

public class Model extends ModelBase{
    private String modelVersion;

    private Parent parent;

    private String groupId;

    private String artifactId;

    private String version;

    private String packaging = "jar";

    private String name;

    private String description;

    private String url;

    private String childInheritAppendPath;

    private String inceptionYear;

    private Organization organization;

    private java.util.List<License> licenses;

    private java.util.List<Developer> developers;

    private java.util.List<Contributor> contributors;

    private java.util.List<MailingList> mailingLists;

    private Prerequisites prerequisites;

    private SourceControlManagement scm;

    private IssueManagement issueManagement;

    private CiManagement ciManagement;

    private Build build;

    private java.util.List<Profile> profiles;

    private String modelEncoding;

    public String getModelVersion() {
        return modelVersion;
    }

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getChildInheritAppendPath() {
        return childInheritAppendPath;
    }

    public void setChildInheritAppendPath(String childInheritAppendPath) {
        this.childInheritAppendPath = childInheritAppendPath;
    }

    public String getInceptionYear() {
        return inceptionYear;
    }

    public void setInceptionYear(String inceptionYear) {
        this.inceptionYear = inceptionYear;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public List<License> getLicenses() {
        return licenses;
    }

    public void setLicenses(List<License> licenses) {
        this.licenses = licenses;
    }

    public List<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<Developer> developers) {
        this.developers = developers;
    }

    public List<Contributor> getContributors() {
        return contributors;
    }

    public void setContributors(List<Contributor> contributors) {
        this.contributors = contributors;
    }

    public List<MailingList> getMailingLists() {
        return mailingLists;
    }

    public void setMailingLists(List<MailingList> mailingLists) {
        this.mailingLists = mailingLists;
    }

    public Prerequisites getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(Prerequisites prerequisites) {
        this.prerequisites = prerequisites;
    }

    public SourceControlManagement getScm() {
        return scm;
    }

    public void setScm(SourceControlManagement scm) {
        this.scm = scm;
    }

    public IssueManagement getIssueManagement() {
        return issueManagement;
    }

    public void setIssueManagement(IssueManagement issueManagement) {
        this.issueManagement = issueManagement;
    }

    public CiManagement getCiManagement() {
        return ciManagement;
    }

    public void setCiManagement(CiManagement ciManagement) {
        this.ciManagement = ciManagement;
    }

    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }

    public List<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
    }

    public String getModelEncoding() {
        return modelEncoding;
    }

    public void setModelEncoding(String modelEncoding) {
        this.modelEncoding = modelEncoding;
    }

    @Override
    public String toString() {
        return "Model{" +
                "modelVersion='" + modelVersion + '\'' +
                ", parent=" + parent +
                ", groupId='" + groupId + '\'' +
                ", artifactId='" + artifactId + '\'' +
                ", version='" + version + '\'' +
                ", packaging='" + packaging + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", childInheritAppendPath='" + childInheritAppendPath + '\'' +
                ", inceptionYear='" + inceptionYear + '\'' +
                ", organization=" + organization +
                ", licenses=" + licenses +
                ", developers=" + developers +
                ", contributors=" + contributors +
                ", mailingLists=" + mailingLists +
                ", prerequisites=" + prerequisites +
                ", scm=" + scm +
                ", issueManagement=" + issueManagement +
                ", ciManagement=" + ciManagement +
                ", build=" + build +
                ", profiles=" + profiles +
                ", modelEncoding='" + modelEncoding + '\'' +
                '}';
    }
}
