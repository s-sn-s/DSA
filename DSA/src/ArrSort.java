
public class ArrSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ai = {2,1,9,0,3,3};
		for(int i:ai)System.out.print(i);
		System.out.println();
		for(int i:sortThem(ai))System.out.print(i);
	}

	public static int[] sortThem(int[] intAry) {
		
		//bubble sort
		int SomethingToSort=-1;
		int counter=0;
		while(SomethingToSort!=0) 
		{
			
			SomethingToSort=0;
			for(int i=0;i<intAry.length-1;i++) 
			{	
				System.out.println("checking "+ intAry[i] +" with "+ intAry[i+1]);
				if(intAry[i]>intAry[i+1]) 
				{
					System.out.println
					("swaping "+ intAry[i] +" with "+ intAry[i+1]);
					int temp =intAry[i]; 
					intAry[i]=intAry[i+1];
					intAry[i+1]=temp;
					//intAry[i]=intAry[maxInd];
					//intAry[maxInd]=temp;
					//max=intAry[i];
					//maxInd=i;
					
					
					SomethingToSort++;
				}
			}
			for(int i:intAry)System.out.print(i);
			System.out.println("----------");
		}
		return intAry;
	}
}