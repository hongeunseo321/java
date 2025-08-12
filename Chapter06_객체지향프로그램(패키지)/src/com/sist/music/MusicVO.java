package com.sist.music;

import lombok.Data;

// 데이터 보호는 어렵다 => 메소드를 이용해서 접근한다
@Data
public class MusicVO {
	private int mno; // 뮤직 번호
	private String title; // 곡명
	private String singer;
	private String album;
	private String state;
	private int idcrement; // 등폭
	
}


