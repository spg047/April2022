package JP;

public class MaxArr {
	public static void main(String[] args) {
		
		int[] a= {90,10,50,20,60};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			 if(max < a[i])
			 {
				 max=a[i];
			 }
		}
		System.out.println("largest ele in array is "+max);
	}

}
