package com.example.Apache_Activemq.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Utils {
    public String getTimestamp() {
        //return new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(new Date());
        return new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.getDefault()).format(new Date());
    }
}
