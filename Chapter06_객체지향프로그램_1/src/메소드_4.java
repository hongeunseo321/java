/*
 * 	|한 개만 존재 => 배열 / 클래스
 * 리턴형 메소드명(매개변수...) => 선언부
 * {          -------- 데이터 묶음 (매개변수 3개 이상)
 * 		구현부               |배열 / 클래스
 * }
 * 		
 * 메소드를 가지고 있으면 클래스
 * => 일반 데이터형 / 클래스형 (String)
 * 
 * -------------------------------		
 *         메소드명
 * 		-----------
 * 요청값
 *  ==>	   매개변수
 *         -----
 *          처리 ====> 결과값 / 자체처리
 * 		-----------            |
 *                            void                       
 * --------------------------------
 *  
 * int disp(int a,int b)
 * {
 * 		메모리 할당
 * } 
 * int a=10
 * int b=20
 * int c=30 => 마지막부터 삭제돼서 스택(LIFO)
 * 
 * LIFO / FIFO
 * ----   ---- 
 * olleH  Hello
 * 
 * 메소드
 * ---- Call Stack
 * void main()
 * {
 * 	  aaa()
 * }
 * void aaa()
 * {
 *    bbb()
 * }
 * void bbb()
 * {
 *    ccc()
 * }
 * void ccc()
 * {
 *    ddd()
 * }
 * void ddd()
 * {
 * }
 */

import java.lang.reflect.Method;

class A
{
	void aaa()
	{
		
	}
	void bbb()
	{
		
	}
	void ccc()
	{
		
	}
	void ddd()
	{
		
	}
}
public class 메소드_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class clsName=Class.forName("A");
			Object obj=clsName.getDeclaredConstructor().newInstance();
			Method[] methods=clsName.getDeclaredMethods();
			for(Method m:methods)
			{
				System.out.println(m.getName());
			}
		}catch(Exception ex) {} // 메소드는 스택에 저장된다
	}

}
