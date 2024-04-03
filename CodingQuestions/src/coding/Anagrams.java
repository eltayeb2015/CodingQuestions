package coding;

import java.io.Console;
import java.util.HashMap;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		
		String s1 = "";
		String s2 = "";
		Scanner in = new Scanner(System.in);
	
	
		System.out.println("Enter first string: ");
		 s1 = in.nextLine();
		 
		System.out.println("Enter second string: ");
		 s2 = in.nextLine();

		
		
		HashMap<Character, Integer> map1 = getMap(s1);
		HashMap<Character, Integer> map2 = getMap(s2);
		
		boolean anagrams = map1.equals(map2)?true:false;
		
		System.out.println(anagrams);
			
	}
	
	static HashMap<Character, Integer> getMap(String s){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char x: s.toCharArray()) {
			if(map.containsKey(x)) {
				map.put(x, map.get(x)+1);
			}
			else {
				map.put(x, 1);
			}
		}
		return map;
	}
}
