package com.yf.piano.util;

public class MusicAnalysis {

    // 键盘对应窗口坐标
    private final static String noteQ = "206,825";
    private final static String noteW = "476,825";
    private final static String noteE = "746,825";
    private final static String noteR = "1016,825";
    private final static String noteT = "1286,825";
    private final static String noteY = "1556,825";
    private final static String noteU = "1826,825";
    private final static String noteA = "206,930";
    private final static String noteS = "476,930";
    private final static String noteD = "746,930";
    private final static String noteF = "1016,930";
    private final static String noteG = "1286,930";
    private final static String noteH = "1556,930";
    private final static String noteJ = "1826,930";
    private final static String noteZ = "206,1035";
    private final static String noteX = "476,1035";
    private final static String noteC = "746,1035";
    private final static String noteV = "1016,1035";
    private final static String noteB = "1286,1035";
    private final static String noteN = "1556,1035";
    private final static String noteM = "1826,1035";
    // 休止符
    private final static String noteO = "0,1000";

    public static void main(String[] args) {
        String name = "音符测试";
        String speed = "100";
        String sign = "4";
        String textArea = "Q4W4E4R4T4Y4\rU4A4&A8S4D4F\n4G4Z4X4C4V4B4         &B4Q4.W4";
        String text = "";
        System.out.println(textArea);
        textArea = textArea.replaceAll(" ", "").replaceAll("\r", "").replaceAll("\n", "");
        while (textArea.indexOf("&") != -1) {
            textArea = textArea.substring(0, textArea.indexOf("&")) + "+"
                    + textArea.substring(textArea.indexOf("&") + 2);
        }

        System.out.println(textArea);
        for (int i = 0; i < textArea.length(); i++) {
            String str = String.valueOf(textArea.charAt(i));
            if ("Q".equals(str) || "W".equals(str) || "E".equals(str) || "R".equals(str) || "T".equals(str)
                    || "Y".equals(str) || "U".equals(str) || "A".equals(str) || "S".equals(str) || "D".equals(str)
                    || "F".equals(str) || "G".equals(str) || "H".equals(str) || "J".equals(str) || "Z".equals(str)
                    || "X".equals(str) || "C".equals(str) || "V".equals(str) || "B".equals(str) || "N".equals(str)
                    || "M".equals(str) || "O".equals(str)) {
                text = text + "|" + str;
            } else {
                text = text + str;
            }

        }

        System.out.println(text);

        String[] syllable = text.substring(1).split("\\|");
        for (String arr : syllable) {
            System.out.println(arr);
            for (int i = 0; i < arr.length(); i++) {
                String str = String.valueOf(arr.charAt(i));
                switch (str) {
                    case "Q":
                        text = text + "list=list&\"" + noteQ;
                        System.out.println(noteQ);
                        break;
                    case "W":
                        System.out.println(noteW);
                        break;
                    case "E":
                        System.out.println(noteE);
                        break;
                    case "R":
                        System.out.println(noteR);
                        break;
                    case "T":
                        System.out.println(noteT);
                        break;
                    case "Y":
                        System.out.println(noteY);
                        break;
                    case "U":
                        System.out.println(noteU);
                        break;
                    case "A":
                        System.out.println(noteA);
                        break;
                    case "S":
                        System.out.println(noteS);
                        break;
                    case "D":
                        System.out.println(noteD);
                        break;
                    case "F":
                        System.out.println(noteF);
                        break;
                    case "G":
                        System.out.println(noteG);
                        break;
                    case "H":
                        System.out.println(noteH);
                        break;
                    case "J":
                        System.out.println(noteJ);
                        break;
                    case "Z":
                        System.out.println(noteZ);
                        break;
                    case "X":
                        System.out.println(noteX);
                        break;
                    case "C":
                        System.out.println(noteC);
                        break;
                    case "V":
                        System.out.println(noteV);
                        break;
                    case "B":
                        System.out.println(noteB);
                        break;
                    case "N":
                        System.out.println(noteN);
                        break;
                    case "M":
                        System.out.println(noteM);
                        break;
                    case "O":
                        System.out.println(noteO);
                        break;
                    default:
                        System.out.println("未知等级");
                }


            }
        }
    }

}
