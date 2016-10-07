package com.arc.sid.timetable;

public class SearchResults {

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

    public void setFaculty(String string) {
        this.faculty = string;
    }

    public void setPeriodName(String string) {
        this.periodName = string;
    }

    public void setTiming(String string) {
        this.timing = string;
    }
}
