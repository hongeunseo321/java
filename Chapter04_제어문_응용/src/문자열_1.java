/*
 * 	문자열
 * 	---- 자바
 * 	String => 데이터형 / 클래스형 (기능 => 메소드)
 * 	=> 사용법
 * 		String 변수명 = "문자"
 *                     ---- 제한이 없다
 *      예) 회원 정보
 *         -------- id, pwd, name, email, address, phone, post, content, birthday...
 *         
 *         게시판 정보
 *         -------- no, name, subject, content, pwd, regdate, hit...
 *      => 제공하는 기능
 *      	메소드
 *      
 *      변환
 *      	toUpperCase() : 대문자 변환
 *      	toLowerCase() : 소문자 변환
 *      	------------------------ 사용빈도가 거의 없다 => 한글 중심
 *      	***** valueOf() : 모든 데이터형을 문자열로 변환
 *                 웹 / 윈도우 => 모든 데이터형 String
 *                               valueOf(10) => "10"
 *      비교
 *      	equals() => 대소문자 구분하여 문자열 비교
 *      	equalsIgnoreCase() => 대소문자 구분하지 않고 문자열 비교
 *      	contains() => 포함 문자열 확인
 *      	startsWith() => 시작 문자열 확인
 *      	endsWith() => 끝 문자열 확인 => 확장
 *      
 *      검색
 *      	Hello Java
 *      	0123456789
 *      	indexOf(a) => 앞에서부터 검색 => 7
 *      	lastIndexOf(a) => 뒤에서부터 검색 => 9
 *      
 *      제어
 *      	substring(자르는 범위의 시작 위치, 끝 위치) => 문자를 자르기
 *                                        |end-1
 *      	split() => 문자별 자르기
 *      	trim() => 공백 문자 제거
 */
// substring
import java.io.*;
import java.util.*;
public class 문자열_1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String msg="Hello Java";
		// 1. 공백 포함 문자의 개수 => length()
		int leng=msg.length();
		System.out.println("문자 개수:"+leng);
		// 2. 자르기
		String s=msg.substring(6);
		System.out.println(s);
		s=msg.substring(0, 5);
		// substring(beginIndex, endIndex);
		//                       -------- endIndex-1
		System.out.println(s);
		String name="문자열_1.java";
		String ext=name.substring(name.indexOf(".")+1);
		System.out.println(ext);
		
//		File dir=new File("c:\\javaDev");
//		File[] lists=dir.listFiles();
//		// ./ => 현재 폴더(Directory)
//		// .. => 상위 폴더로 변경(Directory) => 현재 위치에서 한 단계 위로 이동
//		for(File f:lists)
//		{
//			if(f.isFile()) // isDirectory() => 폴더
//			{
//				String ss=f.getName();
//				System.out.println(ss);
//				System.out.println(ss.substring(ss.lastIndexOf(".")+1));
//			}
//		}
		
		String msg1=" Hello Java!! ";
		System.out.println(msg1.length());
		String ss=msg1.trim();
		System.out.println(ss.length());
		// trim() => 공백 문자 제거 => 좌우만 해당
		// trim() => 검색, 로그인, 아이디 중복 체크
		// substring() => 지역 확인 (02, 041...)
		
		String msg2="Java Oracle HTML CSS JavaScript"
				+"JSP JQuery Ajax SpringFramework VueJS"
				+"SpringBoot Git GitAction Docker Docker-Compose"
				+"Jenkins React Next TypeScript MSA Chatting NodeJS";
		String[] datas=msg2.split(" "); // split => 잘라서 여러 조각으로 나누는 함수
		Scanner scan=new Scanner(System.in);
		System.out.print("단어 입력:");
		String d=scan.next();
		for(String data:datas)
		{
//			System.out.println(data);
//			data.startsWith(d)
//			data.endsWith(d)
//			data.contains(d))
//			data.equals(d) => 대소문자 구분
			if(data.equalsIgnoreCase(d))
			{
				System.out.println(data);
			}
		}
	}

}
