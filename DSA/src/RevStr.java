
public class RevStr {
	//str
	//tempStr
	//for loop for str
	public static void main(String[] args) {
		String myStr = "roopali";
		String tempStr = "";
		int len = myStr.length();
		for (int i = len-1;i>=0;i--) {
			char c = myStr.charAt(i);
			tempStr = tempStr + c;
		}
		System.out.println(tempStr);
		}
}
