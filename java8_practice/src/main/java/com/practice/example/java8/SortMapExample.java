package com.practice.example.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortMapExample {

	public static void main(String[] args) {

//		HashMap<Integer, String> mapOfNames = new HashMap<>();
//		mapOfNames.put(1, "karan");
//		mapOfNames.put(5, "vivek");
//		mapOfNames.put(19, "sumit");
//		mapOfNames.put(8, "abc");
//		System.out.println(mapOfNames);
//
//		Set<Entry<Integer, String>> entrySet = mapOfNames.entrySet();
//		List<Entry<Integer, String>> list = new ArrayList<>(entrySet);
//
//		Collections.sort(list, new Comparator<Entry<Integer, String>>() {
//			@Override
//			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
//				return o1.getKey() - o2.getKey();
//			}
//		});
//
//		for (Entry<Integer, String> entry : list) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}

		//========== with java 8 for primitive data types using Stream api==================
		//mapOfNames.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		//====================================Before java 8 sort a Map if Map key is custom object =============================
		
		// if the key of Map is custom object.
//		Map<Student, String> map = new TreeMap<>(new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.getRollNo() - o2.getRollNo();
//			}
//			
//		});
		
		//System.out.println("map : " + map);
		
		//================================sort a Map using java 8 Stream API======================================
		Map<Student, String> map = new HashMap<>();
		map.put(new Student(1, "karan", "java", 90), "java");
		map.put(new Student(3, "vivek", "c", 80), "c");
		map.put(new Student(2, "abc", "c++", 70), "c++");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Student :: getRollNo).reversed())).forEach(System.out::println);
	}
}
