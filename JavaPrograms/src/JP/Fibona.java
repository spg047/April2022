package JP;

public class Fibona {

	public static void main(String args[]) 
	{
			int a=0,b=1;
			
			int c;
			System.out.print(a+"  "+b);
			
			for(int i=1;i<=10;i++)
			{
				
				c=a+b;
			
				System.out.println("  "+c);
				a=b;
				b=c;
			}
	}
}

