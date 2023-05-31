package LateNightPract;

import java.util.HashMap;

public class NoDupString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Savinshetty";
		System.out.println("Original String : " + s);
		System.out.print("Unique string : " + getUnqStr(s));
	}
	
	public static String getUnqStr(String s) {
		String unqStr = "";
		for(int i = 0;i<=s.length()-1;i++) {
			String c = s.toLowerCase().charAt(i)+"";
			if(!unqStr.contains(c))unqStr+=c;
		}
		return unqStr;
	}
}