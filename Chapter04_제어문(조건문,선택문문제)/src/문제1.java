// 정수 한 개를 입력 받아서 그 수가 50 이상의 수인지, 미만의 수인지 판단

public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=(int)(Math.random()*100)+1;
		// 1~100 사이 정수
		System.out.print("num="+num);
		if(num>=50)
		{
			System.out.println(num+"은(는) 50 이상입니다");
		}
		else
		{
			System.out.println(num+"은(는) 50 미만입니다");
		}
	}
	
}
