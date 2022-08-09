package JP;

public class CoutWordds {

	
			public static void main(String[] args) 
			{
					String s=("Shubham 10 bb");
					String a[]=s.split("\\s+");
					
					for(int i=0;i<a.length;i++)
					{
						System.out.println(a[i]);
					}
					System.out.println(a.length);
			}
	}




