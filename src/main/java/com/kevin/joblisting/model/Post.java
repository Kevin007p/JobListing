package com.kevin.joblisting.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "JobPost")
public class Post {
    private String profile;
    private String desc;
    private int exp;
    private String[] techs;

    public Post() {
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String description) {
        this.desc = description;
    }

    public int getYearsOfExperience() {
        return exp;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.exp = yearsOfExperience;
    }

    public String[] getTechs() {
        return techs;
    }

    public void setTechs(String[] techs) {
        this.techs = techs;
    }

    @Override
    public String toString() {
        return "Post{" +
                "profile='" + profile + '\'' +
                ", description='" + desc + '\'' +
                ", yearsOfExperience=" + exp +
                ", Tech Stacks=" + Arrays.toString(techs) +
                '}';
    }
}