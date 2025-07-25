/*
 * 	점수를 입력 => 0~100 사이
 * 	= 60 이상이면 합격
 * 	= 60 이하면 불합격
 * 
 * 	if(score>=60)
 * 		합격
 * 	if(score<60)
 * 		불합격
 */
import java.util.Scanner;
public class 제어문_조건문7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("점수 입력:");
		int a=scan.nextInt();
		int temp=a/10;
		
		if(temp>=6)
			System.out.println("합격");
		if(temp<6)
			System.out.println("불합격");
		

	}

}
