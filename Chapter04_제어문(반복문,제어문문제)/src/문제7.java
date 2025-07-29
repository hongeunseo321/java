// 1~10 사이의 숫자 중 3의 배수를 제외하고 출력하라 (continue 사용)

public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			if(i%3==0)
				continue; // i++ => 증가식으로 올라간다
			System.out.print(i+" ");
		}
		
//		String[] arr= {"aaa","bbb","ccc","ddd","eee","fff","iii","jjj","ggg"};
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr[5]);
//		
//		System.out.println(arr[6]);
//		System.out.println(arr[7]);
//		System.out.println(arr[8]);   
//		
//		for(int i=0;i<9;i++)
//		{
//			System.out.println(arr[i]);
//		}
	}

}
