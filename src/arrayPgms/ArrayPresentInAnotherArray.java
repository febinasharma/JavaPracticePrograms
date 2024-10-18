package arrayPgms;

import java.util.Arrays;

public class ArrayPresentInAnotherArray {

	public static void main(String[] args) {
		int count=0;
		int[] arr1= {3,8,1,7,3};
		int[] arr2= {8,8,1,9,3,4,7};
		
//		Arrays.sort(arr1);
//		Arrays.sort(arr2);
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
						{
							count++;
							break;
						}
			}
		}
		
		if(count==arr1.length)
			System.out.println("Array 1 is present in Array 2");
		else
			System.out.println("Array1 is not present in Array2");

	}

}
