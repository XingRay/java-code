package com.xingray.project.maven.model;

import java.util.Map;
import java.util.Properties;

public class Notifier {
    private String type = "mail";

    /**
     * Whether to send notifications on error.
     */
    private boolean sendOnError = true;

    /**
     * Whether to send notifications on failure.
     */
    private boolean sendOnFailure = true;

    /**
     * Whether to send notifications on success.
     */
    private boolean sendOnSuccess = true;

    private boolean sendOnWarning = true;

    private String address;

    /**
     * Field configuration.
     */
    private Properties configuration;

    /**
     * Field locations.
     */
    private Map<Object, InputLocation> locations;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSendOnError() {
        return sendOnError;
    }

    public void setSendOnError(boolean sendOnError) {
        this.sendOnError = sendOnError;
    }

    public boolean isSendOnFailure() {
        return sendOnFailure;
    }

    public void setSendOnFailure(boolean sendOnFailure) {
        this.sendOnFailure = sendOnFailure;
    }

    public boolean isSendOnSuccess() {
        return sendOnSuccess;
    }

    public void setSendOnSuccess(boolean sendOnSuccess) {
        this.sendOnSuccess = sendOnSuccess;
    }

    public boolean isSendOnWarning() {
        return sendOnWarning;
    }

    public void setSendOnWarning(boolean sendOnWarning) {
        this.sendOnWarning = sendOnWarning;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Properties getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Properties configuration) {
        this.configuration = configuration;
    }

    public Map<Object, InputLocation> getLocations() {
        return locations;
    }

    public void setLocations(Map<Object, InputLocation> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Notifier{" +
                "type='" + type + '\'' +
                ", sendOnError=" + sendOnError +
                ", sendOnFailure=" + sendOnFailure +
                ", sendOnSuccess=" + sendOnSuccess +
                ", sendOnWarning=" + sendOnWarning +
                ", address='" + address + '\'' +
                ", configuration=" + configuration +
                ", locations=" + locations +
                '}';
    }
}
