
public class StarPtrn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//rightAngle(6);
		//rightAngleMirored(6);
		//pyramid(6);
		//revPyramid(6);
		diamond(6);
	}
	
	public static void rightAngle(int row) {
		int i= 0,j=0;
		
		for(i=0;i<row;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void rightAngleMirored(int row) {
		int i= 0,j=0;
		
		for(i=0;i<row;i++) {
			for(j=i+1;j<row;j++) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pyramid(int row) {
		int i= 0,j=0;
		
		for(i=0;i<row;i++) {
			for(j=i+1;j<row;j++) {
				System.out.print(" ");
			}
			for(j=0;j<=i*2;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void revPyramid(int row) {
		int i= 0,j=0;
		
		for(i=row-1;i>=0;i--) {
			for(j=i+1;j<row;j++) {
				System.out.print(" ");
			}
			for(j=0;j<=i*2;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void diamond(int k) {
	int flow =0;
		for(int i =0;i<k;i++){
			for(int j=flow;j<=k;j++) {
				System.out.print(" ");
			}		
			for(int j=flow;j<=k*2;j++) {
				System.out.print("*");
			}
			if(i==k/2) {flow=k;}
		}
		System.out.println();

	}
}

