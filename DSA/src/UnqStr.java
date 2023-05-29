import java.util.HashMap;
import java.util.Map;

public class UnqStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "savinroopalisharmashetty"; 
		System.out.println(
				"Unique char in " + s + " is " + rmDup(s));
	}
	
	public static StringBuilder rmDup(String s) {
		
		Map<Character,Integer> cMap = new HashMap<>();
		
		int strLen = s.length();
		
		for(int i = 0;i<strLen;i++) {
			char c = s.charAt(i);
			cMap.put(c, cMap.getOrDefault(c, 0)+1);
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<strLen;i++) {
			char c = s.charAt(i);
			if(cMap.get(c)<=1)sb.append(c);
		}
		
		return sb;
	}

}
