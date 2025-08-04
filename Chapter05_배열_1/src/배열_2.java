// 임의인 정수를 10개 받아서 최댓값, 최솟값
// 데이터가 많은 경우 => 반복문 => 배열
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a1=(int)(Math.random()*100)+1;
//		int a2=(int)(Math.random()*100)+1;
//		int a3=(int)(Math.random()*100)+1;
//		int a4=(int)(Math.random()*100)+1;
//		int a5=(int)(Math.random()*100)+1;
//		int a6=(int)(Math.random()*100)+1;
//		int a7=(int)(Math.random()*100)+1;
//		int a8=(int)(Math.random()*100)+1;
//		int a9=(int)(Math.random()*100)+1;
//		int a10=(int)(Math.random()*100)+1;
//		
//		int max=a1;
//		if(max<a2)
//			max=a2;
//		if(max<a3)
//			max=a3; ... 
		
		int[] arr=new int[10];
		//    --- arr => 10개의 변수를 제어
		// 필요한 데이터 대입
		int max=0;
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			System.out.print(arr[i]+" ");
			
			// 최댓값이 있는 위치의 인덱스를 구하시오
			if(max<arr[i])
			{
				max=arr[i];
				index=i;
			}
			System.out.println("\n"+max+"는(은) "+(index+1)+"번째 있습니다");
			
			// 5번째와 6번째의 값을 출력 => 차이 확인
			System.out.printf("%d - %d = %d\n",
					arr[4],arr[5],arr[4]-arr[5]);
		}

	}

}
