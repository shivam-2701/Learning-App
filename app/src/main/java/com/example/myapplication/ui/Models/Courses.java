package com.example.myapplication.ui.Models;

public class Courses {
    private String mCourseName;
    private int mCourseImageResourceId;
    private static final int NO_IMAGE_PROVIDED=-1;


    public Courses(String mCourseName, int mCourseImageResourceId) {
        this.mCourseName = mCourseName;
        this.mCourseImageResourceId = mCourseImageResourceId;
    }

    public void setCourseImageResourceId(int mCourseImageResourceId) {
        this.mCourseImageResourceId = mCourseImageResourceId;
    }

    public String getCourseName() {
        return mCourseName;
    }

    public void setCourseName(String mCourseName) {
        this.mCourseName = mCourseName;
    }

    public int getCourseImageResourceId() {
        return mCourseImageResourceId;
    }
}
