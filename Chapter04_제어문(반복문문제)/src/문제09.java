// 0~12까지 2의 배수, 3의 배수의 합을 구하여라.
// 0~12까지 2의 배수, 3의 배수의 개수을 구하여라.

public class 문제09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a2=0;
		int a3=0;
		for(int i=0;i<=12;i++)
		{
			if(i%2==0)
				a2+=i;
			if(i%3==0)
				a3+=i;
		}
		System.out.println("2의 배수 합:"+a2);
		System.out.println("3의 배수 합:"+a3);
		
		int b2=0;
		int b3=0;
		for(int i=0;i<=12;i++)
		{
			if(i%2==0 && i!=0)
				b2++;
			if(i%3==0 && i!=0)
				b3++;
		}
		System.out.println("2의 배수 개수:"+b2);
		System.out.println("3의 배수 개수:"+b3);
	}

}
