package com.sist.collection;
/*
 * Iterator / ListIterator
 * 	=> 단방향
 * 	=> 컬렉션이 저장된 경우 => 복잡한 데이터가 있는 경우
 *  => 크롤링
 *  	<tr> <td> ...
 *  
 *  1) 크롤링 : 태그의 구분자 => id, class
 *  	<td class="a">
 *  
 *  2) iterator 주요 기능
 *  	1. hasNext() : boolean => while
 *  	2. 실제 값 : next()
 *  	3. 삭제 : remove()
 *  
 *  3) ListIterator 주요 기능
 *  	1. hasNext(), hasPrevious()
 *            |            |
 *  	  1 2 3 4 5... 5 4 3 2 1 ...
 *  
 *  	2. next(), remove()
 *  	
 */
import java.util.*;
public class 컬렉션_4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("홍길동");
		list.add("박문수");
		list.add("심청이");
		list.add("강감찬");
		list.add("이순신");
		System.out.println("===== 일반 =====");
		for(String name:list)
		{
			System.out.print(name+" ");
		}
		System.out.println("\n===== Iterator =====");
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println("\n===== 비교 =====");
		for(String name:list)
		{
			System.out.print(name+" ");
		}
		System.out.println();
		while(it.hasNext())
		{
			System.out.print(it.next()+" "); // 출력 X
		} 
		// => iterator은 한 번 수행하면 더 이상 출력 불가능 => 일회성
		// 주 사용처 => Set
		
		System.out.println("===== Set => Iterator =====");
		Set<Integer> set=new HashSet<Integer>();
		set.add(1);set.add(2);set.add(3);set.add(4);set.add(5);
		
		Iterator<Integer> it2=set.iterator();
		while(it2.hasNext())
		{
			System.out.print(it2.next()+" ");
		}
		// 복잡한 크롤링을 할 경우에 주로 iterator 처리
		// 웹에서 사용 빈도는 거의 없다
		/*
		 * 변수 : 기본형
		 * 연산자, 제어문 => 배열 1차원
		 * 
		 * 객체지향
		 * 	=> 캡슐화, 오버라이딩
		 * 	=> 인터페이스
		 * 
		 * 라이브러리 
		 *  Object / String / StringBuffer
		 *  SetingTokenizer / Collection
		 *  Math, Random...
		 *  IO / SQL
		 *  -- 파일 다운로드 / 업로드        
		 */
		
	}

}
