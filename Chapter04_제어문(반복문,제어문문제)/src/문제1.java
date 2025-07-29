// 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
// for(int i=2;i<=100;i+=2)

public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0; // 누적 변수
		for(int i=2;i<=100;i+=2)
		{
			sum+=i;
		}
		System.out.println("100까지의 짝수 합:"+sum);
	}

}
