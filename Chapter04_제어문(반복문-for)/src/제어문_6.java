/*
 *  => UpDown 게임
 *  => 난수 => 1~100 사이
 *  => 사용자 입력
 *  	=> 힌트 UP
 *             DOWN
 *  -------------------
 */
import java.util.Scanner;
/*
 * 	반복문 => 제어 => 반복 제어문
 * 	1. 반복문 종료
 * 		break
 * 	2. 특정 부분을 제어
 * 		continue
 * 
 * 	for(int i=1;i<=10;i++)
 * 	{
 * 		if(i==5) break; => 4까지 출력
 * 		System.out.println(i);
 * 		if(i==5) break; => 5까지 출력
 * 	}
 * 
 * 	for(int i=1;i<=10;i++)
 * 	{
 * 		if(i==5) continue; => 5 빼고 출력 => 1 2 3 4 6 7 8 9 10
 * 		System.out.println(i);
 * 	}
 * 
 * 	1 2 3 4 5 6 7 8 9 10
 * 
 */
public class 제어문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("===== for =====");
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println(i+" ");
//		}
//		System.out.println("\n===== break =====");
//		for(int i=1;i<=10;i++)
//		{
//			if(i==5) break;
//			System.out.println(i+" ");
//		}
//		System.out.println("\n ===== continue =====");
//		for(int i=1;i<=10;i++)
//		{
//			if(i==5) continue;
//			System.out.println(i+" ");
//		}
		Scanner scan=new Scanner(System.in);
		// 1. 컴퓨터에서 난수 발생
		int com=(int)(Math.random()*100)+1; // 1~100
		int count=0;
		for(;;) // 무조건 => 무한루프
		{
			// 2. 사용자 입력값 받기
			System.out.print("1~100 사이의 정수 입력:");
			int user=scan.nextInt();
			// 입력이 잘못된 경우 => continue
			// 정답 => 종료 => break
			// 게임 => 횟수 지정을 하지 않는다
			if(user<1 || user>100)
			{
				System.err.println("1~100 까지의 정수만 사용이 가능합니다");
				// 처음으로 돌아간다
				continue;
				/*
				 * 	continue =>
				 * 	for      => 증가식 (for에서 주로 사용)
				 * 	while    => 조건식
				 * 
				 * 	=> continue
				 * 		반드시 반복문에서만 사용이 가능
				 * 		if, switch에서는 사용이 불가능
				 * 	=> break
				 * 		반복문, switch에서 사용이 가능
				 * 		if 사용이 불가능
				 * 		
				 */
			}
			count++; // 정상 입력 시에만 count 증가
			// 경우의 수 => if
			/*
			 * 	1. com > user
			 * 	2. com < user
			 * 	3. com == user
			 */
			if(com>user)
			{
				System.out.println("입력값보다 큰 정수를 입력하세요");
			}
			else if(com<user)
			{
				System.out.println("입력값보다 작은 정수를 입력하세요");
			}
			else
			{
				System.err.println("Game Over!!");
				System.out.println("입력 횟수:"+count);
				break;
			}
		}
	}

}
