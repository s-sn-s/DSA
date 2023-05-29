
public class NumSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = -2, j= -1;
		System.out.println(" i = " + i + "; j = " + j);
		int[] ai =swapNum(i,j);
		System.out.println(" i = " + ai[0] + "; j = " + ai[1]);
		
	}
	
	public static int[] swapNum(int i, int j) {
		//figure diff and store first int temp
		i = i - j ; 
		//
		//add diff to second int
		j = j + i ; 
		//
		//as we got j swaped subtract second with temp first and store in i
		i = j - i;
		int[] ai = {i,j};
		return ai;
	}
}
