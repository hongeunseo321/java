// 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램 작성

public class 문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=10;i++)
		{
			int val=(int)(Math.random()*100)+1;
			System.out.print(val+" ");
			if(val%2==0)
				count++;
		}
		System.out.println();
		System.out.println("짝수의 개수:"+count);
	}

}
