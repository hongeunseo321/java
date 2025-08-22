package com.sist.anno;
/*
 * @ ==> TYPE (클래스 구분자)
 * class A
 * {
 * 	  @ ==> FIELD (변수 구분자)
 * 	  B b;
 * 
 *    @ ==> Constructor (생성자 구분자)
 *    public A()
 *    {
 *    }
 *    public A(@ ==> Parameter (매개변수 구분자) B b)
 *    {
 *    }
 *    
 *    @ ==> Method (메소드 구분자)
 *    public void disp()
 *    {
 *    }
 * }
 * 
 * => 인덱스 찾아주는 기능 => 구분자 생성
 *    --------------------------- 검색
 */
interface A
{
	void display();
}
class B implements A
{
	public void aaa() {
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}
public class 라이브러리_어노테이션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
