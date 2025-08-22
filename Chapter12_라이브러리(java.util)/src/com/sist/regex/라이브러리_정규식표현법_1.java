package com.sist.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 정규식 : 문자의 패턴을 만드는 과정
 *        -------------------
 * => [] => 한 개의 문자 [a] 
 * 			[abc] a|b|c
 *       	[abcd...z] => [a-z]
 *       	[ABCD...Z] => [A-Z]     
 *       => 알파벳 전체  => contains
 *       	[a-zA-Z]
 *       => 알파벳 시작  => startsWith
 *       	^[a-zA-Z]
 *       => 알파벳 끝 
 *       	[a-zA-Z]$ => 1234A
 *       => 알파벳 제외
 *       	[^a-zA-Z]
 *       
 *       --------------------------
 *       숫자 [0-9] => 숫자 전체
 *       한글 [가-힣] => 한글 전체
 *       [] => ^(시작, 제외) $(끝 문자)
 *       --------------------------
 *       
 *       \d : 숫자 전체 => [0-9] 
 *       \D : !숫자 전체 => [0-9] 
 *       \s : 공백 
 *       \S : !공백 
 *       \w : 한 개의 알파벳 / 숫자 => [a-zA-Z0-9] 
 *       \W : 특수문자
 *       
 *       + : 1개 이상의 문자
 *            예) 맛있어서, 맛있는, 맛있고... => 맛있+ 
 *       * : 0개 이상의 문자
 *            예) 짜, 짜다, 짜고, 짜서... => 짜*
 *       . : 1개의 아무 문자
 *       ? : 0이나 1개
 *       {n} : 정확히 n개 
 *              예) \d{4} => 1234
 *       {n,} : 최소한 n개
 *               예) a{2,} => a, aa
 *       {n,m) : n개부터 m개까지 
 *                예) a{2,4} => aa, aaa, aaaa
 *       => 정규식 : 검색 => 자바스크립트, 오라클
 *       
 *       예) EN IN KN
 *       WHERE ename LIKE '%EN%' OR ename LIKE '%IN%'
 *       	OR ename LIKE '%KN%'       
 *       정규식 표현 => WHERE PEGEXP_LIKE(ename, 'EN|IN|KE')
 *       
 *       () => 그룹핑 => (ab)+ => abab
 *       ------------------------------------------------
 *        table
 *          |
 *         tr
 *          |
 *       -------
 *       |     |
 *       th   td
 *       -------
 *       (tr)+
 *       (th|td)+  => loose.dtd <!DOCTYPE html>
 *       
 *       예) ip
 *           211.238.142.124
 *           --- --- --- ---
 *           1~3 1~3 1~3 1~3개의 숫자 => 255
 *           
 *           127.0.0.1
 *           211 63.64.1
 *           
 *           [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
 *           자바식 => \\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\
 *            \d : [0-9]
 *            ** 실제 특수문자를 갖고 올 경우 앞에 \\를 넣는다
 *       
 */
public class 라이브러리_정규식표현법_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ips={
			"211.238.142.124",
			"127.0.0.1",
			"010.1111.1111",
			"1234.1235",
			"111.111.111.0"
		};
//		String s="[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}";
		String s="\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
		Pattern p=Pattern.compile(s);
		for(int i=0;i<ips.length;i++)
		{
			Matcher m=p.matcher(ips[i]);
			if(m.find())
			{
				System.out.println(ips[i]);
			}
		}
	}

}
