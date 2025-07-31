/*
 * 	int i=1;
 * 	while(i<=5)
 * 	{
 * 		실행문장
 * 		i++
 * 	}
 *                |false 종료
 * 	i=1 => i<=5 =====> 실행문장 => i++
 *                |true 실행문장
 *  i=2 => i<=5 => 실행문장 -> i++
 *  i=3 => i<=5 => 실행문장 -> i++
 *  i=4 => i<=5 => 실행문장 -> i++
 *  i=5 => i<=5 => 실행문장 -> i++
 *  i=6 => i<=5
 *         ---- false => while 종료
 *  
 *  int i=1; ①
 *  do
 *  {
 *  	실행문장 ② => title (게임)
 *  	i++ ③
 *  }while(i<=5); ④
 *  
 *  i=1 실행문장 => i++ => i=2 i<=5
 *  i=2 실행문장 => i++ => i=3 i<=5
 *  i=3 실행문장 => i++ => i=4 i<=5
 *  i=4 실행문장 => i++ => i=5 i<=5
 *  i=5 실행문장 => i++ => i=6 i<=5
 *                       -------- 이미 증가된 값으로 비교해서 종료
 *  
 */
public class 제어문_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100까지의 합
		// 지역변수 => scope => 범위
		int sum=0; // 누적변수
		for(int i=1;i<=100;i++)
		{
			sum+=i;
		} // i는 메모리에서 사라진다
		System.out.println("for=>sum="+sum);
		
		int i=1; // 지역변수 i가 사라졌으니 다시 선언
		sum=0;
		while(i<=100)
		{
			sum+=i;
			i++;
		}
		System.out.println("while=>sum="+sum);
		
		i=1;
		sum=0;
		do
		{
			sum+=i;
			i++;
		}while(i<=100);
		System.out.println("do~while=>sum="+sum);
	}

}
