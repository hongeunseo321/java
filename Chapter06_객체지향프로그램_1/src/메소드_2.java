/*
 * 변수 / 데이터형 / 연산자 / 제어문 ==> 프로그램의 기본
 * -------------------------
 * 관련된 데이터를 묶는다
 * 	= 같은 데이터형 (배열)
 * 	= 다른 데이터형 (클래스)
 * 관련된 명령문을 묶는다 (메소드) => 메소드를 묶어서 처리 => 객체
 * 	만들지 못 하는 부분이 존재
 * 	 => 제공 : API (소프트웨어 ↔ OS 기능 간 연결)
 *            하드웨어 ← 운영체제(윈도우) ← API ← 프로그램
 *            
 * => React / Vue / Next
 * => Oracle / MySQL
 */
// 리턴형 받기 => 기본형 / 배열 / 클래스 (상세 보기)
// 사칙연산 
import java.util.Scanner;
public class 메소드_2 {
	// int a=(int)(Math.random()*100)
	// 반복 제거
	static int input(String msg) // 리턴형 int, 매개변수 String
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg);
		return scan.nextInt(); // 리턴형 int 받음 
		// => 리턴값은 항상 리턴형과 동일하거나 이하여야 함
	}
	static int plus(int a,int b)
	{
		return a+b;
	}
	static int minus(int a,int b)
	{
		return a-b;
	}
	static int gop(int a,int b)
	{
		return a*b;
	}
	// String은 모든 데이터를 문자열로 변환
	static String div(int a,int b)
	{
		// 자체 출력 void
		// double과 String을 둘 다 쓰면 데이터형이 안 맞기 때문에 자체 출력
		if(b==0)
			return "0으로 나눌 수 없습니다";
		else
			return String.valueOf(a/(double)b); // 리턴형 String을 쓸 수도 있다
		 // static String s="" s.substring(1,5)
		 // => 스태틱 변수
	} // 자체 출력을 하거나 리턴형 double을 String으로 쓰거나 => 정답은 없다
	
	// 계산기
	static void process()
	{
		int a=input("첫번째 정수 입력:");
		int b=input("두번째 정수 입력:");
		Scanner scan=new Scanner(System.in);
		System.out.print("연산자 입력(+,-,*,/):");
		switch(scan.next())
		{
		case "+" ->{
			int c=plus(a,b);
			System.out.printf("%d + %d = %d\n",a,b,c);
		}
		case "-" ->{
			int c=minus(a,b);
			System.out.printf("%d - %d = %d\n",a,b,c);
		}
		case "*" ->{
			int c=gop(a,b);
			System.out.printf("%d * %d = %d\n",a,b,c);
		}
		case "/" ->{
			System.out.println(div(a,b));
//			System.out.println(display()); void일 때는 쓸 수 없다
		}
		}
	}
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
