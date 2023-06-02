package sec02;

import java.io.UnsupportedEncodingException;

public class ECUKRvsMS949 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//EUC-KR  vs  MS949 - 아스키 코드 1Byte / 한글 2Byte
		//EUC-KR 맞춤법에 표기된 글자만 지원, MS949 전체 글자(조합한 한글문자 지원) 지원
		byte[] b1 ="뷁".getBytes("EUC-KR");
		byte[] b2 ="뷁".getBytes("MS949");
		System.out.println("EUC-KR 뷁 글자 분해 길이 : " + b1.length);
		System.out.println("MS949 뷁 글자 분해 길이 : " + b2.length);
		System.out.println(new String(b1, "EUC-KR"));
		System.out.println(new String(b2, "MS949"));
		System.out.println();
	
		//UTF-8  > 아스키코드(영문,특수문자 등등) 1Byte / 한글 3Byte
		byte[] b3 ="가나다".getBytes("UTF-8");
		System.out.println("UTF-8 글자 분해 길이 : " +  b3.length);
		System.out.println(new String(b3, "UTF-8"));
		System.out.println(new String(b3, "MS949"));
		
		
	}

}
