package utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

	private static final String[] digital = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};

	public void md5(String password) throws Exception{
		//获取封装MD5算法的核心类
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		//将明文经过MD5加密后变成长度为16的字节数组----->32位的字符串（16进制）
		byte[] bytes = md5.digest(password.getBytes("UTF-8"));
		//用来保存最终的密文
		String miWen = "";
		for(byte b : bytes){
			int temp = b;
			if(temp < 0){
				temp += 256;
			}
			//经过判断后temp一定是正数（0~15之间）
			int index1 = temp / 16;  // 取商
			int index2 = temp % 16;  //取余
			miWen += digital[index1] + digital[index2];
		}
		System.out.println(miWen);
	}
}
