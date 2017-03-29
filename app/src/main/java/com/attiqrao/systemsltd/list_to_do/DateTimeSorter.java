package com.attiqrao.systemsltd.list_to_do;

/*
 *
 * Created by Attiq ur Rehman on 3/29/2017.
 * Senior Software Engineer at Systems Ltd
 * attiq.ur.rehman1991@gmail.com
 */

public class DateTimeSorter {
    public int mIndex;
    public String mDateTime;


    public DateTimeSorter(int index, String DateTime){
        mIndex = index;
        mDateTime = DateTime;
    }

    public DateTimeSorter(){}


    public int getIndex() {
        return mIndex;
    }

    public void setIndex(int index) {
        mIndex = index;
    }

    public String getDateTime() {
        return mDateTime;
    }

    public void setDateTime(String dateTime) {
        mDateTime = dateTime;
    }
}
