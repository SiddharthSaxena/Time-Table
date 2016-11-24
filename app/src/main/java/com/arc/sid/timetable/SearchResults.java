//
//     Copyright (C) 2016  Siddharth Saxena
//
//     This program is free software: you can redistribute it and/or modify
//     it under the terms of the GNU General Public License as published by
//     the Free Software Foundation, either version 3 of the License, or
//     (at your option) any later version.
//
//     This program is distributed in the hope that it will be useful,
//     but WITHOUT ANY WARRANTY; without even the implied warranty of
//     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//     GNU General Public License for more details.
//
//     You should have received a copy of the GNU General Public License
//     along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
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
