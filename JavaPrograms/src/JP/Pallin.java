package JP;

public class Pallin {
	
	public static void main(String[] args) {
		
		int no=1221;
		int temp=no;
		int rev=0,rem;
		
		  while(temp!=0)
		      {
			        rem=temp%10;
			        rev=rev*10+rem;
			        temp=temp/10;  
		      }
		  if(no==rev)
		  {
			  System.out.println("pallindrome no");
		  }
		  else
		  {
			  System.out.println("not pallindrome");
		  }
	}

}
