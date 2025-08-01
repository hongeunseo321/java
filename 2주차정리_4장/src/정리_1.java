/*
 * 자바 학습
 * 	1단계 : 자바 기초 문법
 * 	(초급)	= 변수 / 데이터형
 *            변수 : 재사용 => 처리
 *            -----------------
 *            => 관련된 데이터 : 배열
 *            => 문제를 보고 변수를 잡는 연습
 *            => 웹을 보고 변수를 잡는 연습
 *            => 이미지를 보고 변수를 잡는 연습
 *            데이터 저장 == 데이터 연산 처리 == 프로그램 제어
 *                |                             |
 *               한 개 => 변수                   출력
 *               1. 메모리 크기
 *                  ---------
 *                  데이터형
 *                  = 정수 : int / long
 *                  = 실수 : double
 *                  = 논리 : boolean (true/false)
 *                  = 문자 : char
 *                  = 문자열 : String           
 *               ------------------------------- 
 *               2. 데이터 가공 (사용자 요청)
 *               	=> 연산자
 *               		단항 : ++, --, !, ()
 *                            ------------- 형변환 (클래스)
 *                      이항
 *                      	산술 : +, -, *, /, %
 *                      	비교 : ==, !=, <, >, <=, >=
 *                      	논리 : &&, ||
 *                      	대입 : =, +=, -=
 *                      삼항 : (조건)?값1:값2
 *                      
 *                      ==> 요청 => 통계 / 합... 산술
 *                      ==> 비교연산자 => 체크박스
 *                      ==> 논리 => 두 개의 정보
 *                      ==> 삼항은 출력 => if~else
  *                   	JSTL
 *                   	<c:if test="curpage>1">
 *                     	<a href="...?page=<%=curpage-1%>">
 *                   	</c:if>
 *                   
 *                   	<%
 *                      	if(curpage>1)
 *                      	{
 *                   	%>
 *                        	<a href="...?page=<%=curpage-1%>">
 *                   	<%
 *                      	}
 *                      	else
 *                      	{
 *                   	%>
 *                        	<a href="...?page=<%=curpage%>">
 *                   	<%
 *                      	}
 *                   	%>
 *                   
 *                   	<a href="...?page=<%=curpage>1?curpage-1:curpage%>">
 *                      
 *               관련된 것을 묶는다
 *               - 같은 데이터형 => 배열
 *               - 다른 데이터형 => 클래스
 *               --------------------- 메모리(RAM)에 저장
 *               => 영구적인 저장 장치 
 *               => 파일 => 노출 위험 (보안 취약)
 *               => RDBMS => MySQL, Oracle DB...
 *          = 연산자
 * 			= 제어문
 * 				# 조건문
 * 				# 반복문
 * 			= 배열
 * 	2단계 : 메소드와 클래스 기초
 * 	(중급)	= 메소드 정의와 호출
 * 			= 매개변수 / 리턴값 => 라이브러리
 * 			= 클래스 선언 / 객체 생성
 * 			= 멤버변수 / 멤버메소드
 * 			= 생성자 / this, super
 * 	3단계 : 객체지향 프로그램 (OOP)
 * 			= 접근 제어어
 * 			= 상속, 오버라이딩 / 오버로딩
 * 			= 추상 클래스 / 인터페이스
 * 			= 다형성 (수정, 추가), 클래스형변환
 * 			= static, final, abstract
 * 	4단계 : 자바 활용 / 실전
 * 			= 예외처리
 *            ------ 11장***
 * 			= 라이브러리
 * 				# 컬렉션 프레임워크
 * 				# 자바 입출력 (파일, 네트워크, 메모리)
 * 				# 데이터베이스 연동 
 * 	5단계 : 주제별 프로젝트 => 실무 연계 
 * 			= Swing / javaFx
 * 			= Thread => 동기화
 * 	------------------------------------------------------
 * 	6.5개월
 * 		26주 => 6주 : 자바 / 3주 : 오라클 / 1주 : 프로젝트
 * 		16주 => 3주 : HTML / CSS / JavaScript 
 * 		13주 => 2주 : Jquery / Ajax
 * 		11주 => 3주 : JSP
 * 		8주 => 4주 : ***Spring
 *  	4주 => 3주 : ***CI/CD
 *  	1주 => 개인 프로젝트
 *  	
 *  	*** JPA / Mybatis  / Spring-Security / JWT (SNS)
 *  		
 *  	VueJS / Vuex / Pinia
 *  	React / Redux / TanStackQuery / TypeScript
 *  ------------------------------------------------------
 */
public class 정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=2,c=3,d=4,e=5,f=6,k=8,m=10,n=20,o=30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(k);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o); // (X)
		
		// arr[0] [1]...
		int[] arr= {1,2,3,4,5,6,7,8,10,20,30};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		} // (O)
		
		
		int aa=10;
		int bb=20;
		
		int max=aa;
		if(max<bb)
			max=bb;
		System.out.println(max); // (X)
		
		System.out.println(Math.max(aa,bb)); // (O)
	}

}
