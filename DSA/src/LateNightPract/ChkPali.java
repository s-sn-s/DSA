package LateNightPract;

public class ChkPali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "SAVIN";
		System.out.println(checkPali(s));
	}
	
	public static boolean checkPali(String s) {
		//store reverse string
		String revStr = "";
		//iterate og string
		for(int i=s.length()-1;i>=0;i--) {
			revStr += s.charAt(i); 
		}
		
		if(s.equals(revStr))return true;
		return false;
	}
}