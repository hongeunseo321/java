package com.sist.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
 * 15장(컬렉션) / 13장(제네릭스)
 * 	
 * 	13장 / 16장 / 17장 / ***19장
 *               ---   ------- 오라클과 동시에 SQL문장 학습
 *               네트워크
 *               
 *  9장 / 14장 / 18장 => 동시에 학습, 흐름만 파악
 *  
 * Collection
 * ----------
 *  1) 데이터를 묶어서 쉽게 관리할 수 있게 만든 클래스의 집합
 *     ------------------ 자료구조 (스택, 큐, 데큐)
 *  
 *  2) Collection Framework
 *                ---------
 *                => 표준화 (동일한 형태의 소스 코딩)
 *                => Spring / MyBatis / JQuery
 *                   Vue / React
 *                => 일정 틀 (쉽게 개발자의 코딩 분석) 
 *                
 *  3) 배열의 단점을 보완
 *     --- 고정적 => 가변형
 *  
 *  4) 종류
 *  
 *             Collection (interface)
 *             ---------------------
 *                       |
 *          ---------------------------
 *          |            |            |
 *         List         Set          Map => interface
 *          |            |            |
 *          |    ---------            ---------
 *          |    |       |            |       |
 *          | HachSet TreeSet     Hashtable HashMap 
 *          |
 *          |    구현된 클래스
 *          -------------------- 
 *          |        |         |
 *      ArrayList  Vector  LinkedList
 *                              |       
 *                            Queue
 *                
 *      List
 *       1) 순서를 가지고 있다 (인덱스 번호) => 0
 *       2) 데이터 중복 저장 허용
 *       3) CRUD를 주로 사용 (추가, 읽기, 수정, 삭제)
 *       4) 비동기적 => 속도가 빠르다 => 데이터베이스 사용
 *       5) 주요 기능
 *          -------
 *          1. 데이터 추가 : add(Object)
 *          2. 데이터 읽기 : get(int index)
 *          3. 데이터 수정 : set(int index, Object)
 *          4. 데이터 삭제 : remove(int index)
 *          5. 데이터 개수 : size() 
 *          6. 데이터 전체 삭제 : clear()
 *          7. 데이터 존재 여부 : isEmpty()
 *           
 *       6) 구현된 클래스
 *           = ArrayList
 * 				=> 내부구조 : 배열
 * 				=> 인덱스 접근 속도 : 빠름 (O(1))
 * 				=> 삽입 / 삭제 속도 : 느림 (O(n))
 * 				=> 동기화 : X
 * 				=> 멀티 스레드 적합 : X
 * 				=> 메모리 증가 방식 : 1.5배씩 증가
 * 				=> 사용 권장 : 일반적인 경우
 *           
 *           = Vector 
 * 				=> 내부구조 : 배열
 * 				=> 인덱스 접근 속도 : 빠름 (O(1))
 * 				=> 삽입 / 삭제 속도 : 느림 (O(n))
 * 				=> 동기화 : O
 * 				=> 멀티 스레드 적합 : O
 * 				=> 메모리 증가 방식 : 2배씩 증가
 * 				=> 사용 권장 : 멀티스레드 안전 필요 시
 *           
 *           = LinkedList
 * 				=> 내부구조 : 이중 연결 리스트 (양방향 통신) => 메모리가 커진다
 * 				=> 인덱스 접근 속도 : 느림 (O(n))
 * 				=> 삽입 / 삭제 속도 : 빠름 (O(1) ~ O(n))
 * 				=> 동기화 : X
 * 				=> 멀티 스레드 적합 : X
 * 				=> 메모리 증가 방식 : 노드 단위 할당
 * 				=> 사용 권장 : 잦은 삽입 / 삭제 작업 시
 *       
 *       7) import 추가 => java.util
 *       
 *      Set
 *       1) 순서가 없다 (인덱스 X)
 *       2) 중복된 데이터 허용 X
 *           add(1) add(2) add(1) add(2) => 데이터 2개
 *       3) 주로 사용 ==> List에 중복된 데이터 제거
 *       4) 구현된 클래스 : HashSet, TreeSet
 *       5) 주요 기능
 *          -------
 *          1. 데이터 추가 : add(Object)
 *          2. 데이터 읽기 : get()
 *          3. 데이터 수정 : set(Object)
 *          4. 데이터 삭제 : remove(Object)
 *          5. 데이터 개수 : size() 
 *          6. 데이터 전체 삭제 : clear()
 *          7. 데이터 존재 여부 : isEmpty()
 */
public class 라이브러리_컬렉션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList names=new ArrayList();
//		Vector names=new Vector();
//		LinkedList names=new LinkedList();
		List names=new Vector();
		
		// 추가
		names.add("홍길동"); // 0
		names.add("박문수"); // 1
		names.add("심청이"); // 2 => 3
		
		System.out.println("현재 인원:"+names.size());
		for(Object obj:names)
		{
			System.out.println(obj);
		}
		
		System.out.println();
		names.add("이순신"); // 3 => 4
		names.add(2,"강감찬"); // 2
		
		System.out.println("현재 인원:"+names.size());		
		for(Object obj:names)
		{
			System.out.println(obj);
		}
		
		System.out.println();
		names.remove(0); // 0번에 있는 데이터 삭제
		System.out.println("현재 인원:"+names.size());		
		for(Object obj:names)
		{
			System.out.println(obj);
		}
		
		System.out.println();
		names.set(2, "춘향이"); // 2번에 있는 데이터 춘향이로 수정
		System.out.println("현재 인원:"+names.size());		
		for(Object obj:names)
		{
			System.out.println(obj);
		}
		
		System.out.println();
		names.clear();
		System.out.println("현재 인원:"+names.size());		
		for(Object obj:names)
		{
			System.out.println(obj);
		}
		
		if(names.isEmpty())
		{
			System.out.println("인원이 없습니다");
		}
	}

}
