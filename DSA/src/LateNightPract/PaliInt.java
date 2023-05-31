package LateNightPract;

public class PaliInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 11;
		System.out.println("Integer : " + i);
		System.out.println("Palindrome check : " + checkPali(i));
	}
	
	public static boolean checkPali(int i) {
		int ogInt = i;
		int revInt = 0;
		while(ogInt!=0) {
			revInt = revInt*10 + ogInt%10;
			ogInt/=10;
		}
		System.out.println(revInt);
		if(i==revInt)return true;
		return false;
	}
}