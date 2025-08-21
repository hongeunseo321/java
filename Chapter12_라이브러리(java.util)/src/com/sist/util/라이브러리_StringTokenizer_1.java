package com.sist.util;
/*
 * util : 유용한 클래스의 집합
 * 	1) StringTokenizer : 문자 분해***
 * 	2) Collection***
 * 		List형 => 순서를 가지고 있다(인덱스), 데이터 중복 허용
 *		 => 데이터베이스(비동기)
 *              |        네트워크의 접속자 저장(동기)
 *              |        |                   |
 * 			ArrayList, Vector, LinkedList, Queue
 * 
 * 		Set형 => 순서가 없다, 데이터 중복 허용 X
 * 			HashSet, TreeSet
 * 
 * 		Map형 => 순서가 없다, 쌍으로 이루어져 있다 (키,값)
 * 			HashMap (동기), Hashtable (비동기)
 * 	------------------------------------------------ 핵심
 * 	3) Data / Calendar : 날짜 관련 
 * 	
 * 
 * StringTokenizer : 구분자별로 문자열을 나눠주는 역할
 *  1) 생성자 => 구분
 *  2) countTokens() : 분리한 단어의 개수
 *  3) hasMoreTokens : 루프 사용 시 (반복문)
 *      => 분리된 단어가 몇 개인지 모르는 경우
 *      => 개수가 명확하지 않은 경우
 *  4) nextToken : 분리된 단어를 읽어올 경우 
 *       
 *       
 */
import java.util.*;
public class 라이브러리_StringTokenizer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String colors="red,green,blue,black,yellow,pink,magenta";
		StringTokenizer st=new StringTokenizer(colors,",");
		System.out.println("Color 개수:"+st.countTokens());
//		System.out.println("1' 색상:"+st.nextToken());
//		System.out.println("2' 색상:"+st.nextToken());
//		System.out.println("3' 색상:"+st.nextToken());
//		System.out.println("4' 색상:"+st.nextToken());
//		System.out.println("5' 색상:"+st.nextToken());
//		System.out.println("6' 색상:"+st.nextToken());
//		System.out.println("7' 색상:"+st.nextToken());
//		for(int i=0;i<=st.countTokens();i++)
//		{
//			System.out.println(i+"' 색상:"+st.nextToken());
//		}
		int i=1;
		while(st.hasMoreElements())
		{
			System.out.println(i+"' 색상:"+st.nextToken());
			i++;
		}
	}

}
