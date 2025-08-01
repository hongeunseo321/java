/*
 * 문자열 저장
 * -------- 기능
 * String : 데이터형 + 클래스
 *                   ---- 기능 처리 (메소드)
 * println() print() 화면 출력, random() 임의 실수 추출 => 메소드
 * 
 * 1. 저장 방법
 * 		String 변수명="문자열" => 제한이 없다
 * 
 * 2. 문자열 제어가 가능하게 기능 처리 (메소드 제공)
 * 		메소드
 *		-----------------
 *		1. 리턴형
 *		2. 메소드명
 *		3. 매개변수
 *		4. 어떤 기능인지 확인
 *		----------------- 이미 제작 => 암기 (String => 변경할 수 없다)
 *		=> 변경이 안 되는 클래스
 *			String, System, Math => 종단 클래스 (final)
 *		=> 형태
 *			리턴형 메소드명 (매개변수_list)
 *			
 *		1) 문자열의 개수
 *			length()
 *			=> 원형 : int length() => .(주소 접근 연산자)
 *
 *		2) 문자열 변환
 *			toUpperCase() => 대문자 출력
 *         	toLowerCase() => 소문자 출력
 *         	=> 원형 : String toUpperCase()
 *                   String toLowerCase()
 *          *** 원본은 바뀌지 않는다
 *          
 *      3) 문자열 제어
 *      	substring() => 원하는 문자열을 자르는 경우 사용
 *      	=> 원형 : String substing(int beginIndex)
 *                    => beginIndex부터 마지막 문자열 자르기
 *                   String substing(int beginIndex, int endIndex)
 *                    예)                            --------------
 *                    	Hello Java                   => endIndex-1
 *                    	0123456789
 *                    	String substing(0, 4) => Hell 출력
 *                    
 * 		*** 메소드는 같은 이름으로 제작할 수 없다
 * 		*** 예외 조건 : 매개변수의 개수나 데이터형이 다르면 다른 메소드로 인식 => 오버로딩
 */
public /* final */ class 정리_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="0123456789";
//		System.out.println("개수:"+s.length());
//		String s1="Hello 자바 12345";
//		System.out.println(s1.toUpperCase());
//		System.out.println(s1.toLowerCase());
//		// 원본은 변경되지 않는다
//		System.out.println(s1);
		
	}

}
