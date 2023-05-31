package LateNightPract;

public class RevWrdsInStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "My name is SAVIN";
		System.out.println("Original String : " + s);
		System.out.println("Reverse String : " + revStrWrds(s));
	}
	
	public static String revStrWrds(String s) {
		
		String rs = "";
		String[] sa = s.split(" ");
		int len = sa.length;
		for(int i = len-1;i>=0;i--) {
			rs += sa[i] + " "; 
		}
		return rs;	
	}
}