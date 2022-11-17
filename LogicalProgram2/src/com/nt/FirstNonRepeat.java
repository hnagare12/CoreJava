package com.nt;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeat {
	public static void main(String[] args) {
		String input = "AABCDBE";

		//Approch-1
		//Without using collection
		for (int i = 0; i < input.length(); i++) {

			boolean unique = true;

			for (int j = 0; j < input.length(); j++) {
				if (i != j && input.charAt(i) == input.charAt(j)) {
					unique = false;
				}
			}
			if (unique) {
				System.out.println(input.charAt(i));
				break;

			}
		}

		//Approch-2
		//using collection
		Map<Character, Integer>map=new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			
			char ch=input.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
			
		System.out.println(map);
		for (Entry<Character, Integer> entrySet:map.entrySet()) {
			if (entrySet.getValue() ==1) {
				System.out.println(entrySet.getKey());
				break;
			}
		}
	}

}
