package com.yf.piano.util;

public class Test {

    //延时=一分钟/曲速/音长*分音（毫秒）
    //60*1000/100*（100/曲速）*（4/数字）
    //600*（100/曲速）*4/数字
    //60000*4/曲速/数字
    //240000/曲速/数字

    public static void main(String[] args) {
        int speed = 0;
        String theme = "";
        String chord = "";

        //读取mml文件
        String readStr = ReadFile.readFileContent();
        String[] readStrArr = readStr.split("\n");
        //赋值曲速
        speed = Integer.valueOf(readStrArr[0].substring(7));
        //赋值主旋律
        theme = readStrArr[1];
        //赋值和弦
        chord = readStrArr[2];
        for (int i = 0; i < 3; i++) {
            String str = readStrArr[i];
            System.out.println("数组" + i + "内容为：" + str);
        }

        System.out.println(speed);


    }

}
