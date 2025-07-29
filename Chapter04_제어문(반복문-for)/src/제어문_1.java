// 알파벳 출력 => ABCD~Z
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char c='A';c<='Z';c++)
		{
			System.out.print(c);
		}
		System.out.println();
		for(int i=1;i<=10;i++)
		{
			System.out.print(i);
		}
		System.out.println();
		for(int i=1;i<=10;i+=2)
		{
			System.out.print(i);
		}
		
		for(int i=1;i==1;)
		{
			System.out.print(i);
		}
		// 알파벳 => 'A', 'a'...
		/*       
		 *               5 false면 종료
		 *               |
		 *        1-->   2    <--4 --
		 * 	for(시작값 ; 조건식 ; 증감식)|
		 *  {            3(true)-----   
		 *            반복 수행문
		 *  }
		 *  
		 *  1 => 2 = 3 = 4
		 *  	 2 = 3 = 4
		 *  	 .
		 *       .
		 *       .
		 *       2번이 false면 종료
		 *       
		 *  int i=1  i<=5  i++
		 *  	System.out.println(i)
		 *  
		 *  i=1 => i<=5 System.out.println(1) i++
		 *  i=2 => i<=5 System.out.println(2) i++
		 *  i=3 => i<=5 System.out.println(3) i++
		 *  i=4 => i<=5 System.out.println(4) i++
		 *  i=5 => i<=5 System.out.println(5) i++
		 *  i=6 => i<=5
		 *         ---- false => for 종료
		 */
		// for(;;) // 무한루프 => 게임, 서버 => while(true)
		/*
		 * 	반복문
		 * 		for : 주로 반복 횟수가 지정된 경우
		 *                -------
		 * 		while : 주로 반복 횟수가 없는 경우
		 * 				    -------
		 * 		------------------------ 한 번도 수행이 안 되는 경우도 있다
		 * 		=> 선조건
		 * 		while(조건)
		 * 		{
		 * 		}
		 * 		do~while : 무조건 한 번 이상 수행
		 * 
		 * 		=> 후조건
		 * 		do
		 * 		{
		 * 			반복 문장
		 * 		} while(조건)
		 */
	}

}
