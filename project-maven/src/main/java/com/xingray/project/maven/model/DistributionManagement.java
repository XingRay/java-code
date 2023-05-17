package com.xingray.project.maven.model;

import java.util.Map;

public class DistributionManagement {
    private DeploymentRepository repository;

    private DeploymentRepository snapshotRepository;

    private Site site;

    private String downloadUrl;


    private Relocation relocation;

    private String status;

    /**
     * Field locations.
     */
    private Map<Object, InputLocation> locations;
}
