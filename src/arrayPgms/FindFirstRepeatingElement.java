package arrayPgms;

import java.util.HashSet;

public class FindFirstRepeatingElement {

	public static void main(String[] args) {
		int arr[] = { 10,2,6,5, 3,4,3, 6, 5,3 };
		int min=-1;
		HashSet<Integer> hset=new HashSet<Integer>();
		
		for(int i=arr.length-1;i>=0;i--)
		{
			if(hset.contains(arr[i]))
			{
				min=i;
			}
			else
			{
				hset.add(arr[i]);
			}
		}
		
		 if (min != -1)
	            System.out.println("The first repeating element is " + arr[min]);
	        else
	            System.out.println(
	                "There are no repeating elements");
	}
	
	

}
