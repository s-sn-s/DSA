package LateNightPract;

import java.util.HashMap;

public class CheckCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AabcdABCDefghTURV";
		System.out.println("Input : "+s);
	    System.out.println(getCharCount(s));
	}

	public static String getCharCount(String s){
		//
		HashMap<Character,Integer> hms = new HashMap<>();
		
		for(int i = 0; i<s.length()-1;i++) {
			char c = s.toLowerCase().charAt(i);
			hms.put(c, hms.getOrDefault(c, 0)+1);
		}
		//unique string
		String us = "";
		for(int i = 0; i<s.length()-1;i++) {
			char c = s.toLowerCase().charAt(i);
			if(hms.get(c)==1)us+=c;
		}
		
		return us;
	} 
}
