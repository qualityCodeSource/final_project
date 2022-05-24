package com.code_source.final_project.model;

import java.util.Objects;

public class DisabledStudent extends Student{

    String mDisability;

    public DisabledStudent(String name, String DOB, String gender, String languages, String education, String location, String disability) {
        super(name, DOB, gender, languages, education, location);
        mDisability = disability;
    }

    public String getDisability() {
        return mDisability;
    }

    public void setDisability(String disability) {
        mDisability = disability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DisabledStudent that = (DisabledStudent) o;
        return Objects.equals(mDisability, that.mDisability);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mDisability);
    }

    @Override
    public String toString() {
        return "DisabledStudent{" +
                "mDisability='" + mDisability + '\'' +
                '}';
    }
}
