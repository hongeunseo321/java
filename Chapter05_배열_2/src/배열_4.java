import java.util.Arrays;
/*
 * 32, 11, 36, 63, 35
 * --  --  --  --  --
 * 11  32
 * --      --
 * 11      36
 * --          --
 * 11          63
 * --              --  
 * 35              11 => for 1 (1 round)
 * ------------------
 * 35  32  36  63  11
 *     --  --
 *     32  36
 *     --      --
 *     32      63
 *     --          --
 *     11          32 => for 2 (2 round)
 * ------------------
 * 35  11  36  63  32
 *         --  --
 *         63  36
 *         --      --
 *         32      63 => for 3 (3 round)
 * ------------------
 * 35  11  32  36  63
 *             --  --
 *             63  36 => for 4 (4 round)
 * ------------------
 * 35  11  32  63  36
 * 
 * => 5 - 4 (숫자 5개, 4번 수행)
 * 
 * 1 round 4바퀴
 * 2 round 3바퀴
 * 3 round 2바퀴
 * 4 round 1바퀴
 * 
 * i j
 * 1 4 > 5
 * 2 3 > 5
 * 3 2 > 5
 * 4 1 > 5 => i+j=5 => j=5-i
 */
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[5];
		 
		// 초기값
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("======= 정렬 전:");
		for(int i:com)
		{
			System.out.print(i+" ");
		}
		
//		System.out.println("\n====== 오름차순:");
//		for(int i=0;i<com.length-1;i++)
//		{
//			for(int j=i;j<com.length;j++)
//			{
//				if(com[i]>com[j])
//				{
//					int temp=com[i];
//					com[i]=com[j];
//					com[j]=temp; // 교환
//				}
//			}
//		}
//		for(int i:com)
//		{
//			System.out.print(i+" ");
//		}
//		
//		System.out.println("\n====== 내림차순:");
//		for(int i=0;i<com.length-1;i++)
//		{
//			for(int j=i;j<com.length;j++)
//			{
//				if(com[i]<com[j])
//				{
//					int temp=com[i];
//					com[i]=com[j];
//					com[j]=temp; // 교환
//				}
//			}
//		}
//		for(int i:com)
//		{
//			System.out.print(i+" ");
//		}
		
		System.out.println("\n====== 오름차순:");
		Arrays.sort(com);
		for(int i:com)
		{
			System.out.print(i+" ");
		}
		
		// for-each문은 내림차순이 안 된다
		System.out.println("\n====== 내림차순:");
		for(int i=com.length-1;i>=0;i--)
		{
			System.out.print(com[i]+" ");
		}
		
	}

}
