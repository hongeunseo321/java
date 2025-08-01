/*  
 * 	자바 설치
 * 	-------
 * 	1. jdk 다운로드
 * 	    http://java.jdk.net
 * 	2. 편집기
 * 	    http://eclipse.org
 * 	3. 자바 환경 설정
 * 	    => 내PC => 속성 => 고급 시스템 설정
 * 	    => classpath : 자바에서 제공하는 라이브러리 사용
 * 	    => classpath : .;c:\jdk-17.0.2\lib
 * 	    => path : 실행 => path = c:\jdk-17.0.2\bin
 * 	 =>JVM (자바 가상머신)
 *    
 * 	일반 프로그램
 * 	  프로그램
 * 		|
 * 	  운영체제
 * 		|
 * 	  하드웨어
 * -------------
 * 	자바 프로그램
 * 	  프로그램
 * 		|
 * 	   JVM => jdk => 실제 실행속도가 늦을 수 있다
 * 		|                   | 네트워크 서버(X), 인트라넷
 * 	  운영체제 					   => 사내 메신저
 * 		|
 *    하드웨어
 * 
 * 	 ------------------------------------
 * 		 JDK
 * 		 ---------
 * 			JRE		---------------------
 * 		 ---------	   Development Tool
 *  		JVM	    ---------------------
 *  	 ---------	 Development Library
 *  	  Library	---------------------
 *  	 ---------
 *  
 *    -----------------------------------
 *    1. Development Tool
 *       javac : 컴퓨터가 인식하는 언어로 변경
 *    			   (컴파일)
 *       java : 프로그램 실행 (인터프리터)
 *    			 => 한 줄씩 읽어서 출력
 *       javap : 역컴파일러 => 자바로 원상 복귀
 *       javah : header 파일 읽기 => C/C++ 연동
 *       javaw : 서버 구동 
 *       jar : 인증 / 배포
 *       	    웹 => war : maven
 *       	    자바 => jar : grable : zip => tar
 *       			    ------------
 *       			    | 라이브러리
 *    2. JRE : 라이브러리를 포함하고 있다
 *    ---------------------------------------
 *    JVM : 면접
 *    		 ---
 *    		 = 기술 면접
 *    		 = 코딩 테스트 System.out.ptintln()
 *    					 sysout (Ctrl+space)
 *    		 = 테스트지 
 *    ---------------------------------------
 *    
 *    동작 방식 (4page 이미지)
 *              javac               java
 *    A.java  =========  A.class  ========= 화면 실행
 *    프로그래머   컴파일               인터프리터
 *     	  배포 => .class 파일 => war/jar
 *        C/C++       |
 *      	   모든 운영체제에서 동일한 파일을 생성
 *      	    => 운영체제 호환성이 좋다
 *      	| 컴파일 내용이 다르다 : 해당 운영체제에서 컴파일을 다시 한다
 *    5page
 *    	자바로 제작이 가능
 *    	 1) 웹 개발 : JSP (***********)
 *    	 2) 모바일 : 안드로이드
 *    	 3) 게임 : swing / javaFx
 *    	   		 => java3D
 *    	특징 
 *    	 = 모든 운영체제에서 같은 소스로 사용이 가능
 *    	 = 객체지향 프로그램
 *    	   => 조립식
 *    	   프로그래머 / 개발자
 *    
 *    	   이미 만들어진 소스 => 조립
 *    	 = 메모리 자동 정리 : 스택 영역 (메모리 처리)
 *    	   |GC
 *    	 = 라이브러리가 풍부
 *    	--------------------------------------
 *    	소스 코딩
 *    	프로젝트명
 *    	   |
 *    		- src
 *    		   |- .java => 클래스명과 동일한 파일명
 *    			  class A => A.java
 *    			  ** 한 파일 안에 여러 개의 클래스 제작이 가능
 *    			  -------
 *    			  class A
 *    			  class B
 *    			  ------- A.java / B.java
 *    			  class A
 *    			  public class B
 *    			  -------------- B.java
 *    		- jar => 버전
 *    
 *    		=> 규칙
 *       		1. 클래스명 : 대문자 시작
 *       					 MainClass
 *       					 -	 -두 번째 단어 시작 대문자 시작
 *       			 		  => 헝거리안식 표현법
 *       			 		  => _Main : 임시 파일
 *       		2. 메소드명 : 소문자 => 기능 처리
 *       		3. 변수명 : 소문자 => 필요한 데이터를 메모리 저장
 *       		4. 인터페이스 : 대문자 => 다른 클래스 연결 (리모콘)
 *       
 *       	=> 들여쓰기 : 파이썬 / yml(설정)
 *    		=> 명령문이 종료하면 ; => 30Page
 *    		=> 필요 시에 주석 달기
 */
public class 자바정리 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}