package com.dhanjyothi.util;

public class DbUtil {

    public static java.sql.Timestamp getCurrentTimeStamp() {
        return new java.sql.Timestamp( ( new java.util.Date()).getTime());            
    }
}