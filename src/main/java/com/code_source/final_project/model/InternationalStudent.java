package com.code_source.final_project.model;

import java.util.Objects;

public class InternationalStudent extends Student{

    private String mCountryOfOrigin;
    private boolean mHostFamily;

    public InternationalStudent(String name, String DOB, String gender, String languages, String education, String location, String countryOfOrigin, boolean hostFamily) {
        super(name, DOB, gender, languages, education, location);
        mCountryOfOrigin = countryOfOrigin;
        mHostFamily = hostFamily;
    }

    public String getCountryOfOrigin() {
        return mCountryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        mCountryOfOrigin = countryOfOrigin;
    }

    public boolean isHostFamily() {
        return mHostFamily;
    }

    public void setHostFamily(boolean hostFamily) {
        mHostFamily = hostFamily;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        InternationalStudent that = (InternationalStudent) o;
        return mHostFamily == that.mHostFamily && Objects.equals(mCountryOfOrigin, that.mCountryOfOrigin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mCountryOfOrigin, mHostFamily);
    }

    @Override
    public String toString() {
        return "*InternationalStudent*" +
                " Name=" + mName +
                ", DOB=" + mDOB +
                ", Gender=" + mGender +
                ", Languages=" + mLanguages +
                ", Education=" + mEducation +
                ", Location=" + mLocation +
                ", CountryOfOrigin=" + mCountryOfOrigin +
                ", HostFamily=" + mHostFamily;
    }
}
