package 자바기본문법;
/*
 *		숫자
 *		 = 정수
 *		   = 2진법 => 1000 => 0b1111
 *							 --
 *		   = 8진법 => 111 => 0111
 *							-
 *		   = 10진법 => 1000 , 345 ...
 *		   = 16진법 => 0x111
 *					  --
 *		   = 21억 4천 정도 인식
 *		     => 이상을 넘어가면 : ~L(l)
 *		 = 실수
 *		   = 10.5 , 100.23...
 *		문자
 *		 = 문자 한 개 저장
 *		   'A' , '홍' , '심' ... => 모든 국가의 언어 사용이 가능
 *		    => Unicode : 한 글자 2바이트 => 멀티바이트
 *		문자열
 *		 = 문자 여러 개
 *		   "홍은서"
 *		논리형
 *		 = true / false
 *		특수문자
 *		 = \t => tab 일정 간격
 *		 = \n => sew line => 줄 바꿈
 *		 = \" => " 출력
 *		 = \\ => \ 출력 => 경로명
 *
 *		실행 과정
 *		-------
 *		프로그램 구동
 *		----------
 *		컴파일 : java / C# / C , C++ => 컴퓨터가 인식하는 언어로 변경
 *		인터프리터 : 한 줄씩 읽어서 출력
 *				   HTML / JavaScript / Python
 *					javac
 *					컴파일
 *		A.java ===============> 컴퓨터 인식 언어로 변경
 *		원시소스					| 010101010
 *		|프로그래머만 알고 있는 언어	  010101010
 *									  |
 *								   A.class (바이트 코드)
 *									 |
 *									 | Java (인터프리터)
 *								     한 줄씩 읽어서 출력
 *		=> 문법 : 컴파일 에러
 *		=> 실행 시 에러 : 인터프리터 에러
 *		---------------------------
 *		C/C++ : 저급언어 => 하드웨어
 *		Python : 고급언어 => 소프트웨어
 *		java : 고급언어
 *		코볼 / 포트란 : 고급언어
 */
public class 자바표현식_실행과정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(0b1000);
		System.out.println(0111);
		System.out.println(0x111);
		System.out.println(2500000000L);
		System.out.println(10.5);
		System.out.println('홍');
		System.out.println('은');
		System.out.println('서');
		System.out.println("홍은서");
		System.out.println(true);
		System.out.println(false);
		System.out.print("Hello\tjava!!");
		System.out.print("\nHello Java!!");
		System.out.println("\"홍은서\""); //"홍길동"
		System.out.println("C:\\javaDev\\javaStudy\\자바기본문법\\src\\자바기본문법\\자바표현식_실행과정.java");
		
	}

}
