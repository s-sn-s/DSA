package LateNightPract;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "SAVIN";
		String s2 = "NIVAs";
		System.out.println("1st word : "+s1);
		System.out.println("2nd word : "+s2);
		System.out.println("Anagram check : " + checkAna(s1,s2));
	}

	private static boolean checkAna(String s1, String s2) {
		
		if(s1.length()!=s2.length()) {return false;}
		
		int len = s1.length();
		
		char[] s1ca = s1.toLowerCase().toCharArray();
		char[] s2ca = s2.toLowerCase().toCharArray();
		
		Arrays.sort(s1ca);
		Arrays.sort(s2ca);
		
		for(int i=0;i<len-1;i++)
			if(s1ca[i]!=s2ca[i])
				return false;
		
		return true;
	}
}
