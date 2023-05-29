
public class CountStrLen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AB1";
		System.out.println("Length of "+s+" is "+countLen(s));
	}
	
	public static int countLen(String s) {
		
		int temp = 0;
		
		for(char c : s.toCharArray()) {
			temp++;
		}
		
		return temp;
	};
}
