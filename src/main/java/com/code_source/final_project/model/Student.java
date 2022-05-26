package com.code_source.final_project.model;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    protected String mName;
    protected String mDOB;
    protected String mGender;
    protected String mLanguages;
    protected String mEducation;
    protected String mLocation;

    public Student(String name, String DOB, String gender, String languages, String education, String location) {
        mName = name;
        mDOB = DOB;
        mGender = gender;
        mLanguages = languages;
        mEducation = education;
        mLocation = location;
    }

    public String getName() {
        return mName;
    }

    public String getDOB() {
        return mDOB;
    }

    public String getGender() {
        return mGender;
    }

    public String getLanguages() {
        return mLanguages;
    }

    public String getEducation() {
        return mEducation;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setName(String name) {
        mName = name;
    }

    public void setDOB(String DOB) {
        mDOB = DOB;
    }

    public void setGender(String gender) {
        mGender = gender;
    }

    public void setLanguages(String languages) {
        mLanguages = languages;
    }

    public void setEducation(String education) {
        mEducation = education;
    }

    public void setLocation(String location) {
        mLocation = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(mName, student.mName) && Objects.equals(mDOB, student.mDOB) && Objects.equals(mGender, student.mGender) && Objects.equals(mLanguages, student.mLanguages) && Objects.equals(mEducation, student.mEducation) && Objects.equals(mLocation, student.mLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mName, mDOB, mGender, mLanguages, mEducation, mLocation);
    }

    @Override
    public String toString() {
        return "Name:" + mName +
                ", DOB:" + mDOB  +
                ", Gender:" + mGender +
                ", Languages:" + mLanguages +
                ", Education:" + mEducation +
                ", Location:" + mLocation;
    }
}
