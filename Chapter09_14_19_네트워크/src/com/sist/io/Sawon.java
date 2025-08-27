package com.sist.io;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 파일 제어 프로그램 (데이터관리 = 파일) => xml => 라이브러리가 별도
// XML 파일이 무겁다 => JSON => RestFul
// JSON => JavaScript : Java 호환 {} []
/*
 * 역직렬화 <= Serializable => 직렬화 
 */
@Data // getter,setter 생성
@NoArgsConstructor // 생성자 생성
@AllArgsConstructor // 매개변수 생성
public class Sawon implements Serializable{
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private String loc;
	private int pay;
	
}
