package com.sist.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * Matcher
 * 	macheres() : 전체 문자열이 패턴과 완전히 일치하는지
 * 	find() : 부분 문자열이 패턴과 일치하는지
 * 	group() : 마지막으로 매칭된 문자열(그룹) 을 반환
 * 	start() : 마지막으로 매칭된 문자열의 시작 인덱스를 반환
 * 	end() : 마지막으로 매칭된 문자열의 끝 인덱스 바로 다음 위치(+1)를 반환
 * 	resplaceAll() : 패턴에 일치하는 모든 부분을 치환
 */
public class 라이브러리_정규식표현법_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="비밀번호: 1234 , 또 다른 비밀번호: 567";
		String regex="\\d+";
//		String result=msg.replaceAll(regex, "****");
//		System.out.println(result);
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(msg);
		while(m.find())
		{
			System.out.println("비밀번호:"+m.group());
		}
		
	}

}
