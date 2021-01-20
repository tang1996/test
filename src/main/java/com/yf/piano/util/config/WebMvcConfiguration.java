package com.yf.piano.util.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * WebMVC 配置.
 * 添加路径和页面的映射关系
 * @author Tyy
 * @since 2018/6/13
 */
@Configuration
public class WebMvcConfiguration extends WebMvcConfigurationSupport {
    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/gotoWapPage").setViewName("gotoWapPay");       //手机支付
        registry.addViewController("/gotoPagePay").setViewName("gotoPagePay");     //PC支付
        registry.addViewController("/pagePaySuccess").setViewName("pagePaySuccess");        //PC支付成功
        registry.addViewController("/wapPaySuccess").setViewName("wapPaySuccess");      //手机支付成功
        registry.addViewController("/gotoSelect").setViewName("gotoSelect");        //订单查询

        super.addViewControllers(registry);
    }
}
