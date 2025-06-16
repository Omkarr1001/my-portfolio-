package com.omkar.model;

public class Project {
    private String title;
    private String description;
    private String stack;
    private String githubUrl;

    // Constructor
    public Project(String title, String description, String stack, String githubUrl) {
        this.title = title;
        this.description = description;
        this.stack = stack;
        this.githubUrl = githubUrl;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }
} 