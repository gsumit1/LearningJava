package JavaLearn.JavaLearn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Collections;

public class Duplicate_Map_Count {
	public static void main(String args[]) {
		
		List<String> animalList=Arrays.asList("dog","dog","cat","cow","cat");
		Set<String> animalSet=new HashSet(animalList);
		Map<String,Integer> animalMap=new HashMap<String,Integer>();
		for(String a:animalSet) {
			animalMap.put(a, Collections.frequency(animalList, a));
		}
		System.out.println(getKeys(animalMap,2));

	}
	
	public static <K, V> K getKey(Map<K, V> map, V value) {
	    for (Entry<K, V> entry : map.entrySet()) {
	        if (entry.getValue().equals(value)) {
	            return entry.getKey();
	        }
	    }
	    return null;
	}
	
	public static <K, V> Set<K> getKeys(Map<K, V> map, V value) {
	    Set<K> keys = new HashSet<>();
	    for (Entry<K, V> entry : map.entrySet()) {
	        if (entry.getValue().equals(value)) {
	            keys.add(entry.getKey());
	        }
	    }
	    return keys;
	}

}
