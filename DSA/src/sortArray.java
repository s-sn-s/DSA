public class sortArray {
	public static void main(String[] args) {
		
		double[] ia = {-98,60,-70,-67.5,20.8,100};
		//sortIt(ia);
		System.out.println("Unsorted");
		for(double i:ia)System.out.print(i + " ");
		System.out.println();
		//System.out.println("sorted");
		for(double i:sortIt(ia))System.out.print(i + " ");
	}
	
	public static double[] sortIt(double[] ia) {
		//bubble sort
		//basic counter for checking if array is sorted
		//init to non negative
		int sortMe = -1;
		// store temp int
		double temp = 0;
		//loop till it is 0
		while(sortMe!=0){
			sortMe = 0;
			for(int i = 0;i<ia.length-1;i++) {
				if(ia[i]>ia[i+1]) {
					System.out.println(
							"Swaped " + ia[i+1] + " with " + ia[i]);
					temp = ia[i];
					ia[i] = ia[i+1];
					ia[i+1] = temp;
					sortMe++;
				}
			}
		}
		return ia;
	}
}