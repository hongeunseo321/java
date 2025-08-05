import java.io.*; // java.io 패키지에 포함된 모든 입출력 관련 클래스들을 사용하겠다는 선언
import java.util.*; // java.util 패키지에 들어 있는 모든 클래스들을 사용하겠다는 선언
import java.util.jar.Attributes.Name;
// => 검색어 받는 클래스 사용
public class 배열응용_1 {
	/*
	 * 1937|
	 * 쥬라기 월드|
	 * 액션, 모험, SF, 스릴러|
	 * https://movie-phinf.pstatic.net/20150522_110/14322815808174ge1b_JPEG/movie_image.jpg?type=m77_110_2|
	 * 크리스 프랫(오웬 그레디), 브라이스 달라스 하워드(클레어 디어링), 빈센트 도노프리오(빅 호킨스)|
	 * 2015 .06.11 개봉|
	 * 12세 관람가|
	 * 콜린 트레보로우
	 * => 배열 8개
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String movie="";
		File file=new File("c:\\javaDev\\movie.txt");
		int i=0; // 파일 읽어서 저장하는 변수
		// 한 글자 읽기 => 정수로 읽는다 'A' => 65
		FileReader fr=new FileReader(file);
		StringBuffer sd=new StringBuffer();
		while ((i=fr.read())!=-1)
		{
			// -1 : EOF
			sd.append((char)i);
		}
		fr.close();
		movie=sd.toString();
		System.out.println(movie);
		
		String[] mnos=new String[1938];
		String[] titles=new String[1938];
		String[] genres=new String[1938];
		String[] posters=new String[1938];
		String[] actors=new String[1938];
		String[] regdates=new String[1938];
		String[] grades=new String[1938];
		String[] directors=new String[1938];
		
		/*
		 * class Movie
		 * {
		 *  String mno,title,genre,poster,actor,regdate,grade,director
		 * }
		 * 
		 * Movie m=new Movie()
		 */
		
		i=0;
		String[] movies=movie.split("\n");
		for(String m:movies)
		{
//			System.out.println(m);
			String[] info=m.split("\\|"); 
//			| => 정규식에서 "또는" (OR) 으로 동작
//			\\| => 실제 | 출력 => 
			
			mnos[i]=info[0];
			titles[i]=info[1];
			genres[i]=info[2];
			actors[i]=info[4];
			grades[i]=info[6];
			i++;
		}
		
		// 1. 영화명
//		for(String s:titles)
//		{
//			System.out.println(s);
//		}
		
		// 2. 장르
//		for(String s:genres)
//		{
//			System.out.println(s);
//		}
		
		// 출연진을 입력 받아서 출연한 영화 출력
		Scanner scan=new Scanner(System.in);
		System.out.print("출연진 이름을 입력하세요 >>");
		String name=scan.next();
		
		System.out.println("===== "+name+"님의 출연작 =====");
		int count=0; // 총 몇 편 출연했는지 출력
		for(i=0;i<actors.length;i++)
		{
			if(actors[i].contains(name))
			{
				System.out.println(titles[i]);
				count++;
			}
		}
		System.out.println("총 출연 작품은 "+count+"편입니다");
		
		// 12세 관람 영화
		for(i=0;i<grades.length;i++)
		{
			if(grades[i].contains("12"))
			{
				System.out.println(titles[i]);
			}
		}
		
	}

}
