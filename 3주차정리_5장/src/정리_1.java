/*
 * 1. 기본
 * 	  --- 변수(데이터형) / 연산자 / 제어문
 * 	1) 변수 / 상수
 * 	    |     |여러 개 => 열거형 (생성자)
 *      |여러 개 => 배열
 *     = 변수 : 수정이 가능
 *     = 상수 : 수정이 불가능 => final
 *     = 변수 : 한 개의 데이터를 저장하는 메모리 공간
 *       --- 메모리 크기 결정
 *           -------- 데이터형
 *	2) 데이터형
 *		기본형 : 메모리에 데이터형
 *			정수 저장
 *				byte => 8bit => 네트워크 송수신 / 웹
 *				int => 32bit => 일반 정수 => default
 *				long => 64bit => 금융권 / 증권
 *			실수 저장
 *				double => 64bit => 소수점 15자리
 *				       => 일반 실수 => 건축 => 정밀도
 *			논리 저장
 *				boolean => 8bit => 조건 / 반복
 *			문자 저장
 *				char => 16bit => 양수만 사용
 *			            0~65535
 * 	-------------------------------------------
 * 	참조형 : 여러 개 데이터를 저장하는 경우 => 주소
 *         -----------
 *         배열 / 클래스
 *               ---- String 문자열
 *  ** String : 문자열 여러 개 저장
 *  클래스형 => 메소드 지원
 *  	= 비교
 *  		1) equals : 대소문자 비교
 *  			로그인 / 회원가입
 *  			** boolean equals(String s)
 *  			   -------       ----------
 *  				리턴형         비교대상 문자
 *  		2) contains : 대소문자 구분 => 포함 여부
 *  			검색
 *  			** boolean contains(String s)
 *                                 ----------
 *                                   포함 문자
 *          3) startsWith : 대소문자 구분 => 시작 문자열
 *          	자동 완성기 / 쿠키 찾기
 *          	** boolean startsWith(String s)
 *          	                     ----------
 *                                    시작 문자열
 *          4) endsWith : 대소문자 구분 => 끝 문자열
 *          	이미지의 확장자
 *          	** boolean endsWith(String s)
 *                                 ----------
 *                                  끝 문자열
 *		= 제어
 *			1) substring : 자르기
 *				=> CSS
 * 				=> 우편번호 / 주소 / 생성 AI
 * 				=> 오버로딩 
 * 					같은 이름의 메소드가 여러 개 존재
 * 					** 메소드명이 동일하다
 * 					** 리턴형과는 관계가 없다
 * 					** 매개변수의 개수가 다르다
 * 					** 매개변수의 데이터형이 다르다
 * 					** 비슷한 기능
 * 						print(int a) => printInt()
 * 						print(byte b) => printByte()
 * 						print(short c) => printShort()
 *				--------------------------------------
 *				** 원형
 *					String substring(int beginIndex)
 *					=> 지정된 위치에서 마지막 문자까지 자른다
 *					=> 웹 => 필요(MVC)
 *					=> 브라우저에서 서버 연결 : URL 주소		
 *						login.jsp?id=aaa&pwd=1234
 *
 *					String substring(int beginIndex,int endIndex)
 *                                   -------------- ------------
 *                                        포함           미포함
 *                                                   endIndex-1
 *              => 문자열의 원형은 변경되지 않는다 
 *              
 *		= 찾기
 *			1) indexOf : 지정된 문자나 문자열의 인덱스 번호 확인
 *                        => 앞에서부터				
 *				** int indexOf(char c)
 *				** int indexOf(String s)
 *	
 *			2) lastindexOf : 지정된 문자나 문자열의 인덱스 번호 확인
 *                            => 뒤에서부터
 *				** int lastindexOf(char c)
 *				** int lastindexOf(String s)
 *
 *				https://www.google.com/search?q=%EC%9E%90%EB%B0%94&oq=%EC%9E%90%EB%B0%94&gs_lcrp=EgZjaHJvbWUyDwgAEEUYORiDARixAxiABDIGCAEQRRg7MgYIAhBFGDsyBggDEEUYOzINCAQQABiDARixAxiABDIHCAUQABiABDINCAYQABiDARixAxiABDIKCAcQABixAxiABDIKCAgQABixAxiABDIHCAkQABiABNIBCTE2NTZqMGoxNagCCLACAQ&sourceid=chrome&ie=UTF-8     
 *
 *		= 변환
 *			1) replace : 문자나 문자열
 *				오라클에 데이터 추가
 *				** String replace(char c,char c1)
 *                                ------ -------
 *                                찾는 문자,변경할 문자
 *                                ('a','b') => Jbvb
 *              ** String replace(String s,String s1)
 *                                -------- ---------
 *                                Hello Java
 *                                ("Java","Oracle")
 *                                => Hello Oracle
 *             	=> 오라클 &(입력)를 &amp;로 치환
 *             		크롤링 / 네트워크에서 채팅
 *             	            \n => \t
 *             
 *			2) replaceAll : 문자나 문자열 => 정규식(regex)
 *				** String replaceAll(String regex,String s)
 *		
 *			3) trim : 공백 문자 제거 => 좌우의 공백 문자
 *				로그인 / 회원가입 / 글 쓰기 / 검색
 *				** String trim()
 *		
 *			4) valueOf : 모든 데이터형을 문자열로 변환
 *				** String valueOf()
 */
public class 정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 웹에서 substing으로 로그인 되는 과정
		String url="http://localhost:8080/member/login.jsp?id=admin&pwd=1234";
		String s=url.substring(url.lastIndexOf("/")+1,url.indexOf("?"));
		System.out.println(s);
		
		s=url.substring(url.indexOf("=")+1,url.indexOf("&"));
		System.out.println(s);
		s=url.substring(url.lastIndexOf("=")+1);
		System.out.println(s);
		System.out.println(url);
		// getRequestParam("id")
		
		String ss="blue|black|yellow|pink|grean";
		String[] data=ss.split("\\|"); // regex 정규식이 있으면 이중 이스케이프
		for(String sss:data)
		{
			System.out.println(sss);
		}
		
		
	}

}
