// 프로그램 => 데이터
/*
 * 	searchMainDailyBoxOffice.do => 1
 *  searchMainRealTicket.do => 2
 *  searchMainDailySeatTicket.do => 3 
 *  
 *  https://www.kobis.or.kr/kobis/business/main/
 */
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
public class 제어문_5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub;
		String url="https://www.kobis.or.kr/kobis/business/main/";
		Scanner scan=new Scanner(System.in);
		while(true) // 사용자에 의해 종료 => 무한루프
		{
			System.out.println("====== 메뉴 ======");
			System.out.println("1. 박스오피스 순위");
			System.out.println("2. 실시간 예매율 순위");
			System.out.println("3. 좌석 점유율 순위");
			System.out.println("4. 종료");
			
			System.out.println("메뉴 선택:");
			int menu=scan.nextInt();
			
			// 오류 처리
			if(menu<1 || menu>4)
			{
				System.out.println("🚫없는 메뉴입니다! 다시 선택하세요🚫");
				continue; // 다시 메뉴로 이동
			}
			
			if(menu==4)
			{
				System.out.println("프로그램 종료");
				break;
			}
			else if(menu==1)
			{
				url+="searchMainDailyBoxOffice.do";
				Document doc=
						Jsoup.connect(url).get();
				System.out.println(doc.toString());
				String movie=doc.toString();
				// substring(start,end) => 데이터를 원하는만큼 자른다
				//           포함   미포함
				movie=movie.substring(movie.indexOf("["),
						movie.lastIndexOf("]")+1);
//				System.out.println(movie);
				JSONParser jp=new JSONParser();
				// [{},{}] => json => javascript object nontation
				// 자바스크립트 객체 표현법
				// ajax
				JSONArray arr=(JSONArray)jp.parse(movie);
				System.out.println(arr);
				// [] => JSONArray {} => JSONObject
				for(int i=0;i<arr.size();i++)
				{
					JSONObject obj=(JSONObject)arr.get(i);
					System.out.println((i+1)+"."+obj.get("movieNm"));
				}
			}
			else if(menu==2)
			{
				url+="searchMainRealTicket.do";
				Document doc=
						Jsoup.connect(url).get();
				System.out.println(doc.toString());
				String movie=doc.toString();
				// substring(start,end) => 데이터를 원하는만큼 자른다
				//           포함   미포함
				movie=movie.substring(movie.indexOf("["),
						movie.lastIndexOf("]")+1);
//				System.out.println(movie);
				JSONParser jp=new JSONParser();
				// [{},{}] => json => javascript object nontation
				// 자바스크립트 객체 표현법
				// ajax
				JSONArray arr=(JSONArray)jp.parse(movie);
				System.out.println(arr);
				// [] => JSONArray {} => JSONObject
				for(int i=0;i<arr.size();i++)
				{
					JSONObject obj=(JSONObject)arr.get(i);
					System.out.println((i+1)+"."+obj.get("movieNm"));
				}
			}
			else if(menu==3)
			{
				url+="searchMainDailySeatTicket.do";
				Document doc=
						Jsoup.connect(url).get();
				System.out.println(doc.toString());
				String movie=doc.toString();
				// substring(start,end) => 데이터를 원하는만큼 자른다
				//           포함   미포함
				movie=movie.substring(movie.indexOf("["),
						movie.lastIndexOf("]")+1);
//				System.out.println(movie);
				JSONParser jp=new JSONParser();
				// [{},{}] => json => javascript object nontation
				// 자바스크립트 객체 표현법
				// ajax
				JSONArray arr=(JSONArray)jp.parse(movie);
				System.out.println(arr);
				// [] => JSONArray {} => JSONObject
				for(int i=0;i<arr.size();i++)
				{
					JSONObject obj=(JSONObject)arr.get(i);
					System.out.println((i+1)+"."+obj.get("movieNm"));
				}
			}


		}
	}

}
