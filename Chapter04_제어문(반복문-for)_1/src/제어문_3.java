/*
 * 	5개의 알파벳 입력
 * 	-------------
 * 	A -> a
 * 	b -> B
 */
import java.util.Scanner;
public class 제어문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// 대소문자의 차이 32 => A(65), a(97)
//		for(int i=1;i<=5;i++)
//		{
//			System.out.print("알파벳 입력:");
//			String s=scan.next();
//			char c=s.charAt(0);
//			System.out.println("입력값:");
//			if(c>='A' && c<='Z')
//			{
//				System.out.println("변경값:"+(char)(c+32));
//			}
//			else
//			{
//				System.out.println("변경값:"+(char)(c-32));
//			}	
//		}
		// 알파벳 여러 개를 받아서 모든 문자를 대문자로 변경 => toUpperCase
//		System.out.println("알파벳 문자 입력:");
//		String s=scan.nextLine();
		// System.out.println(s.toUpperCase()); // 대문자로 변경
		// System.out.println(s.toLowerCase()); // 소문자로 변경
//		for(int i=0;i<s.length();i++)
//		{
//			char c=s.charAt(i);
//			if(c>='a' && c<='z')
//			{
//				System.out.print((char)(c-32));
//			}
//			else
//			{
//				System.out.print(c);
//			}
//		}
		
		// 문자열을 입력 받아서 'A' | 'a'의 개수 확인
		System.out.println("알파벳 문자 입력:");
		String s=scan.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='A' || c=='a')
			{
				count++;
			}
			
		}
		System.out.println("count="+count);
	}

}
