// 10번 => 가위바위보 5승 1무 4패
import java.util.Scanner;
/*
 * 	com 0 ✌️
 * 		user 0 ✌️ 0
 * 		user 1 ✊ -1 user
 * 		user 2 ✋ -2 com
 * 	com 1
 * 		user 0 ✌️ 1 com
 * 		user 1 ✊ 0
 * 		user 2 ✋ -1 user
 * 	com 2
 * 		user 0 ✌️ 2 user
 * 		user 1 ✊ 1 com 
 * 		user 2 ✋ 0
 * 	=> com win => 1, -2
 * 	=> user win => -1, 2
 */
public class 제어문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int win=0;
		int lose=0;
		int same=0;
		
		for(int i=1;i<=10;i++)
		{
			// 1. compute => 난수
			int com=(int)(Math.random()*3);
			// 가위(0),바위(1),보(2)
			// 2. 사용자 입력
			System.out.print("✌️(0), ✊(1), ✋(2):");
			int user=scan.nextInt();
			
			// 오류 처리 => continue => 재실행
			if(user<0 || user>2)
			{
				System.err.println("가위바위보를 입력해야 합니다");
				i--;
				continue; // i++
			}
			
			// 정상 입력이 된 상태
			int res=com-user;
			if(res==-2 || res==1)
			{
				lose++;
				System.out.println("lose..");
			}
			else if(res==2 || res==-1)
			{
				win++;
				System.out.println("win!!");
			}
			else
			{
				same++;
				System.out.println("same");
			}
				
		// 3. 승 / 무 / 패
		}
		System.out.println("✌️✊✋ 결과 ✌️✊✋");
		System.out.printf("%d승 %d무 %d패\n",win,same,lose);
		
		// 모든 프로그램 => 가정
		// 게임 => 숫자로 가정
	}

}
