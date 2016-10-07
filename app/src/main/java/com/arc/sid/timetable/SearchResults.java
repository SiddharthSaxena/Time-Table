package com.arc.sid.timetable;

public class SearchResults
{
    private String faculty = "";
    private String periodName = "";
    private String timing = "";

    public String getFaculty() {
        return this.faculty;
    }

    public String getPeriodName() {
        return this.periodName;
    }

    public String getTiming() {
        return this.timing;
    }

    public void setFaculty(String paramString) {
        this.faculty = paramString;
    }

    public void setPeriodName(String paramString) {
        this.periodName = paramString;
    }

    public void setTiming(String paramString) {
        this.timing = paramString;
    }
}
