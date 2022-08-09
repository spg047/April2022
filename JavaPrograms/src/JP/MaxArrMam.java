package JP;

public class MaxArrMam {
	
	public static void main(String[] args) 
	{
			int a[]= {90,10,50,20,60};
			int size=a.length;
			System.out.println(size);
			int temp;
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println(a[size-1]);
	}
}
