import java.util.Scanner;
public class 메소드_1_변환2 {
	// 난수
	/*
	 * 사용자 입력
	 * 비교
	 * 종료
	 */
	static int[] com=new int[3];
	static int[] user=new int[3];
	static int s,b;
	// 전역변수 => 프로그램 종료 시까지 유지
	// => 리턴형 / 매개변수 사용 안 해도 됨
	/*
	 * class 영역 => 전역변수 => 클래스 안에 있는 모든 메소드에서 사용 가능
	 *              메소드에서 공통으로 사용되는 변수
	 *              
	 * ----------------------
	 * method 영역 => 지역변수
	 * method () 영역 => 매개변수
	 * ---------------------- 스택에 저장 => 메소드 종료 시 메모리 해제
	 */
	static void rand()
	{
		// 지역 변수는 자동 삭제
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1; // 1~9
			for(int j=0;j<i;j++)
			{
				// 이미 저장된 j랑 i를 비교
				if(com[j]==com[i])
				{
					i--;
					break;
				}
			}
		}
	}
	static void userInput()
	{
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			// 사용자 입력
			System.out.print("세 자리 정수 입력:");
			int input=scan.nextInt();
			
			// 오류 처리 => 입력이 잘못된 경우
			/*
			 * 1. 세 자리 정수가 아닌 경우
			 * 2. 중복된 정수를 입력한 경우
			 * 3. 0을 입력한 경우
			 */
			if(input<100 || input>999)
			{
				System.out.println("🙅‍♀️ 잘못된 입력입니다 🙅‍♀️");
				// 다시 처음부터 실행 => while의 조건식 이동
				continue;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] ||
			   user[2]==user[1] ||
			   user[0]==user[2])
			{
				System.out.println("🙅‍♀️ 중복된 수는 사용할 수 없습니다 🙅‍♀️");
				continue;
			}
			
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("🙅‍♀️ 0은 사용할 수 없습니다 🙅‍♀️");
				continue;
			}
			break;
		}
	}
	static void compare()
	{
		s=0;
		b=0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(com[i]==user[j])
				{
					if(i==j)
						s++;
					else
						b++;
				}
			}
		}
		// 힌트
		System.out.printf("Input Number:%d%d%d,Result:%dS-%dB\n",
				user[0],user[1],user[2],s,b);
	}
	static boolean isEnd()
	{
		boolean bCheck=false;
		if(s==3)
			bCheck=true;
		return bCheck;
	}
	static void process()
	{
		// 난수 값
				rand();
				Scanner scan=new Scanner(System.in);
				while(true)
				{
					userInput();
					compare();
					if(isEnd())
					{
						System.out.println("🎉정답!! Game Over🎉");
						System.out.print("게임을 다시 할까요?(Y/y)");
						char c=scan.next().charAt(0);
						if(c=='Y' || c=='y')
						{
							System.out.println("new 게임을 시작합니다!");
							process(); // 재귀 호출
							// 자신의 메소드를 호출
						}
						else
						{
							System.out.println("Game Over");
							System.exit(0);
						}
					}
					
				}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
