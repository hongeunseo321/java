// 암호화 => encryption으로 암호화하고, decryption으로 복호화
// 		   encoding으로 변환해서 값 보내고 decoding으로 복원
// 시저스암호화 (3칸 이동 ABC => DEF), ED25519, RSA...
// https://www.google.com/search?q=%EC%9E%90%EB%B0%94&oq=%EC%9E%90%EB%B0%94&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTINCAEQABiDARixAxiABDINCAIQABiDARixAxiABDIGCAMQRRg7Mg0IBBAuGMcBGNEDGIAEMgoIBRAAGLEDGIAEMg0IBhAAGIMBGLEDGIAEMg0IBxAuGMcBGNEDGIAEMgoICBAAGLEDGIAEMgcICRAAGIAE0gEJMjE1MmowajE1qAIIsAIB&sourceid=chrome&ie=UTF-8
// %EC%9E%90%EB%B0%94
import java.io.UnsupportedEncodingException;
import java.net.*;
public class 메소드_5 {
	static String encoder(String s) throws Exception
	{
		return URLEncoder.encode(s, "UTF-8");
	}
	static String decoder(String s) throws Exception
	{
		return URLDecoder.decode(s, "UTF-8");
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		String s="자바";
//		String en=URLEncoder.encode(s, "UTF-8");
//		System.out.println(en);
//		String ko=URLEncoder.encode(s, "UTF-8");
//		System.out.println(ko);
		int a=10;
		int b=0;
		try // 예외가 발생할 수 있는 위험한 코드를 실행
		{
		System.out.println(a/b); // 예외가 발생할 수 있는 코드
		}catch(Exception e) {} // 예외가 발생했을 때 그걸 잡아서 처리(복구)
		System.out.println("프로그램 종료");
	}

}
