package LateNightPract;

public class PaliStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "MAM";
		System.out.println(s);
		System.out.println("Palindrome check : " + checkPali(s));
	}
	
	public static boolean checkPali(String s) {
		String revString = "";
		for(int i = s.length()-1;i>=0;i--) {
			revString = revString + s.charAt(i);
		}
		if(revString.equals(s))return true;	
		return false;
	}
}
