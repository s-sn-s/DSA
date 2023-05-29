
public class RevStrWrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Savin is bad at everything?";
		System.out.println(s);
		System.out.println(revStrWrds(s));
		
	}
	
	public static String revStrWrds(String ogStr) {
		
		String[] strAry = ogStr.split(" ");
		String revStr = "";
		for(int i =strAry.length-1;i>=0;i--) {
			revStr += " " + strAry[i]; 
		}
		
		return revStr;
		
	}

}
