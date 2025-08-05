import java.util.Arrays;
import java.util.Scanner;
/*
 * 숫자 야구 게임
 * 
 * 난수 => 3 6 9
 * ------------
 *  456 => 1B (힌트)
 *  379 => 2S
 *         -- 3S
 *         
 * => 저장 => 배열
 */
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. 컴퓨터 난수 => 중복없는 난수 => 1~9
		 * --------반복문--------
		 * 2. 사용자 입력
		 * 3. 힌트
		 * 4. 종료 여부 => break;
		 * --------------------
		 */
		
		// 컴퓨터 난수 => 중복없는 난수
		int[] com=new int[3];
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1; // 1~9
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j]) // 중복된 값 확인
				{
					i--; // 중복 제거
					break;
				}
			}
		}
//		System.out.println(Arrays.toString(com)); => 정답 숨기기
		
		// 사용자 입력
		Scanner scan=new Scanner(System.in);
		int[] user=new int[3];
		while(true) // 횟수 지정이 안 된 경우 => 반드시 종료 조건
		{
			System.out.print("⏰ 세 자리 정수를 입력:");
			int input=scan.nextInt();
			
			if(input<100 || input>999)
			{
				System.out.println("❓ 세 자리 정수가 아닙니다");
				continue; // 처음부터 다시 시작
				// => while문에서는 조건식, for문에서는 증가식
			}
			
			/*
			 * 369
			 * 369/100 => 3
			 * 369%100 => 69 => 69/10 => 6
			 * 369%10 => 9
			 */
			user[0]=input/100; 
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			// 중복된 수 사용 금지
			if(user[0]==user[1] ||
			   user[1]==user[2] ||
			   user[0]==user[2])
			{
				System.out.println("✅ 중복된 수는 사용할 수 없습니다");
				continue;
			}
			
			// 0 입력 불가
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("✅ 0은 사용할 수 없습니다");
				continue;
			}
			
			// 정상적으로 세 자리 정수를 입력한 경우 => 힌트 제공
			int s=0,b=0;
			for(int i=0;i<3;i++) // com
			{
				for(int j=0;j<3;j++) // user
				{
					if(com[i]==user[j]) // 같은 수가 있는지 확인
					{
						if(i==j) // 같은 자리에 있는 경우
							s++;
						else
							b++;
					}
				}
			}
			System.out.printf("👻 Input Number:%d,Result:%dS-%dB\n",input,s,b);
			
			// 종료
			if(s==3)
			{
				System.out.println("🥳정답!!🥳");
				break; // while문 종료
			}
		}
	}

}
