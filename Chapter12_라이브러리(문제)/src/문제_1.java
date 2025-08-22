/*
문제 1

예외에 대한 설명 중 틀린 것은 무엇입니까?

① 예외는 사용자의 잘못된 조작, 
   개발자의 잘못된 코딩으로 인한 프로그램 오류를 말한다.
② RuntimeException의 하위 예외는 컴파일러가 예외 처리 코드를 체크하지 않는다.
③ 예외는 try-catch 블록을 사용해서 처리된다.
④ 자바 표준 예외만 프로그램에서 처리할 수 있다.


문제 2

try-catch-finally 블록에 대한 설명 중 틀린 것은 무엇입니까?

① try { } 블록에는 예외가 발생할 수 있는 코드를 작성한다.
② catch { } 블록은 try { } 블록에서 발생한 예외를 처리하는 블록이다.
③ try { } 블록에서 return문을 사용하면 finally { } 블록은 실행되지 않는다.
④ catch { } 블록은 예외의 종류별로 여러 개를 작성할 수 있다.


문제 3

throws에 대한 설명으로 틀린 것은 무엇입니까?

① 생성자나 메소드의 선언 끝 부분에 사용되어 내부에서 발생된 예외를 떠넘긴다.
② throws 뒤에는 떠넘겨야 할 예외를 쉼표(,)로 구분해서 기술한다.
③ 모든 예외를 떠넘기기 위해 간단하게 throws Exception으로 작성 할 수 있다.
④ 새로운 예외를 발생시키기 위해 사용된다.


문제 4

throw에 대한 설명으로 틀린 것은 무엇입니까?

① 예외를 최초로 발생시키는 코드이다.
② 예외를 호출한 곳으로 떠넘기기 위해 메소드 선언부에 작성된다.
③ throw로 발생된 예외는 일반적으로 생성자나 메소드 선언부에 throws로 떠넘겨진다.
④ throw 키워드 뒤에는 예외 객체 생성 코드가 온다.


문제 5

다음과 같은 메소드가 있을 때 예외를 잘못 처리한 것은 무엇입니까?

public void method1() throws NumberFormauException, ClassNotFoundException { ... }

① try{ method1(); } catch (Exception e) { }
② void method2() throws Exception { method1();  }
③ try{ method1(); } catch (Exception e) { } catch (ClassNotFoundException e) { }
④ try{ method1(); } catch (ClassNotFoundException e) { } catch (NumberFormauException e) { }


문제 6

다음 코드가 실행되었을 때 출력 결과는 무엇입니까?

public class TryCatchFinallyExample {
	public static void main(String[] args){
    	String[] strArray = { "10" , "2a" };
        int value = 0;
        for(int i = 0; i <= 2; i++ ){
        	try{
            	value = Integer.parseInt(strArray[i]);
            } catch(ArrayIndexOutOfBoundException e){
            	System.out.println("인덱스를 초과했음");
            } catch(NumberFormatException e) {
            	System.out.println("숫자로 변환할 수 없음");
            } finally {
            	System.out.println(value);
            }
        }
    }
}


String 클래스의 주요 메소드 문제 (다음 설명에 맞는 메소드의 원형을 작성하시오)

1.  문자열이 지정한 문자로 시작하는지 판단 같으면 true반환 아니면 false를 반환한다.(대소문자구별)
 

2. 문자열 마지막에 지정한 문자가 있는지를 판단후 있으면 true, 없으면 false를 반환한다.(대소문자구별)


3. 두개의 String에 값만을 비교해서 같으면 true, 다르면 false를 반환한다.(대소비교)


4. 지정한 문자가 문자열에 몇번째에 있는지를 반환한다.


5. 문자열에 지정한 문자가 마지막몇번째에 있는 int를 반환한다.


6. 문자열의 길이를 반환한다.


7. 문자열에 지정한 문자" "가 있으면 새로 지정한 문자" "로 바꿔서 출력한다.


8. 정규표현식을 지정한 문자로 바꿔서 출력한다.


9. 지정한 문자로 문자열을 나눌수 있다.(배열로 반환)


10. 문자열에 지정한 범위에 속하는 문자열을 반환한다.(시작범위에 값은 포함하고, 끝나는 범위에 값은 포함하지않는다.)


11.  문자열에 대문자를 소문자로 변환한다.


12. 문자열에 소문자를 대문자로 변환한다.


13. 문자열을 그대로 반환해준다.


14. 문자열에 공백을 제거해 준다.
 

15. 지정한 개체의 원시 값을 반환 (데이터형을 문자열로 변경)

 
16. 두개의 String을 비교해서 비교대상 String을 포함하고 있으면true, 다르면 false를 반환한다.


17. 지정한 index번째에 문자를 반환한다.


18. 문자와 문자를 결합해준다.


19. 서식문자열을 이용해서 서식화된 문자열을 반환한다.
 


----------------------------------------------
Object 클래스의 주요 메소드

1. 객체의 복사본을 만들어 리턴한다.
2. 현재 객체와 매개 변수로 넘겨 받은 객체가 같은지 확인한다. 
	같으면 true를 다르면 false를 리턴한다.
3. 현재 객체가 더이상 쓸모가 없어졌을 경우
	가비지 컬렉터에 의해서 이 메소드가 호출된다.
4. 객체를 문자열로 표현하는 값을 리턴한다. 
----------------------------------------------
 */
public class 문제_1 {

}
