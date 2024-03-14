import java.util.Scanner;
class Test
{
	static int part(int arr[], int start,int last)
	{
	 int pivot=arr[last];
	 int i,j,temp;
	 j=start;
	 i=j-1;
	 while(j<last)
	 {
	  if(arr[j]<pivot)
	  {
	   i++;
	   temp=arr[j];
	   arr[j]=arr[i];
	   arr[i]=temp;
	  }
	  j++;
	 }
	 temp=arr[i+1];
	 arr[i+1]=arr[last];
	 arr[last]=temp;

	 return(i+1);
	}

static void Qsort(int arr[],int start,int last)
{
	int pos;
	if(start<last)
	{
	  pos=part(arr,start,last);
	  Qsort(arr,start,pos-1);
	  Qsort(arr,pos+1,last);
	}
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size: ");
	int size=sc.nextInt();
	int arr[]=new int[size];
	int i;
	System.out.println("enter "+size+" elements");
	for(i=0;i<size;i++)
	 {
	  arr[i]=sc.nextInt();
	 }
	  System.out.println("elements are\n");
	  for(i=0;i<size;i++)
	  {
	    System.out.println(arr[i]+"\t");
	  }
	  System.out.println();
	  Qsort(arr,0,arr.length-1);
	  System.out.println("after sorting\n");
	  System.out.println("elements are\n");
	  for(i=0;i<size;i++)
	  {
	   System.out.println(arr[i]+"\t");
	  }
	}

}