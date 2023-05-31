package LateNightPract;

import java.util.ArrayList;

public class ArRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intAry = {1,23,2,3,4,5};
		System.out.print("Original Array : ");
		for(int i : intAry)System.out.print(i+",");
		System.out.println();
		System.out.print("Reversed Array : ");
		for(int i : revAry(intAry))System.out.print(i+",");
	}

	private static ArrayList<Integer> revAry(int[] intAry) {
		int aryLen = intAry.length;
		ArrayList<Integer> revAry = new ArrayList<>();
		for(int i = aryLen-1;i>=0;i--) {
			revAry.add(intAry[i]);
		}
		return revAry;
	}
}