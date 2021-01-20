package com.yf.piano.entity;


import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

/**
 * @author Tyy
 * 活动分类实体类
 */
@Table(name = "activity_type")
public class ActivityType extends BaseModel {

    @Column(name = "id", type = MySqlTypeConstant.INT, isKey = true, isAutoIncrement = true, isNull = false, length = 11)
    private Integer id;     //主键id

    @Column(name = "name", type = MySqlTypeConstant.VARCHAR, length = 225)		//活动分类名称
    private String name;

    @Column(name = "key_word", type = MySqlTypeConstant.VARCHAR, length = 225)		//关键字
    private String keyWord;

    @Column(name = "brief", type = MySqlTypeConstant.VARCHAR, length = 225)		//活动简介
    private String brief;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    @Override
    public String toString() {
        return "GoodsType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", keyWord='" + keyWord + '\'' +
                ", brief='" + brief + '\'' +
                '}';
    }
}
