/*
 * 자바 => 기본 문법
 * 			변수 / 데이터형 (기본형)
 * 			가공 (사용자 요청)
 * 			-------------- 연산자 / 제어문
 * 	관리
 * 		= 데이터 시작
 * 			배열 => 한 개의 이름으로 관리 (같은 데이터형)
 * 			클래스 => 한 개의 이름으로 관리 (다른 데이터형)
 * 		= 소스 코딩 분리 => 문장 단락
 *                       -------
 *                       |메소드 : 객체지향의 핵심 => 재사용
 *                        ---- 변수 / 연산자 / 제어문
 *      = 회원가입 / 로그인 / 게시판 / 페이징 
 *        ---------------------------- 메소드 처리 => 수정(오버라이딩)
 * 
 * *** 한 개로 묶어서 저장 => 객체(클래스 변수)
 * 
 * 변수
 * 	int a=10;
 * 
 * 	주소 ------
 * 	      10 ==> 다음에 사용하기 위해 기억
 *      ------ 주소의 별칭 => 변수
 *      
 *  int[] arr=new int[5];
 *  211.148.19.111 => daum.net
 *  [I@5305068a => arr
 *  
 *  int[] arr=new int[5];
 *            --- 기본값으로 채운다
 *            int = 0
 *            double = 0.0
 *            char = '\0'
 *            boolean = false
 *            String = null
 *      -----------------
 *       0      0      0    
 *      -----------------
 *  자바  |      |      |    
 *     arr[0] arr[1] arr[2]... arr[5] => 일반 변수와 동일 (읽기 / 쓰기)
 *     
 *     배열명[인덱스]
 *     
 *     1. 읽기
 *     	    int[] arr={10,20,30,40,50}
 *     
 *     		 --------------------------------
 *            10     20     30     40     50    
 *     		 --------------------------------
 *            |      |      |      |      |
 *          arr[0] arr[1] arr[2] arr[3] arr[4]
 *         
 *         for => 숫자의 규칙
 *         ---------------
 *         
 *         일반 for문 : 수정, 저장
 *         for(int i=0;i<arr.length;i++)
 *         {
 *         		System.out.println(arr[i])
 *         }
 *         
 *         for-each : 실제 저장된 값 => 검색, 웹 출력
 *         -------- 실제 데이터 출력 => 수정 불가
 *         for(int i:arr) ==> i=10 i=20 ....
 *         {
 *         
 *         }
 *         
 *         => 변경 / 초기값 => 일반 for문
 *         => 출력 => for-each문
 *         		자바스크립트 : map(), forEach()
 *         
 *   	=> 배열 : 모든 데이터형이 가능
 *   		1) 정수 (기본형)
 *   			int[] arr={1,2,3,4,5};
 *   			int[] arr=new int[5]; => 임시 저장
 *   				=> {0,0,0,0,0}
 *   		2) 문자열 (참조형)
 *   			String[] arr={"홍길동","박문수"...}; 
 *   			String[] arr=new String[5]
 *   				=> {null,null,null,null...}
 *                      ---- 메모리 주소가 없는 경우
 *                      ---- NullPointerException
 *                      ---- 초기값
 *          3) 논리형 (기본형) => checkbox...
 *          	boolean[] arr={true,false,true,false...}
 *          	boolean[] arr=new boolean[5]
 *          		=> {false,false,false,false...}                                                            
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		
		// 출력
		/*
		 * for-each문
		 * 	for(받는 변수:배열명)
		 */
//		for(int i:arr) // i = 1020304050
//		{
//			System.out.print(i+" ");
//		}
//		
//		System.out.println();
//		for(int i=0;i<arr.length;i++)
//		{
			// 변수를 사용하려면 인덱스 번호를 이용한다
//			System.out.print(arr[i]+"");
//		}
		
		String[] names={"홍길동","심청이","춘향이", "박문수","이순신"};
		for(String name:names)
		{
			System.out.print(name+" ");
		}
		System.out.println();
		
		// 변경 / 수정
		for(int i=0;i<names.length;i++) // 인덱스 번호기 때문에 int
		{
			System.out.print(names[i]+" ");
		}
		
		/*
		 * int a=10;
		 * int b=a;
		 * b=100;
		 */
	}

}
