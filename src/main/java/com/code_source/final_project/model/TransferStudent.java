package com.code_source.final_project.model;

import java.util.Objects;
//testcommit
public class TransferStudent extends Student
{
    private String mTransferSchool;
    private int mNumCredits;

    public TransferStudent(String name, String DOB, String gender, String languages, String education, String location, String transferSchool, int numCredits)
    {
        super(name, DOB, gender, languages, education, location);
        this.mTransferSchool = transferSchool;
        this.mNumCredits = numCredits;
    }

    public String getmTransferSchool() {
        return mTransferSchool;
    }

    public void setmTransferSchool(String mTransferSchool) {
        this.mTransferSchool = mTransferSchool;
    }

    public int getmNumCredits() {
        return mNumCredits;
    }

    public void setmNumCredits(int mNumCredits) {
        this.mNumCredits = mNumCredits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TransferStudent that = (TransferStudent) o;
        return mNumCredits == that.mNumCredits && Objects.equals(mTransferSchool, that.mTransferSchool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mTransferSchool, mNumCredits);
    }

    @Override
    public String toString() {
        return "Transfer Student{" +
                "Transfer School='" + mTransferSchool + '\'' +
                ", Num Credits=" + mNumCredits +
                ", Name='" + mName + '\'' +
                ", DOB='" + mDOB + '\'' +
                ", Gender='" + mGender + '\'' +
                ", Languages='" + mLanguages + '\'' +
                ", Education='" + mEducation + '\'' +
                ", Location='" + mLocation + '\'' +
                '}';
    }
}
