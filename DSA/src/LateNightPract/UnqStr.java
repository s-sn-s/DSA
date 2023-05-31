package LateNightPract;

import java.util.HashMap;

public class UnqStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Savinshetty";
		System.out.println("Original String : " + s);
		System.out.print("Unique string : " + getUnqStr(s));
	}
	
	public static String getUnqStr(String s) {
		HashMap<Character, Integer> hmOfStr = new HashMap<>();
		for(int i = 0;i<=s.length()-1;i++) {
			char c = s.toLowerCase().charAt(i);
			hmOfStr.put(c, hmOfStr.getOrDefault(c, 0)+1);
		}
		String unqStr = "";
		for(int i = 0;i<=s.length()-1;i++) {
			char c = s.toLowerCase().charAt(i);
			if(hmOfStr.get(c)==1)unqStr+=c;
		}
		return unqStr;
	}
}