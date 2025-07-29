// UP DOWN 게임 자동화
public class 제어문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*100)+1;
		
		int count=0;
		for(;;)
		{
			int user=(int)(Math.random()*100)+1;
			count++;
			if(com>user)
			{
				System.out.println("UP!");
			}
			else if(com<user)
			{
				System.out.println("DOWN!");
			}
			else
			{
				System.err.println("Game Over!!");
				System.out.println("입력횟수:"+count);
				break;
			}
				
		}
	}

}
