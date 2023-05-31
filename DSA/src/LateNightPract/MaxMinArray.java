package LateNightPract;

import java.util.ArrayList;

public class MaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intAry = {100,23,0,3,4,5};
		System.out.print("Array : ");
		for(int i : intAry)System.out.print(i+",");
		System.out.println();
		System.out.println(MinOfAry(intAry));
		System.out.println(MaxOfAry(intAry));
	}

	private static int MaxOfAry(int[] intAry) {
		// TODO Auto-generated method stub
		int Max = intAry[0];
		for(int i : intAry) {
			if(Max<i) {
				Max=i;
			}
		}
		
		return Max;
	}

	private static int MinOfAry(int[] intAry) {
		// TODO Auto-generated method stub
		int Min = intAry[0];
		for(int i : intAry) {
			if(Min>i) {
				Min=i;
			}
		}
		return Min;
	}
}