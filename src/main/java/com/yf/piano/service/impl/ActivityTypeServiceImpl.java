package com.yf.piano.service.impl;

import com.yf.piano.dao.ActivityTypeMapper;
import com.yf.piano.entity.ActivityType;
import com.yf.piano.service.ActivityTypeService;
import com.yf.piano.util.JSonMessage;
import com.yf.piano.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.yf.piano.util.JSonMessage.*;

/**
 * @author Tyy
 * 商品分类逻辑层实现类
 */

@Service
@Configuration
public class ActivityTypeServiceImpl implements ActivityTypeService {

    @Autowired
    ActivityTypeMapper activityTypeMapper;

    /**
     * 添加活动分类
     *
     * @param request
     * @return
     */
    @Override
    public JSonMessage addActivityType(HttpServletRequest request) {
        //必填参数
        String name = request.getParameter("name");       //分类名称
        String keyWord = request.getParameter("keyWord");       //关键字
        String brief = request.getParameter("brief");       //简介

        JSonMessage message = new JSonMessage();
        message.addProperty(RESULT_FLAG, RESULT_FAIL);
        if (StringUtil.isEmpty(name) && StringUtil.isEmpty(keyWord) && StringUtil.isEmpty(brief)) {
            message.addProperty(Message, "缺少必要参数");
            return message;
        }

        activityTypeMapper.addActivityType(name, keyWord, brief);

        message.addProperty(RESULT_FLAG, RESULT_OK);
        message.addProperty(Message, "添加成功！");

        return message;
    }

    /**
     * 商品分类列表
     *
     * @return
     */
    @Override
    public JSonMessage getActivityTypeList() {

        JSonMessage message = new JSonMessage();
        message.addProperty(RESULT_FLAG, RESULT_FAIL);

        List<ActivityType> activityTypeList = activityTypeMapper.getActivityTypeList();
        List<Map> list = new ArrayList<Map>();
        if (activityTypeList.size() <= 0) {
            message.addProperty(RESULT_FLAG, RESULT_OK);
            message.addProperty(Data, list);
            message.addProperty(Message, "暂未添加商品分类");
            return message;
        }


        for (ActivityType activityType : activityTypeList) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("id", activityType.getId());
            map.put("name", activityType.getName());
            map.put("keyWord", activityType.getKeyWord());
            map.put("brief", activityType.getBrief());
            list.add(map);
        }

        message.addProperty(RESULT_FLAG, RESULT_OK);
        message.addProperty(Message, "查询成功！");
        message.addProperty(Data, list);
        return message;
    }

}
