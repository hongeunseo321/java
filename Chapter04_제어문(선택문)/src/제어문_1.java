/*
 * 	선택문
 * 		형식)
 * 			switch(정수, 문자, 문자열)
 * 			{
 * 				정수
 * 				case 1:
 * 					처리문장
 * 				break;
 * 				case 2:
 * 					처리문장
 * 				break;
 * 				.
 * 				.
 * 				.
 * 				default:
 * 					처리문장
 * 			}
 * 			=> break 없이 사용
 * 				switch(정수, 문자, 문자열)
 * 				{
 * 					case 1 -> {
 * 						  ---- 람다 => break 없이 사용
 * 					}
 * 					case 2 -> {
 * 						  
 * 					}
 * 					case 3 -> {
 * 						 
 * 					}
 * 				}
 * 
 * 				switch(정수, 문자, 문자열)
 * 				{
 * 					case 1, 2 -> {
 * 					
 * 					}
 * 					case 3, 4 -> {
 * 						  
 * 					}
 * 				}
 * 				
 * 				=> 값 한 개 선택 => 다중 조건문을 간결하게
 * 				=> 메뉴, 게임 키를 누르는 경우
 * 				=> 게임 / 네트워크
 * 				=> 1개만 사용이 가능
 * 				=> 웹에서는 많이 사용하지 않는다
 * 	
 * 				=> 데이터형 : 웹에서 short, float 는 잘 사용하지 않는다
 * 							byte => 파일 업로드 / 파일 다운로드
 * 							=> int / long / double / String
 * 				=> 연산자 : ! , ++ , -- , ()
 * 						 산술, 비교, 논리, 대입
 * 				=> 제어문 : if , if~else
 * 						   for, while
 * 						   break
 */
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
