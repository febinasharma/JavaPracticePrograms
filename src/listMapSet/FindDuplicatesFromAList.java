package listMapSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindDuplicatesFromAList {

	public static void main(String[] args) {
		List<String> arrList=new ArrayList<String>(Arrays.asList("Java","Hi","Java","this","is","hi"));
		
		System.out.println("Before: " +arrList);
		
		System.out.println("\n"+"The Duplicates with its count ");
		
		Map<String, Integer> map=new HashMap<String,Integer>();
		for(String s:arrList)
		{
			if(map.containsKey(s))
			{
				map.put(s, map.get(s)+1);
			}
			else
				map.put(s, 1);
		}
		
		Set<String> keyset=new HashSet<String>(map.keySet());
 		
		for(String s:keyset)
		{
			if(map.get(s)>1)
				System.out.println("Key: "+s+"     Value: "+map.get(s));  
		}
		
		System.out.println("\n"+"Removing Duplicates");
		
		for(String s:keyset)
		{
			if(map.get(s)>1)
				map.remove(s);
		}
		
		System.out.println(map);
	}

}
