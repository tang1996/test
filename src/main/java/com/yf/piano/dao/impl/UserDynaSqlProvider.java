package com.yf.piano.dao.impl;

import com.yf.piano.util.StringUtil;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

/**
 * @author Tyy
 * 用户动态持久层
 */
public class UserDynaSqlProvider {

    public String repeatUser(String phone, String email) {
        String sql = "select * from user where";
        if (!StringUtil.isEmpty(phone)) {
            sql = sql + " phone=#{phone}";
        }
        if (!StringUtil.isEmpty(email)) {
            sql = sql + " email=#{email}";
        }
        return sql;
    }

    public String repeatCode(String token, String code, String userName) {
        String sql = "select * from user where";
        String verification = sql;
        if (!StringUtil.isEmpty(token)) {
            sql = sql + " token=#{token}";
        }
        if (!StringUtil.isEmpty(code)) {
            if (verification.equals(sql)) {
                sql = sql + " code=#{code}";
            } else {
                sql = sql + " or code=#{code}";
            }
        }
        if (!StringUtil.isEmpty(userName)) {
            if (verification.equals(sql)) {
                sql = sql + " user_name=#{userName}";
            } else {
                sql = sql + " or user_name=#{userName}";
            }
        }
        return sql;
    }

}