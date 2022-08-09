package JP;


public class Factmam
{
		public static void main(String[] args) 
		{
				int num=4,fact=1;
				if(num==0)
				{
					System.out.println("Factorial is 1");
				}
				else
				{
					for(int i=1;i<=num;i++)
					{
						fact=fact*i;
					}
					System.out.println("Factorial:"+fact);
				}
		}
}
