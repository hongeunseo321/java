/*
 * 문자열 => String : 1,2,3,4 프로젝트
 *                  --------------- 사용하는 변수 / 배열 / 클래스
 *                                  여기에 사용되는 데이터형 85%
 * = 문자 여러 개를 동시에 저장
 * 	  String == char[]
 *       | ==> 쉽게 제어가 가능
 *    
 *   저장 방법
 *    String s="문자열" => 일반 데이터형
 *    String s=new String("문자열","문자코드")
 *             ---------------------------
 *              ISO-8859_1 ASC (default)   
 *               => UTF-8 (유니코드 형식)
 *                   => 한글 : 모음 + 자음
 *                            --------- 2byte
 *   new : 새로운 메모리 공간에 저장
 *   
 *   제어하는 기능
 *   ---------- 메소드는 반드시 결과값
 *   
 *   	리턴형 : 메소드가 실행된 후 "무엇을 반환할지"를 정해주는 타입
 *   		 	=> 메소드가 정수를 반환하면 리턴형은 int
 *   			   문자열을 반환하면 String
 *   			   아무것도 반환하지 않으면 void
 *   1. 변환
 *   	String toUpperCase() => 대문자 변환
 *   	String toLowerCase() => 소문자 변환
 *   	------------------------- 검색
 *   	*****valueOf() => 모든 데이터형을 문자열로 변환
 *   	String valueOf(10) => "10"
 *   
 *   2. 제어
 *   	문자 자르기
 *   	String substring(int beginIndex)
 *   	String substring(int beginIndex,int endIndex)
 *                                      ------------
 *                                       endIndex-1
 *      문자를 자른다 => 구분자 문자별 (" ", |...)
 *      green,blue,black
 *      String[] split(String del)
 *      
 *      공백 문자 제거 => 유효성 검사
 *      String trim() => 좌우 공백 제거
 *      
 *      문자열 결합***** 
 *      String concat(String s)
 *      "ABC" + "DEF" ==> 오라클
 *      "ABC".concat("DEF") ==> MySQL
 *      
 *   3. 변경
 *   	String replace(char c1,char c2)
 *   	String replace(String s1,String c2)
 *   
 *   	String ss="Hello Java";
 *   	ss.replace('a','b')
 *   		=> Hello Jbvb
 *   	ss.replace("Java","Oracle")
 *   		=> Hello Oracle
 *   
 *   	String replaceAll (바뀔 문자(문자열),바꿀 문자열)
 *   		=> 정규식 [가-힣] [A-Z]...
 *   
 *   4. 찾기
 *   	char charAt(int index) => 문자 한 개 추출
 *   
 *   	"Hello Java"
 *   	 0123456789 => charAt(7) => 'a'
 *   
 *   	int indexOf(char)
 *   	int lastIndexOf(char)
 *   
 *   	indexOf('l') => 2
 *   		=> 크롤링...
 *   	lastIndexOf('l') => 3 
 *   		=> 경로명, URL, 확장자...
 *   
 *   5. 비교
 *   	boolean equals(String s) => 대소문자 구분 O
 *   		=> 로그인 처리, 아이디 중복 체크...
 *		boolean equalsIgnoreCase(String s) => 대소문자 구분 X
 *  		=> 검색...
 *  	boolean startsWith(String s) => 시작 문자열이 같은지 확인 (대소문자 구분 O)
 *  		=> 자동 완성 기능 (Autocomplete)
 * 				=> 쿠키 저장 => 시작 문자열이 같은 경우
 * 		boolean endsWith(String s) => 끝나는 문자열이 같은 경우 (대소문자 구분 O)
 * 
 * 		compareTo(String s) => 문자열을 사전순으로 비교
 * 			"Hello".compareTo("Java") 양수 2
 *       	"Hello".compareTo("Hello") 0
 *       	"Java".compareTo("Hello") 음수 -2
 * 		
 * 			
 *  
 */
import java.util.Arrays;
/*
 * int a=10 => ch[0] ch[0]='A'
 * int b=a-5; => c
 * a=5;
 */
public class 문자열배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		System.out.println(s.toUpperCase());
//		char[] ch={'a','B','c','d','E','K'};
		// 대문자 출력
//		for(int i=0;i<ch.length;i++)
		{
//			if(ch[i]>='a' && ch[i]<='z')
//				ch[i]=(char)(ch[i]-32);
//			System.out.print(ch[i]+" ");
		}
		// 인덱스가 존재해야 데이터 값을 변경
		// for-each => 값을 받는 변수만 이용 => 출력만
		
//		System.out.println(Arrays.toString(ch));
//		
//		String s="aBcdEK"; // 실제 메모리 공간에는 char로 하나씩 저장
//		System.out.println(s.toUpperCase());
		/*
		 * char[] => String
		 * int => Integer
		 * long => Long ...
		 * ---------------- Wrapper
		 */
		// 문자열 자체가 메모리 주소
		// => 같은 문자열은 같은 주소를 가지고 있다
//		String s1="Hello";
//		String s2="Hello";
//		String s3=new String("Hello"); 
//		if(s1==s3) // == 주소 비교, 문자열이 다른지 검사 => equals
//			System.out.println("같다");
//		else
//			System.out.println("다르다");
		int[] arr={1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		// arr : 주소 ==> 1 2 3 4 5
		 
		int[] arr2=arr;
		System.out.println(Arrays.toString(arr2));
		
		// 얕은 복사
		arr2[0]=100;
		arr2[1]=200;
		
		System.out.println(Arrays.toString(arr2));
		// arr => [100, 200, 3, 4, 5] => 주소값을 받았으니 제어 가능
		// 원본이냐, 복사본이냐 => 주소값을 넘겼냐, 값만 넘겼냐
		
		System.out.println(arr);
		System.out.println(arr2);
		
		// 클래스에서 제외 => String => 일반 데이터형
		
		// 깊은 복사
		int[] arr3=arr.clone();
		System.out.println(arr3);
		
		// 얕은 복사 => 참조 주소만 복사 => 복사본 수정 시에 원본도 영향
		// 깊은 복사 => 값 자체를 새로운 메모리 공간에 복사 => 원본과 복사본이 완전히 별개의 객체
		
		
		String s1="Hello";
		String s2="Java";
		int res=s1.compareTo(s2); // 문자 비교 => 0 => 정렬
		// 왼쪽 -, 오른쪽 +, 같으면 0
		System.out.println(res);
		
		int aa=100;
		int bb=200;
		int tt=aa; // 값을 교환할 때는 임시변수 선언
		aa=bb;
		bb=tt; // bb=aa가 아닌 임시변수를 통해서 값을 교환
		System.out.println(aa+"|"+bb);
		
	}

}
