package com.yf.piano.util;

import com.alibaba.fastjson.JSONObject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Tyy
 * 字符串验证工具类
 */
public class StringUtil {

    public static boolean isEmpty(String s) {
        if (s == null || s.length() <= 0 || s.equals("null")) return true;
        else return false;
    }

    public static String valueToString(JSONObject jsonObject, String name) {
        return (jsonObject.get(name) == null) ? "" : jsonObject.get(name).toString();
    }

    public static boolean isNumber(String str){
        return str.matches("^[0-9]+.{0,1}[0-9]{0,2}$");
    }

    public static boolean isPhone(String phone) {
        String regex = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$";
        if (phone.length() != 11) {
            return false;
        } else {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(phone);
            boolean isMatch = m.matches();
            return isMatch;
        }
    }

}
