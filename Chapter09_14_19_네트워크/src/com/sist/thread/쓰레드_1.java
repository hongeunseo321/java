package com.sist.thread;
/*
 * 프로세스 : 실행중인 프로그램
 * 쓰레드 : 프로세스 내에서 실행되는 작은 단위 (실행 단위)
 * ** 모든 프로세스는 한 개 이상의 쓰레드를 가지고 있다
 * 
 * 자바에서 쓰레드 생성 방법
 * -------------------
 *  => 게임 / 네트워크 (서버 = 웹서버) => 자바 : 인트라넷
 *           ------ 흐름만 파악
 *           
 *  1. Thread 상속
 *  	class AThread extends Thread
 *  2. 인터페이스 구현
 *  	class BThread implement Runnable
 *  3. Thread Pool : 미리 생성
 *                   -------
 *                   장점 => 속도가 빠르다 
 *                   단점 => 사용하지 않는 쓰레드가 존재한다
 *                   
 *      ** 스레드는 주로 Connection Pool (데이터베이스 연동) 사용
 *      Pool 작동 방식
 *       1) 서버 시작 시, DB 연결을 5~10개 미리 생성 → Pool에 저장
 *       2) 클라이언트 요청 발생 → 연결 하나 꺼내서 사용
 *       3) 사용 끝나면 연결을 닫는 게 아니라 반환함 → 다시 Pool로 돌아감
 *       4) 다음 요청은 그 연결을 다시 사용
 *   
 *  4. 크롤링에서 사용
 *  
 *  5. 나눠서 작업 
 *     --------
 *     장점 => 속도가 빠르다
 *     단점 => 다른 쓰레드에 영향을 준다 => 쓰레드 충돌 => 블루 스크린 
 *         
 *     ------------------
 *     ** 프로세스는 독립적이다
 *     ------------------
 *      밥을 먹는 일 => 프로세스
 *      --------- 밥을 짓는다, 반찬, 수저 준비... => 쓰레드
 *     
 *  6. 자바 프로그램
 *     ---------- 프로세스
 *                ------ main / gc
 *        
 *  7. 쓰레드는 CPU가 시분할해서 처리 
 *  
 *              NEW               // new Thread() 호출 → 아직 실행 안됨
 *               |
 *               |  start()       // start() 호출 시 OS에 스레드 실행 요청
 *               ↓
 *            Runnable            // 실행 대기 상태 (CPU 할당 대기 중)
 *               |
 *               |  (OS가 스케줄링 → CPU 할당)
 *               ↓
 *            Running             // run() 메소드 실행 중 (CPU 사용)
 *               |
 *      ┌────────┴────────┐
 *      ↓                 ↓
 *  Blocked            Waiting / Timed_Waiting
 *  (lock 등 자원 대기) (sleep, join, wait 등으로 일시 정지)
 *      ↑                 ↑
 *      └──── notify(), unlock(), 시간 경과 등 ─────┘
 *               |
 *               ↓
 *            Runnable            // 다시 실행 준비 상태로 복귀
 *               |
 *               ↓
 *             Dead (Terminated)  // run() 끝나거나 예외 발생 
 *                                   또는 interrupt() 등으로 종료
 */
// 한 가지 일만 수행
class MyThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(getName()+":"+i);
			try
			{
				Thread.sleep(100);
			}catch(Exception ex) {}
		}
	}
}
public class 쓰레드_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
		// new 쓰레드 생성
		MyThread m1=new MyThread();
		MyThread m2=new MyThread();
		MyThread m3=new MyThread();
		MyThread m4=new MyThread();
		MyThread m5=new MyThread();
		
		m1.setName("홍길동");
		m2.setName("심청이");
		m3.setName("강감찬");
		m4.setName("이순신");
		m5.setName("박문수");
		
		m1.setPriority(1);
		m2.setPriority(3);
		m3.setPriority(2);
		m4.setPriority(4);
		m5.setPriority(10); // 우선 순위 10이 가장 빠르다
		/*
		 * NEW
		 * 	= 이름 부여     main => MAX => 10
		 * 	= 우선 순위 ==> 사용자 정의 NORM_PRIORITY => 5
		 *                gc => MIN => 1 
		 *                
		 *  ** 이름 변경 => setName()
		 */
		// start
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		m5.start();
	}

}
