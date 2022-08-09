package JP;

public class Rev {
	
	public static void main(String[] args) {
		
		String name="Shubham";
		int len=name.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
			
		}
		System.out.println("rev of name is  "+rev);
	}

}
