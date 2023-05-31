package LateNightPract;

public class SecMaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intAry = {100,23,0,3,4,5};
		int len= intAry.length;
		System.out.print("Array : ");
		for(int i : intAry)System.out.print(i+",");
		System.out.println();
		int[] sortedAry = sortMe(intAry);
		System.out.println("Second max number is " + sortedAry[len-2]);
		System.out.println("Second min number is " + sortedAry[1]);
	}

	public static int[] sortMe(int[] ia) {
		
		int iterate = -1;
		int len = ia.length;
		int temp = 0;
		while(iterate!=0) {
			iterate=0;
			for(int i = 0;i<len-1;i++) {
				if(ia[i]>ia[i+1]) {
					temp = ia[i];
					ia[i] = ia[i+1];
					ia[i+1] = temp;
					iterate++;
				}
			}
		}
		return ia;
	}

}
