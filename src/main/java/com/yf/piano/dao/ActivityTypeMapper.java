package com.yf.piano.dao;

import com.yf.piano.entity.ActivityType;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Tyy
 * 活动类型持久层
 */

@Mapper
public interface ActivityTypeMapper {

    /**
     * 添加活动类型
     */
    @Insert(value = "insert into activity_type (name,ksy_word,brief) values (#{name},#{ksyWord},#{brief})")
    Integer addActivityType(@Param("name") String name,
                            @Param("ksyWord") String ksyWord,
                            @Param("brief") String brief
    );

    /**
     * 活动类型列表
     */
    @Select(value = "select * from activity_type")
    List<ActivityType> getActivityTypeList();

}
