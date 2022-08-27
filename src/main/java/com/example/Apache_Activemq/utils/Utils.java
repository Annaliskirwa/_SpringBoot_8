package com.example.Apache_Activemq.utils;

import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Utils {
    public String getTimestamp() {
        //return new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(new Date());
        return new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.getDefault()).format(new Date());
    }
    public String sanitizePhoneNumber(String phone) {

        if (phone.equals("")) {
            return "";
        }
        if (phone.length() < 11 & phone.startsWith("0")) {
            String p = phone.replaceFirst("^0", "+254-");
            return p;
        }
        if (phone.length() == 13 && phone.startsWith("+254")) {
            String p = phone.replaceFirst("^+254", "+254-");
            return p;
        }
        if (phone.length() == 12 && phone.startsWith("254")) {
            String p = phone.replaceFirst("^254", "+254-");
            return p;
        }
        return phone;
    }
    public String getTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(dtf.format(now));

        return dtf.format(now);
    }
}
