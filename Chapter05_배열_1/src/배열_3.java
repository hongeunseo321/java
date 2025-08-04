// 100개의 난수 발생 (0~9) => 빈도수 구하기
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bin=new int[10]; // 0~9
		/*
		 * rand=1, rand=4, rand=9 난수 발생
		 *   0   1   2   3   4   5   6   7   8   9 
		 *      +1          +1                  +1
		 */
		for(int i=1;i<=100;i++)
		{
			int rand=(int)(Math.random()*10);
			bin[rand]++;
		}
		System.out.println("===== 결과값 =====");
		for(int i=0;i<10;i++)
		{
			System.out.println(i+":"+bin[i]);
		}
		
	}

}
