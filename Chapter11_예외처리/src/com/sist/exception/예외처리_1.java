package com.sist.exception;
/*
 * 프로그램
 *         javac
 * A.java ======= A.class ======= 실행
 * ------  컴파일  -------- 인터프리터
 * 원시소스         바이트코드
 *   |               |
 * 개발자       컴퓨터가 인식하는 언어
 *           |       |
 *      컴파일 시 에러  실행 시 에러
 *    CheckException UnCheckException
 *    -------------- ----------------
 *    |                             |
 *    컴파일 시에 예외처리 여부 확인       필요 시에만 예외처리
 *    => 반드시 예외처리                자주 에러가 나는 부분
 *    => 파일 읽기 / 크롤링
 *       네트워크 / 웹
 *       쓰레드 
 *    -------------- ----------------
 *           |              |
 *        개발자실수        사용자입력
 *     => URL 입력     => 정수 = 문자열
 *     => IP
 *     => 파일 경로
 *     => 배열의 인덱스 
 *         틀린 경우   
 *         
 *	전체
 *		에러 : 소스 수정이 불가능
 *		예외 : 소스 수정이 가능 => 가벼운 에러
 *
 *	예외처리
 *		정의 : 프로그램 실행 시에 발생할 수 있는 에러에 대비한 코드
 *            예외 => 프로그래머 실수 (디버깅)
 *                   사용자 입력 (유효성 검사)
 *                   
 *		목적 : 비정상 종료를 방지하고 정상 상태 유지
 *      ----------------------------------
 *      에러 : 심각한 에러
 *      	   => 메모리 부족 => 종료
 *      	   => 윈도우 종료
 *      예외 : 가벼운 에러 (소스상에서 수정이 가능)
 *      	   사이트 연결 => URL 주소
 *      	   파일 읽기 / 경로명의 문제
 *      	   서버 연결 => IP / PORT
 *      *** 예외처리를 하면 에러가 수정되는 게 아닌 에러를 건너뛴다
 *      
 *      => 처리
 *      	1. 예외 복구***
 *      		try ~ catch
 *      	2. 예외 회피***
 *      		throws
 *      	3. 예외 발생
 *      		throw
 *      	4. 사용자 정의
 *      		class A extends Exception
 *      	   
 *		1) 예외처리 상속 구조
 *			=> 상속 => 위로 올라갈수록 크다
 *			          Object
 *                      |
 *                  Throwable : 예외처리의 최상위 클래스
 *                      |
 *              ----------------
 *              |              |
 *            Error        Exception
 *                             |
 *              CheckException | UnCheckException 
 *                 ---------------------------
 *                 |                         |
 *            IOException             RuntimeException
 *             입출력관련                실행 시 에러
 *            => System.in                   |
 *               예외처리 필수           NumberFormatException
 *            => System.out           문자열 => 정수형 변환이 안 되는 경우 
 *               예외처리 선택            웹에서 주로 발생
 *            InterruptedException    list.jsp?page=1
 *             쓰레드 충돌               ArrayIndexOutOfBound
 *            MalformedURLException    => index 범위 초과
 *             URL 관련 => 크롤링        ClassCastException
 *            ClassNotFoundException   클래스 형변환의 문제
 *             리플렉션                  ***NullPointerException
 *             => 클래스명으로 메모리 할당    클래스의 메모리 할당이 안 된 상태
 *            SQLException              String s;
 *             => 데이터베이스 관련          s.substring()
 *                                      => 데이터베이스
 *            => java.io
 *               java.net
 *               java.sql 
 *               
 *                  
 * java.lang.Object
 * └── java.lang.Throwable   ← try-catch 최상위 클래스
 *     ├── java.lang.Error       ← 시스템 오류 (catch는 가능하나 권장 안 함)
 *     │   ├── OutOfMemoryError
 *     │   ├── StackOverflowError
 *     │   ├── VirtualMachineError
 *     │   └── ...
 *     └── java.lang.Exception   ← 일반적인 예외 (try-catch의 주 대상)
 *         ├── java.lang.RuntimeException  ← 실행 시 예외 (Unchecked)
 *         │   ├── NullPointerException
 *         │   ├── ArrayIndexOutOfBoundsException
 *         │   ├── ArithmeticException
 *         │   ├── IllegalArgumentException
 *         │   ├── ClassCastException
 *         │   └── ...
 *         ├── IOException
 *         │   ├── FileNotFoundException
 *         │   └── EOFException
 *         ├── SQLException
 *         ├── ParseException
 *         ├── InterruptedException
 *         └── ...
 *               
 *		예외처리
 *			= 예외복구
 *            try
 *            {
 *            	정상적으로 수행되는 부분
 *            	=> 지금까지 코딩한 부분
 *            }catch (예외처리 클래스)
 *            {
 *            	에러를 잡아서 복구
 *            }
 *            
 *            순서
 *            1
 *            2
 *            3
 *            try
 *            {
 *            	4
 *            	5
 *            	6 => error (6, 7 건너뛴다)
 *            	7
 *            }catch()
 *            {
 *            	8
 *            }
 *            10
 *            11
 *            12
 *            
 *            ==> 부분적
 *            
 *            try
 *            {
 *            	1
 *            	2
 *            	3
 *            	4
 *            	5
 *            }catch()
 *            {
 *            	6
 *            	7
 *            	8 => try절에서 에러가 안 났으면 catch절 수행 X
 *            } 
 */
class A
{
	
}
class B extends A
{
	
}
public class 예외처리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B(); // 자동형변환
		B b=(B)a; // 강제형변환
//		int[] arr=new int[5];
//		try
//		{
//			for(int i=0;i<=5;i++)
//			{
//				System.out.println(arr[i]);
//			}
//		}catch(Exception ex) {}
//		System.out.println("프로그램 종료!!");
	}

}
