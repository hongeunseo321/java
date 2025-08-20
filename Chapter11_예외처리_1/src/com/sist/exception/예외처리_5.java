package com.sist.exception;
/*
 * 간접 처리 : throws
 * 	=> 예외 회피 => 컴파일 통과를 위해 시스템에 알려준다
 * 		=> 예외 떠맡기기
 *         ----------
 *         처리 => 메소드 호출 시에 개발자가 처리
 *         애매한 상태
 *         -------- 
 *         1) 에러가 예측이 안 되는 상태
 *         2) 메소드 처리 => 소스량이 많은 경우
 *  형식)
 *  	public void display() throws 예외처리클래스,예외처리클래스...
 *                                   ------------------------
 *                                    순서 상관없이 콤마로 구분한다
 *      public void aaa()throws Exception
 *      {
 *      	display();
 *      }
 */
public class 예외처리_5 {
	// 예외 선언
	public static void display() throws NumberFormatException,
	ArrayIndexOutOfBoundsException,Throwable
	{
		System.out.println("display Call...");
	}
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub        --------- 더 커야한다
		try
		{
			display();
		}catch(Throwable a) {} // 복구가 필요하면 try를 사용
	}

}
