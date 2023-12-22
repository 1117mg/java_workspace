package step01;

import java.util.HashMap;
import java.util.ArrayList;

public class Ex04Map {

	public static void main(String[] args) {
		// HashMap
		HashMap<String, Integer> hml = new HashMap<String, Integer>();
		
		// put()
//		hml.put(key,value);
		hml.put("a", 1);
		hml.put("b", 2);
		hml.put("c", 3);
		hml.put("d", 4);
		hml.put("e", 5);
		
		System.out.println(hml);
		
		// get()
//		System.out.println(hml.get("c"));
		
		// remove()
		
		// 
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("a");
		al2.add("b");
		al2.add("c");
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("a");
		al3.add("b");
		al3.add("c");
		
		HashMap<String, ArrayList> hm2 = new HashMap<String, ArrayList>();
		hm2.put("al2", al2);
		
		System.out.println(hm2);
		
		
		// b 출력?
		System.out.println(hm2.get("al2").get(1));
		
		//
		HashMap<String, HashMap> hm3 = new HashMap<String, HashMap>();
		hm3.put("hm2", hm2);
		
		System.out.println(hm3);
		// {hm2={al2=[a, b, c]}}
		
		// b 출력?
		System.out.println(((ArrayList)hm3.get("hm2").get("al2")).get(1));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
