package com.code_source.final_project.model;

import java.util.Objects;

public class InternationalStudent extends Student{

    String mCountryOfOrigin;

    public InternationalStudent(String name, String DOB, String gender, String languages, String education, String location, String countryOfOrigin) {
        super(name, DOB, gender, languages, education, location);
        mCountryOfOrigin = countryOfOrigin;
    }

    public String getCountryOfOrigin() {
        return mCountryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        mCountryOfOrigin = countryOfOrigin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        InternationalStudent that = (InternationalStudent) o;
        return Objects.equals(mCountryOfOrigin, that.mCountryOfOrigin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mCountryOfOrigin);
    }

    @Override
    public String toString() {
        return "InternationalStudent{" +
                "CountryOfOrigin='" + mCountryOfOrigin + '\'' +
                '}';
    }


}
