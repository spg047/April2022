package JP;

public class SwapNot3 {
	
	public static void main(String[] args) {
		int a=10,b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("now a is "+a);
		System.out.println("b is"+b);
	}

}
