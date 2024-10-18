package arrayPgms;

public class LargestAndSmallestInUnsortedArray {

	public static void main(String[] args) {
		int arr[]= {7,4,12,51,6,7,30,22,7,3,13,9};
		
		int largest=Integer.MIN_VALUE, smallest=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(j!=i && arr[j]>arr[i]&& largest<arr[j])
					
					largest=arr[j];
				else if(j!=i && arr[j]<arr[i]&& smallest>arr[j])
					smallest=arr[j];
			}
		}
		
		System.out.println("Smallest: "+smallest+ "\t Largest: "+largest);

	}

}
