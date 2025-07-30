import java.util.Scanner;
public class 두더지게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// 점수를 저장
		int score=0;
		// 10round
		final int ROUNDS=10;
		
		System.out.println("🤠두더지 게임 START🤠");
		System.out.println("🤠1~9 사이의 땅굴에 두더지 출몰!🤠");
		System.out.println("🤠게임은 "+ROUNDS+"Round입니다🤠");
		
		for(int i=1;i<=ROUNDS;i++)
		{
			int mole=(int)(Math.random()*9)+1; // 1~9 사이
					System.out.println("🤠Round "+i+":두더지 출몰!!🤠");
			System.out.println("🤠두더지는 어디에 있을까?🤠");
			int user=scan.nextInt();
			if(mole==user)
			{
				System.out.println("⚒️두더지를 잡았어요!!⚒️");
				score+=10;
			}
			else
			{
				System.out.println("🥹두더지를 놓쳤어요.. "+"두더지는 "+mole+"번 땅굴에 있어요🥹");
				score-=10;
			}
			System.out.println("현재 점수는 "+score+"점!");
			
		}
		// 게임 종료
		System.out.println("게임 종료!! 총 점수는 "+score+"점!");
		
	}

}
