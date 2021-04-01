package com.coder71.coder71.model;

public class Contact {

    private String name;
    private String email;
    private String projectName;
    private String Requirements;

    public Contact() {
    }

    public Contact(String name, String email, String projectName, String requirements) {
        this.name = name;
        this.email = email;
        this.projectName = projectName;
        Requirements = requirements;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getRequirements() {
        return Requirements;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setRequirements(String requirements) {
        Requirements = requirements;
    }
}
