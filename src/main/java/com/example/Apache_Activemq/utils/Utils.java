package com.example.Apache_Activemq.utils;

import java.text.SimpleDateFormat;
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
}
