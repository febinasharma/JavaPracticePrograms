package arrayPgms;

import java.util.Arrays;

public class RemoveDuplicatesFromAnArray {

	public static void main(String[] args) {
		int arr[]= {5,3,7,12,11,4,5,3,7,2,4,5};
		int count=0,j,k=0,i;
		int temp[]=new int[arr.length-1];
		Arrays.sort(arr);

		for(i=0;i<arr.length-1;i++)
		{
			System.out.print(" "+arr[i]);
		}
		for(i=0;i<arr.length-1;i++)
		{
			j=i+1;
			if(arr[i]!=arr[j])
			{
				temp[k]=arr[i];
				k++;
			}
			else
			{
				count+=1;
			}
			
		}
		temp[k]=arr[i];
		count=arr.length-count;
		System.out.println();
		for(i=0;i<count;i++)
		{
			System.out.print(" " +temp[i]);
		}
		
		
	}

}
