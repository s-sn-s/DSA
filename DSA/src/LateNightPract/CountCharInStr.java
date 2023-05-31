package LateNightPract;

import java.util.HashMap;

public class CountCharInStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Savinshetty";
		System.out.println(s);
		HashMap<Character, Integer> hmOfStr = getHashMapOf(s);
		System.out.print("Character count check : ");
		//System.out.println(hmOfStr.keySet());
		//System.out.println(hmOfStr.values());
		System.out.println(hmOfStr);
	}
	
	public static HashMap<Character, Integer> getHashMapOf(String s) {
		
		HashMap<Character, Integer> hmOfStr = new HashMap<>();
		
		for(int i = 0;i<=s.length()-1;i++) {
			char c = s.toLowerCase().charAt(i);
			hmOfStr.put(c, hmOfStr.getOrDefault(c, 0)+1);
		}
			
		return hmOfStr;
	}

}
