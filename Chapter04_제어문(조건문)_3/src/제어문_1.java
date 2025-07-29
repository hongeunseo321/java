/*
 * 	단일조건문
 * 		형식)
 * 			if(조건문) : 조건문(true/false)인 연산자 사용
 * 						=> 부정연산자(!), 비교연산자, 논리연산자만 사용이 가능
 * 			{
 * 				조건이 true일 때 수행하는 문장
 * 				** false면 if를 건너뛴다 
 * 			}
 * 
 * 	선택조건문
 * 		형식) => true일 때, false일 때 나눠서 작업
 * 				if(조건문)
 * 				{
 * 					조건 true일 때 수행
 * 				}
 * 				else
 * 				{	
 * 					조건 false일 때 수행
 * 				}
 * 		*** 단일조건문은 독립적이다 => if마다 따로 수행
 * 
 * 	다중조건문 : 한 개의 문장으로 만들어져 있다
 * 				=> 조건에 맞는 문장 1개만 수행
 * 				=> 선택문(switch)
 * 		형식)
 * 			if(조건문)
 * 			{
 * 				조건 true => 문장 수행 => 종료
 * 				조건 false
 * 			}		  |
 * 			else if(조건문)
 *	  		{
 *	  			조건 true => 문장 수행 => 종료
 *	  			조건 false
 *	  		}		  |
 *	  		else if(조건문)
 *	  		{
 *	  			조건 true => 문장 수행 => 종료
 *	  			조건 false
 *	  		}		  |
 *	 		else : 해당 조건이 없는 경우 처리
 *	  		{
 *	  			생략이 가능
 *	  		}
 * 
 * 		=> 무조건 한 개의 문장만 수행 => 한 개의 문장으로 제작됨
 * 
 * 		
 */
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중복 출력 => 단일 조건문 여러 개
		// 중복 없이 1개 수행 => 다중 조건문 사용
		int num=15;
		if(num%3==0)
			System.out.println("15는 3의 배수");
		if(num%5==0)
			System.out.println("15는 5의 배수");
		if(num%7==0)
			System.out.println("15는 7의 배수");
		
	}

}