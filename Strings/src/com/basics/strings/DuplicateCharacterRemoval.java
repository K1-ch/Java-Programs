package com.basics.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacterRemoval {

	public static void main(String[] args) {
		String str = "aaaabbssjtyww";
		List<Character> charList = new ArrayList<>();
		for (Character c : str.toCharArray()) {
			charList.add(c);
		}
		charList.stream().distinct().forEach(System.out::print);
		System.out.println("");
		Map<Character, Integer> charMap = new HashMap<>();
		for (Character c : str.toCharArray()) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);// value number
			} else {
				charMap.putIfAbsent(c, 1);
			}

		}
		// Set<Entry<Character, Integer>> entrySet = charMap.entrySet();
//		Iterator<Entry<Character, Integer>> iterator = entrySet.iterator();
//		while (iterator.hasNext()) {
//			Entry<Character, Integer> entry = iterator.next();
//			System.out.println(entry.getKey() + ":" + entry.getValue());
//		}
		for (Entry<Character, Integer> entry : charMap.entrySet()) {
			System.out.print(entry.getKey() + "" + entry.getValue());
		}

	}

}
