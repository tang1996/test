package com.yf.piano.util.config;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 */

import org.springframework.beans.factory.annotation.Value;

public class AlipayConfig {
    /**
     * 企业配置
     */
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2019040963861115";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCsTPOqpkgFWtsicN3Q/6aW3EtV2YGku+Rdzsl/8pfLM3gp9kFUEShNvUaoddCH8SH4cBYO+ZuoZEjMbhSBOrM6bMvrel5Oqxby+P4BfDLJpRlOGsW6RWJj1zTDmQ5ELf1W6Y5dDb5lKHeLLLlNUTwaY37q7w8Ut3rpfmIZducUfHGeGI6qFxoGxuSZfuWGmoUEy6FMFjMKuHwgTy6F2kivldUdPFtGocU9WlJoVz8Lu8i76V6l0nMG4lZ4BRqnzdWmYrd1LV+aaWBWsCRHy+mOzqjS70XBX7COsQnRjpqxl/oyH1uFLbO+q5BUMU80mYloQ8CEHXAn4a8sD1F8qxQZAgMBAAECggEACLvV1h6bo/nZBcPm2oM69IayIuXllm4Xw1GKETxAyYIQY0AiS5qbCmW/wSZHrbxhVnCIDbZFV6HNtt8Vlv9cumdtZsBLK32sqiBI79ZV1LbTs4vT3f9KX3k3KXsGqBoUr2UjXEAoGISWmq1nry2g+E12z33Sq+ApENDhNB081WLsKRy4C4ZK5KJf/ldmVbz0AOy+MC/rUYpeuXTYqP2ekgSCuwat8qEG0qJD2h1JeZuxm6hoCx5lG8xLSP/02G6VRbQ7FIa7FZ9JvfervA1tdFmfYZ1YOPCB+oIFe5LyzymhSoyhmQfAHmh7IvzROm912WssAgy2dbh7JyWfMxJnoQKBgQDZ0V2HrbRT0HNsD7QUxbfQn0EXOS12GdmVsOQPlJfWSdt5qDEOg7j3pjJTemQW0MivSo4RiOf/YJHnx9budtspUBpkIjjerXjuPZXvFbTpqYV4l+BqyiR5+oGEKM53p1m/VmqBuSw1kebed2yv2GY1KbP9QDn89Kk6fm8/OvxgZQKBgQDKgPznN7KUDOxQQbV+hIYYli/UIsaPhBVJFoWfCDPWwpTY8ym9yZ2h/+Bx4HQJViO1d13KTFoslWgVgTshhtbMrlNcqtIChEKkjdHK3xThPfpzpETPsVtauEArEMBC72RDebCGIjYdX23NzL4h9faVEBdvosX5Gbex5OVmgkp3pQKBgQCvkl1Lsi56qLmAzx+e5siFtvimmYYVfjyutkj+bg39wsbQR0xToMWFiUdjlnH7GgvJj9T4OVyXsuWo6KJM0S1THahIMnWYuEeT8bxbXSnYdraJQBK6wXmpgMzJFINoW1KyMhvjuLjz7Ukk5SqMi2fHTngwmIalaSjHZ4aQdyFbKQKBgCc1PEJEXXYe3m5Xmp1paVE/WvlW1l0ZNMnW6340J11QhWNQCWfurm+cTEegLrdUD0vmVamCiP8S2nk3cUx3gAVXR1qs1EaadxDHSLRf5voJdwGG76/K5iY1gG8WKjOLiD0sRYpi+1lKjccH+lQ2/Ew2NmNt/6jQWum9qNDlLyflAoGAOaYmhYfmQEpNcUWG552k+GPw8ZmT/INl8N1rnm06cQag/TZGV7c+CL9lTvFa2q2qDfSl7aLX7fn6THYTar99ZJmojhXk8BPWmY8pv5UlodmtIayQmR0HFkqCECnCcBHDxrpTVzwWz7eTidLrGzVX4kE+SqtTqDNRg16ph0SUVp4=";

    // （应用公钥）支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwCkxaVSOlgnfqSHJg7C61lh+tjygvgtmaUyzTQ33G2zyyamWpdJFz/ETDbw9tytqQ1WcMaWlarOyLojewolB2C2z/BCd9enxjG4SRFkz+nzIdo1comdcEbgL0wmIOQCK2gowELiJBiyQQhusrPnijJuWLLwQSfkKKmYz4tsSG0KhEM478ypigg5zVcxeges0GzTeNK6w3fEH8sZV0lYRGgIxdLNZmy0EntVXRXXcJWV8HhxHK4Yby3Lx7dZRvTKa/6Zmw5hGK26l8Ck6j0Lgg+4a+AOPgNlS2NLntx5inGQdp4JYjFMAL1M9KB78Uo86s/O8Hjo0eJHSxsVRIOzezwIDAQAB";
    //支付宝公钥

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
//    public static String notify_url = ParamConfig.NOTIFY_URL;

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
//    public static String return_url = ParamConfig.RETURN_URL;

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";


    /**
     * 个人配置
     */
    // 地域ID
    public static String regionId = "cn-zhangjiakou";

    // AccessKey ID
    public static String AccessKeyID = "LTAI4FxyVv6XCmJF4MLjdrQe";

    // AccessKey Secret
    public static String AccessKeySecret = "jYy3DNHA1jrnuMTKAjikcDCx6ac5tG";

    // Endpoint
    public static String endpoint = "https://oss-cn-shenzhen.aliyuncs.com";

    // Bucket
    public static String bucketName = "yfeng";

}