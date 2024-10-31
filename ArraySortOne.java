package Arrays;

public class ArraySortOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,43,12,1};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int t;
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
				
			}
			System.out.println(a[i]);
		}
		

	}

}
