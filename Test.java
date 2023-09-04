package javaPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringNonrepeated {

	public static void main(String[] args) {
		
		String input = "india";
		StringBuilder sb1 = new StringBuilder();
		sb1 = sb1.append(input);
		sb1 = sb1.reverse();
		System.out.println(sb1);
		
		Map<Character,Integer> map = new HashMap();
		for(int i = 0 ; i < input.length() ; i++) {
			char ch = input.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 2);
			}
		}
		System.out.println(map);
		
		for(Entry<Character,Integer> entrySet : map.entrySet()) {
			if(entrySet.getValue()>1) {
				System.out.println(entrySet.getKey());
			}
		}

	}

}
