package JP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdd {
	
public static void main(String[] args) throws  IOException {

BufferedReader b=new BufferedReader (new InputStreamReader(System.in));
				System.out.println("Enter number:");
				int num=Integer.parseInt(b.readLine());
				
				if(num%2==0)
				{
					System.out.println("Even Number....");
				}
				else
				{
					System.out.println("Odd Number....");
				}
}
}

