/*
 * 클래스
 * 	= 데이터 클래스 > 관련된 변수를 모아서 관리
 * 		=> 배열 대체
 * 		=> ~VO, ~DTO
 * 	= 액션 클래스 > 기능을 모아서 관리
 *               --- 메소드
 *		=> ~DAO, ~Service, ~Manager
 *         오라클   브라우저     크롤링
 * 	= 혼합 클래스
 * 		=> 변수 + 메소드
 * 		=> ~Controller : 조립
 * 
 * 데이터 관리 클래스 => 사용자 정의 데이터형
 *                  ----------------
 *                    데이터형을 제작
 * 	class : 필요한 데이터를 모아서 사용
 *  ----------------------------
 *   | 배열
 *   | 클래스 배열 String[]
 *   학생 => 학생[]
 *  ----------------------------
 *  기본형
 *  	int a=10;
 *  1. 메모리 할당 => 메모리 크기를 결정 => 저장
 *  	class 맛집
 *  	{
 *  		int no;
 *  		String name;
 *  		String address;
 *  		.
 *  		.
 *  		.
 *  	}
 *  
 *  	맛집 a=new 맛집();
 *       |  |  |  ----- 생성자 => 메모리에 초기화 값을 등록
 *       |  |  |  ----- 생략이 가능 (import, void같은...)
 *       |  |  |        --- 컴파일러에 의해 자동 생성
 *       |  |  ㄴ메모리를 맛집 크기에 만들어서 저장
 *  	 |  ㄴ변수(객체)
 *       ㄴ데이터형
 *     
 *  	맛집 a1=new 맛집();
 *  	맛집 a2=new 맛집();
 *  	맛집 a3=new 맛집();
 *  	
 *  	***
 *  	맛집 a1=new 맛집();
 *  	int a=10
 */
// =>
/*
 * class className
 * {
 * 		1. 기본형
 * 			번호 / 랭크 / 평점 ...
 * 		2. 클래스 => String 이름
 * 		3. 배열 => 출연, 이미지... : 캡슐화(데이터 보호)
 * 		=> 메소드 : 기능 => 상속, 수정(오버라이딩), 추가(오버로딩)
 * }                          -------------------------
 *                                      다형성
 */
class Student
{
	int hakbun; // 0
	String name; // null
	int kor; // 0
	int eng; // 0
	int math; // 0
}
/*
 * Student hong=new Student();
 *   Stack        Heap
 * --hong--
 *  0x100 ===>============
 * --------     -hakbun- hong.hakbun(0)
 *                 0     hong.hakbun=1
 * 				--name-- hong.name
 * 			       0
 * 				--kor--- hong.kor
 *                 0
 *   			--eng--- hong.eng
 *                 0
 *   			--math-- hong.math
 *                 0
 *   			--------
 *   		  ============
 */
/*
 * Student shim=new Student();
 *   Stack        Heap
 * --shim--
 *  0x200 ===>============
 * --------     -hakbun- shim.hakbun(0)
 *                 0     shim.hakbun=1
 * 				--name-- shim.name
 * 			       0
 * 				--kor--- shim.kor
 *                 0
 *   			--eng--- shim.eng
 *                 0
 *   			--math-- shim.math
 *                 0
 *   			--------
 *   		  ============
 */
public class 클래스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong=new Student();
		
		// 값을 저장
		System.out.println("hong="+hong);
		hong.hakbun=1;
		hong.name="홍은서";
		hong.kor=90;
		hong.eng=80;
		hong.math=70;
		
		System.out.println("학번:"+hong.hakbun);
		System.out.println("이름:"+hong.name);
		System.out.println("국어:"+hong.kor);
		System.out.println("영어:"+hong.eng);
		System.out.println("수학:"+hong.math);
		
		Student shim=new Student();
		System.out.println("shim="+shim);
		shim.hakbun=2;
		shim.name="심청이";
		shim.kor=90;
		shim.eng=80;
		shim.math=70;
		System.out.println("학번:"+shim.hakbun);
		System.out.println("이름:"+shim.name);
		System.out.println("국어:"+shim.kor);
		System.out.println("영어:"+shim.eng);
		System.out.println("수학:"+shim.math);
	}

}
