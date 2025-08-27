package com.sist.io;
// 파일 생성 / 삭제 => createNewFile / delete
// => 폴더 생성
import java.io.*;
public class 입출력_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir=new File("c:\\upload");
		
		// 1. 확인
		if(!dir.exists())
		{
			dir.mkdir();
		}
		
		File file=new File("c:\\upload\\student.txt");
		try
		{
			if(!file.exists())
			{					
				file.createNewFile();
				System.out.println("파일 생성 완료");
			}			
		}catch(Exception ex) {}
		
		
		// 삭제
		try
		{
			if(file.exists())
			{
				file.delete();
				dir.delete(); // 디렉토리가 비어있을 때만 삭제 가능 => rm -rf 사용
				/*
				 * delete() => 디렉토리 안에 파일이나 하위 디렉토리가 있으면 false를 반환
				 * -r: 디렉토리와 그 하위 내용 전부를 재귀적으로 삭제
				 * -f: 강제로 삭제 (존재하지 않아도 에러 출력 안 함)
				 * 디렉토리가 비어 있든 아니든 무조건 삭제
				 */
				System.out.println("폴더 삭제 완료");
			}
		}catch(Exception ex) {}
	}

}
