/*
 * 1. 배열
 * 		= 배열 선언
 * 			1) 배열의 개수
 * 
 * 		= 배열 초기화
 * 			1) 명시적 초기화
 * 				int[] arr={1,2,3,4,5}
 * 			2) ***파일 읽기
 * 			3) ***데이터베이스 읽기
 * 			4) ***크롤링
 * 			5) 임의 추출
 * 			6) 입력값
 * 
 * 		= 배열 출력
 * 			1) 일반 for => 인덱스 번호를 불러오는 경우
 * 			2) for-each => 출력만 하는 경우
 * 		
 * 		= 정수 배열 / 문자열 배열
 * 
 * 2. 배열 특징
 * 		변수 : 한 개만 저장하는 메모리 공간
 * 		----------------------------
 * 		| 변수 여러 개를 묶어서 한 번에 저장공간 설정 => 배열
 * 		| 데이터 관리를 쉽게 만들어준다
 * 		int a1...int a12000 => int[] arr=new int[12000]
 * 
 * 		문법 => 데이터형 / 변수 / 연산자 / 제어문
 * 		--- 묶어서 라이브러리를 연결 => 조립
 * 
 * 		=> 로그인 : if ~ else
 * 		=> 회원가입 : if ~ else
 * 		=> 목록 출력 : for
 * 		=> 예약 : if, for
 * 
 * 		단점
 * 			= 메모리를 연속적으로 생성 => 데이터형(메모리 크기)이 동일한 조건 만족
 * 				=> 변수명을 자동으로 부여
 * 				---------------------------------
 *                 10      20      30      40
 *          	---------------------------------
 *           	배열명[0] 배열명[1] 배열명[2] 배열명[3] 
 *           	------- 변수와 동일
 *                   	--- 읽기 / 쓰기 (저장, 수정)
 *          	int[] arr=new int[5]
 *          	arr[0]=100;
 *          	arr[1]=200;
 *          
 *          	=> System.out.println(arr[0])
 *          
 *          	int a=100
 *          	int a=10,b=30,c=40,d=50,e=100; // for문 불가능
 *          
 *          	=> for문을 사용하려면 반드시 변수명이 1개여야 가능
 *          	*** 배열문은 변수명 1개만 사용
 *          
 *          = 한 번 선언하면 변경이 불가능
 *          	int[] arr=new int[5];
 *          	int[] arr2=arr;
 *          	arr2[0]=100;
 *          	=> 새로운 변수명을 통해서 변경
 *          
 *          	int[] arr3=arr.clone();
 *          	=> 새로운 공간에 복제하기 때문에 변경 불가
 */
public class 배열정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr=new int[5];
//		System.out.println(arr);           
//		int[] arr2=arr; 
//		System.out.println(arr2);
//		arr2[0]=100;
//		System.out.println(arr[0]);
//		int[] arr3=arr.clone(); // clone() => 새로운 공간에 복제
//		arr3[0]=1000;
//		System.out.println(arr[0]); // 100 출력
		
		int[] arr= {1,2,3,4,5};
//		int[] arr2=new int[10];
//		for(int i=0;i<arr.length;i++)
//		{
//			arr2[i]=arr[i];
//		}
		int[] arr2=new int[10];
				
		
	}

}
