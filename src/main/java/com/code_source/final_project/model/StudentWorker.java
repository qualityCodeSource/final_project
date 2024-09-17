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

    public String getJob() {
        return mJob;
    }

    public void setJob(String job) {
        this.mJob = job;
    }

    public double getPay() {
        return mPay;
    }

    public void setmPay(double pay) {
        this.mPay = pay;
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
        return "Student Worker :: " +
                "Job: " + mJob  +
                " / Pay: $" + mPay +
                " / Name: " + mName  +
                " / DOB: " + mDOB +
                " / Gender: " + mGender  +
                " / Languages: " + mLanguages  +
                " / Education: " + mEducation  +
                " / Location: " + mLocation  +
                '|';
    }
}
