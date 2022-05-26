package com.code_source.final_project.model;

import java.util.Objects;

public class StudentWorker extends Student
{
    private String mJob;
    private double mPay;

    public StudentWorker(String name, String DOB, String gender, String languages, String education, String location, String job, double pay)
    {
        super(name, DOB, gender, languages, education, location);
        this.mJob = job;
        this.mPay = pay;
    }

    public String getmJob() {
        return mJob;
    }

    public void setmJob(String mJob) {
        this.mJob = mJob;
    }

    public double getmPay() {
        return mPay;
    }

    public void setmPay(double mPay) {
        this.mPay = mPay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StudentWorker that = (StudentWorker) o;
        return Double.compare(that.mPay, mPay) == 0 && Objects.equals(mJob, that.mJob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mJob, mPay);
    }

    @Override
    public String toString() {
        return "Student Worker{" +
                "Job='" + mJob + '\'' +
                ", Pay=" + mPay +
                ", Name='" + mName + '\'' +
                ", DOB='" + mDOB + '\'' +
                ", Gender='" + mGender + '\'' +
                ", Languages='" + mLanguages + '\'' +
                ", Education='" + mEducation + '\'' +
                ", Location='" + mLocation + '\'' +
                '}';
    }
}
