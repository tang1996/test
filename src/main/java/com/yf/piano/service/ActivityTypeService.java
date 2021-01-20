package com.yf.piano.service;

import com.yf.piano.util.JSonMessage;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Tyy
 * 活动分类逻辑层
 */

public interface ActivityTypeService {

    /**
     * 添加活动分类
     *
     * @param request
     */
    JSonMessage addActivityType(HttpServletRequest request);

    /**
     * 活动分类列表
     */
    JSonMessage getActivityTypeList();

}
