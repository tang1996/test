package com.yf.piano.util;

import java.util.Random;
/**
 * @author Tyy
 * token随机生成工具
 */
public class TokenUtil {
	/**
	 * JAVA获得0-9,a-z,A-Z范围的随机数
	 * 
	 * @param length
	 *            随机数长度
	 * @return String
	 */
	public static String getRandomChar(int length) {
		char[] chr = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
				'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D',
				'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y',
				'Z' };
		Random random = new Random();
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < length; i++) {
			buffer.append(chr[random.nextInt(62)]);
		}
		return buffer.toString();
	}
	
	/**
	 * JAVA获得0-9,a-z,A-Z范围的随机数
	 * 
	 * @param length
	 *            随机数长度
	 * @return String
	 */
	public static String getRandomNum(int length) {
		char[] chr = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		Random random = new Random();
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < length; i++) {
			buffer.append(chr[random.nextInt(10)]);
		}
		return buffer.toString();
	}

}
