package com.sist.inner;
/*
 * 클래스 두 개에서 공통으로 사용하는 변수, 메소드가 있는 경우에 사용
 *      -------------------------------
 *       1. 윈도우
 *       2. 쓰레드
 *       3. 네트워크
 *  
 *  장점 : 다른 클래스와 연결하기가 쉽다
 *        코드의 복잡성을 줄일 수 있다
 *  단점 : 객체 생성이 어렵다
 *  ---------------------------- 빅데이터 (데이터 분석)
 *  
 *  내부클래스 종류
 *   1) 멤버 클래스
 *       class A
 *       {
 *       }
 *       class B
 *       {
 *       	A a=new A(); // has-a (포함클래스)
 *       	A클래스가 가지고 있는 모든 내용 사용 (변수, 메소드)
 *       	 => 메소드 변경이 불가능 (오버라이딩 X)
 *       	 => 있는 그대로 사용
 *       	 => 변경해서 사용하려면 상속을 받아야 한다
 *       }
 *       -------------------------------------------
 *       class B (Server)
 *       {
 *       	// 접속 시에 정보 저장
 *       	class A (통신) => Thread => 웹
 *       	{
 *       		저장된 정보를 이용해서 => 통신
 *       	} => B클래스의 멤버클래스
 *       }
 *       
 *   2) 익명의 클래스 : 상속 없이 오버라이딩이 가능
 *      ---------- 상속 사용이 금지일 경우 (Spring)
 *      
 *       class A extends JFrame
 *       {
 *       	JButton btn=new JButton(){
 *       		기능을 변경, 추가해서 사용
 *       	}
 *       }
 *       class A
 *       {
 *       	B b=new B(){
 *       		public void display(){}
 *       	}
 *       }
 *       class B
 *       {
 *       	public void display(){}
 *       }
 *       
 *   3) 지역 클래스 : 사용빈도는 거의 없다 => 메소드 안에 클래스 생성
 *       class A
 *       {
 *       	public void display()
 *       	{
 *       		class B
 *       		{
 *       			public void print(){}
 *       		}
 *       
 *       		B b=new B();
 *       		b.print()
 *       	}
 *       }
 *       
 *    => 익명의 클래스 => 상속 없이 처리 => POJO 
 */
class OUter2{
	Inner2 in=new Inner2() {
		public void print() {
			System.out.println("Outer2:Inner2:print() Call...");
		}
	};
}
class Inner2{
	public void print()
	{
		System.out.println("Inner2:print() Call...");
	}
}
class Outer{
	private String name="홍길동";
	class Inner{
		int a=10;
		public void print()
		{
			System.out.println("이름:"+name);
		}
	}
	public void display()
	{
		Inner i=new Inner();
		System.out.println(i.a);
		i.print();
	}
}
public class 내부클래스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o=new Outer();
//		Outer.Inner c=o.new Inner();
//		System.out.println(c.a);
//		c.print();
		o.display();
		
		Inner2 i=new Inner2();
		i.print();
		
		OUter2 o2=new OUter2();
		o2.in.print();
	}

}
