package LateNightPract;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "savin";
		System.out.println("Original String : " + s);
		System.out.println("Reversed String : " + revStr(s));
	}
	
	public static String revStr(String s) {
		String revString = "";
		
		for(int i = s.length()-1;i>=0;i--) {
			revString = revString + s.charAt(i);
		}
		return revString;
	}
}