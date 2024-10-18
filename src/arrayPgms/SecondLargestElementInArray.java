package arrayPgms;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		int largest=0, second=0,j=0;
		int arr[] = { 12, 35, 1,40, 10, 34, 1 ,36,45};
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j]&& arr[largest]<arr[j])
				{
					second=largest;
					largest=j;
					i=j;
				}
				else if(arr[i]<arr[j]&& arr[second]<arr[j])
				{
					second=j;
				}
			}
			
		}
		System.out.println("Second Largest = " +arr[second]);

	}

}
