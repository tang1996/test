package com.yf.piano.util.config;

/* *
 *类名：BaiduConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 */

import com.baidu.aip.face.AipFace;
import org.json.JSONObject;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.HashMap;

public class BaiduConfig {
    //设置APPID
    public static final String APP_ID = "你的 App ID";
    //AK
    public static final String API_KEY = "你的 Api Key";
    //SK
    public static final String SECRET_KEY = "你的 Secret Key";

    public static void main(String[] args) {
        // 初始化一个AipFace
        AipFace client = new AipFace(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
//        client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
//        client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理

        HashMap<String, String> options = new HashMap<String, String>();
        /**
         * 图片质量控制
         * NONE: 不进行控制
         * LOW:较低的质量要求
         * NORMAL: 一般的质量要求
         * HIGH: 较高的质量要求
         * 默认 NONE
         */
//        options.put("quality_control", "NORMAL");
        /**
         * 活体检测控制
         * NONE: 不进行控制
         * LOW:较低的活体要求(高通过率 低攻击拒绝率)
         * NORMAL: 一般的活体要求(平衡的攻击拒绝率, 通过率)
         * HIGH: 较高的活体要求(高攻击拒绝率 低通过率)
         * 默认NONE
         */
//        options.put("liveness_control", "LOW");

        //图片信息(总数据大小应小于10M)，图片上传方式根据image_type来判断
        String image = "取决于image_type参数，传入BASE64字符串或URL字符串或FACE_TOKEN字符串";
        /**
         * 图片类型
         * BASE64:图片的base64值，base64编码后的图片数据，编码后的图片大小不超过2M；
         * URL:图片的 URL地址( 可能由于网络等原因导致下载图片时间过长)；
         * FACE_TOKEN: 人脸图片的唯一标识，调用人脸检测接口时，会为每个人脸图片赋予一个唯一的FACE_TOKEN，同一张图片多次检测得到的FACE_TOKEN是同一个。
         */
        String imageType = "BASE64";
        //身份证号（真实身份证号号码）
        String idCardNumber = "110233112299822211";
        //utf8，姓名（真实姓名，和身份证号匹配）
        String name = "张三";

//        MultipartFile file = new MultipartFile();
//        Base64.Encoder encoder = Base64.getEncoder();
//        String base64EncoderImg = file.getOriginalFilename()+","+ encoder.encode(file.getBytes());

        // 身份验证
        JSONObject res = client.personVerify(image, imageType, idCardNumber, name, options);
        System.out.println(res.toString(2));

    }

}