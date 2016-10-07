package com.arc.sid.timetable;

public class SearchResults {

    private String faculty = "";
    private String periodName = "";
    private String timing = "";

    public String getFaculty() {
        return faculty;
    }

    public String getPeriodName() {
        return periodName;
    }

    public String getTiming() {
        return timing;
    }

    public void setFaculty(String name) {
        this.faculty = name;
    }

    public void setPeriodName(String string) {
        this.periodName = string;
    }

    public void setTiming(String string) {
        this.timing = string;
    }
}
