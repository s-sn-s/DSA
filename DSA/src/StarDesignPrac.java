
public class StarDesignPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space = 7;
		int star = 1;
		for(int i = 1;i<7;i++){
			for(int j = 1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j = 1;j<=star;j++){
				System.out.print("*");
			}
			space=space-1;
			star=star+2;
			System.out.printf("%n");
		}
	}
}
//		*
//	   ***
//	  *****
//	 *******
//	*********
// ***********