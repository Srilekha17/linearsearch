package methods;

public class Bubblesort {
public static void bubbleSort(int []a)
{
	int t;
	for(int i=0;i<=a.length;i++)
	{
		for(int j=0;j<a.length-i-1;j++)
		{
			if(a[j]<a[j+1])
			{
				t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
		}
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {2,5,7,9,6,4};
bubbleSort(a);
	

	}
}