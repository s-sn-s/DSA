package LateNightPract;

public class EveOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = -2;
		System.out.print("Your entered number " + i);
		System.out.print(" is " + eveOdd(i));
	}

	private static String eveOdd(int i) {
		if(i%2==0)return "Even";
		else if(i%2!=0)return "Odd";
		return "Please enter proper interger!!";
	}

}
