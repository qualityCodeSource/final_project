package com.code_source.final_project.model;

import java.util.Objects;

public class DisabledStudent extends Student{

    private String mDisability;
    private boolean mAssistanceNeeded;

    public DisabledStudent(String name, String DOB, String gender, String languages, String education, String location, String disability, boolean assistanceNeeded) {
        super(name, DOB, gender, languages, education, location);
        mDisability = disability;
        mAssistanceNeeded = assistanceNeeded;
    }

    public String getDisability() {
        return mDisability;
    }

    public void setDisability(String disability) {
        mDisability = disability;
    }

    public boolean isAssistanceNeeded() {
        return mAssistanceNeeded;
    }

    public void setAssistanceNeeded(boolean assistanceNeeded) {
        mAssistanceNeeded = assistanceNeeded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DisabledStudent that = (DisabledStudent) o;
        return mAssistanceNeeded == that.mAssistanceNeeded && Objects.equals(mDisability, that.mDisability);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mDisability, mAssistanceNeeded);
    }

    @Override
    public String toString() {
        return "*DisabledStudent*" +
                " Name=" + mName +
                ", DOB=" + mDOB +
                ", Gender=" + mGender +
                ", Languages=" + mLanguages +
                ", Education=" + mEducation +
                ", Location=" + mLocation +
                ", Disability='" + mDisability +
                ", AssistanceNeeded=" + mAssistanceNeeded;
    }
}
