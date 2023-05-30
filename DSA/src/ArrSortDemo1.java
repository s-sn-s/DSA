
public class ArrSortDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ia = {9,7,3,6,1,6};
		for(int i:ia)System.out.print(i);
		System.out.println();
		for(int i:sortMe(ia))System.out.print(i);
	}
	
	public static int[] sortMe(int[] arrInt) {
		//counter to check if still need to sort
		//default counter to negative value
		//while counter is still non zero
		//for loop to iterate 2 pointers i and j
		int temp = 0;
		int len =arrInt.length;
		int sortCounter = -1;
		while(sortCounter!=0) {
			sortCounter=0;
			for(int i =0;i<len-1;i++) {
				if(arrInt[i]>arrInt[i+1]) {
					temp = arrInt[i];
					arrInt[i]=arrInt[i+1];
					arrInt[i+1]=temp;
					sortCounter++;
				}
			}
		}
		return arrInt;	
	}
}