// 정수를 입력 받아서 2진법 출력
// => 10 => 0000 0000 0000 1010
import java.util.Scanner;
public class 메소드_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/// 입력 메소드 
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력(0~32767):");
		int num=scan.nextInt();
		
		/// 처리 메소드 
		// 저장 준비
		int[] bin=new int[16];
		
		// 배열 => 뒤
		int index=bin.length-1;
		
		while(true) // 반복 횟수 지정 X => while
		{
			bin[index]=num%2;
			num/=2; // num=num/2
			
			if(num==0)
				break;
			index--;
		}
		/// 처리 메소드 
		/// 출력 메소드
		System.out.println("===== 결과값 =====");
		for(int i=0;i<bin.length;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(bin[i]);
		}
	}

}
