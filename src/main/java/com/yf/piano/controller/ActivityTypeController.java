package com.yf.piano.controller;

import com.yf.piano.service.ActivityTypeService;
import com.yf.piano.util.JSonMessage;
import com.yf.piano.util.PushJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Tyy
 * 商品分类控制器
 */

@RestController
@RequestMapping("/activityType")
public class ActivityTypeController {

    @Autowired
    ActivityTypeService activityTypeService;

    /**
     * @author Tyy
     * 添加活动分类
     */
    @RequestMapping(value = "/addActivityType", method = RequestMethod.POST)
    @ResponseBody
    public void addActivityType(HttpServletRequest request, HttpServletResponse response) {
        JSonMessage message = activityTypeService.addActivityType(request);
        new PushJson().outString(message.toJSonString(), response);

    }

    /**
     * @author Tyy
     * 活动分类列表
     */
    @RequestMapping(value = "/getActivityTypeList", method = RequestMethod.POST)
    @ResponseBody
    public void getActivityTypeList(HttpServletRequest request, HttpServletResponse response) {
        JSonMessage message = activityTypeService.getActivityTypeList();
        new PushJson().outString(message.toJSonString(), response);

    }

}
