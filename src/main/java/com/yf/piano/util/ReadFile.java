package com.yf.piano.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static String readFileContent() {
        String fileName = "C:\\Users\\Administrator\\Desktop\\a.mml";
        File file = new File(fileName);
        BufferedReader reader = null;
        StringBuffer sbf = new StringBuffer();
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempStr;
            while ((tempStr = reader.readLine()) != null) {
                if (tempStr.indexOf("/*M") != -1) {
                    if (tempStr.indexOf("/*M 0  */") != -1) {
                        sbf.append("\n" + tempStr);
                    } else {
                        sbf.append(tempStr);
                    }

                }

            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return sbf.toString().replaceFirst("\n", "").replaceAll(" ", "");
    }
}
