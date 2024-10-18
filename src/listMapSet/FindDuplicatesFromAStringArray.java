package listMapSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicatesFromAStringArray {

	public static void main(String[] args) {
		String[] str= {"this","is","java","and","java","is","good"};

		
		Map<String,Integer> map=new HashMap<String,Integer>();
				
		
		for(String s:str)
		{
			if(map.containsKey(s))
			{
				map.put(s, map.get(s)+1);				
			}
			else
				map.put(s,1);
		}
		
		System.out.println("Keys with count: "+map);
		
		System.out.println("\n\n\t*******Only Duplicates******\n\n\t Using SET\n");
		
		
		Set<String> keyset=new HashSet<String>(map.keySet());
		for(String s:keyset)
		{
			if(map.get(s)>1)
				System.out.println("Key:  "+s+ "   Value: "+map.get(s));
		}
		
		System.out.println("\n\tUsing ENTRY\n");
		Set<Entry<String,Integer>> entryset=map.entrySet();
		for(Entry<String,Integer> entry:entryset)
		{
			if(entry.getValue()>1)
			{
				System.out.println("Key: "+entry.getKey()+ "    Value: "+entry.getValue());
			}
		}
		
//		System.out.println("\n USING ITERATOR\n");
//		
//		Iterator<String> it=keyset.iterator();
//		while(it.hasNext()) 
//		{
//			
//				System.out.println(it.next());
//				if(map.get(it.>1)
//				{
//					System.out.println("Key: " +it.next()+ "  Value: "+ map.get(it.next()));
//				}
//		}
		

	}

}
