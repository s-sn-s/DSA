package LateNightPract;

import java.util.ArrayDeque;
import java.util.Iterator;

public class BalancedStr {
	public static void main(String[] args) {
		String[] sa = {"{","[","<","(",")",">","]","}"};
		
		for(String c : sa)System.out.print(c + " ");
		System.out.println();
		System.out.println("Are above brackets balanced? : " 
		+ chkBal(sa));		
	}

	private static boolean chkBal(String[] sa) {
		ArrayDeque<String> ad = new ArrayDeque<>();
		for(int i = 0;i<sa.length;i++) {
			String b = sa[i]; 
			if(b=="{"||b=="("||b=="["||b=="<")
				{
				System.out.println("offered : " + b);
				ad.offer(b);
				continue;
				}
			//System.out.println("Peeked : " + ad.peekLast());
			String pl = ad.peekLast();
			switch (b) {
			case ">":
				if(pl=="{"||pl=="("||pl=="[")return false;
				break;
			case "}":
				if(pl=="<"||pl=="("||pl=="[")return false;
				break;
			case "]":
				if(pl=="{"||pl=="("||pl=="<")return false;
				break;
			case ")":
				if(pl=="{"||pl=="<"||pl=="[")return false;
				break;		
			}
			System.out.println("Removed : " + ad.pollLast());
		}
		return true;
	}	
}