
public class ChkPali {
	public static void main(String[] args) {
		int i =131;
		String str = "MADAM";
		System.out.println(checkNumPali(i));
		System.out.println(checkStrPali(str));
	}
	
	public static boolean checkNumPali(int num) {
		int ogNum = num;
		int revNum = 0;
		
		while(num!=0) {
			revNum = revNum*10 + num%10;
			num=num/10;
		}
		
		if(ogNum==revNum)return true;

		return false;
	}
	public static boolean checkStrPali(String str) {
		
		String revStr = "";
		int len = str.length();
		for(int i = len-1;i>=0;i--) {
			char c = str.charAt(i);
			revStr = c + revStr;
		}
		
		if(str.equals(revStr))return true;
		
		return false;
	}
	
}
