// 자바 => 한 개의 클래스에서 작업하지 않는다
// 클래스 여러 개를 만들어서 연관 관계를 이룬다
// 모든 프로그램 => Actor
/*
 * 	선택에 따라 출력 내용 변경
 * 	--------------------
 * 	true / false 를 나눠서 작업
 * 	=> 로그인 성공 / 실패
 * 	=> 대문자 / 소문자
 * 	=> 짝수 / 홀수
 * 	형식)
 * 		if(조건문) => true 예) 짝수, 대문자, 로그인
 * 		{
 * 			문장 => 예약 기간
 * 		}
 * 		else => false 예) 홀수, 소문자, 로그인 실패
 * 		{
 * 			문장 => 예약 기간이 아니라면
 * 		}
 * 
 * 		=> 사용자라면 ~ 관리자라면
 * 		---------------------
 * 
 * 	// 문자 => 입력을 받아서 => 대문자 / 소문자
 * 	// 짝수 / 홀수
 */
import java.util.Scanner;
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int num=scan.nextInt();
		
		if(num%2==0) // true
			System.out.println(num+"는(은) 짝수입니다");
//		if(num%2!=0)
//			System.out.println(num+"는(은) 홀수입니다");
		else // false
			System.out.println(num+"는(은) 홀수입니다");
		
	}

}
