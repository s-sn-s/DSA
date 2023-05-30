import java.util.Scanner;

public class StarPtrnDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row, i, j, space = 1;
		System.out.print("Enter the number of rows you want to print: ");
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		space = row - 1;
		for (j = 1; j <= row; j++) {
			for (i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			space--;
			for (i = 1; i <= 2 * j - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		space = 1;
		for (j = 1; j <= row - 1; j++) {
			for (i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			space++;
			for (i = 1; i <= 2 * (row - j) - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		StarPtrnDiamond(4);

	}

	public static void StarPtrnDiamond(int num) {

		int Space = num - 1;

		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= Space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i * 2; j++) {
				System.out.print("*");
			}
			Space--;
			System.out.println();
		}
		Space = 1;
		for (int i = num - 1; i >= 0; i--) {
			for (int j = 1; j <= Space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i * 2; j++) {
				System.out.print("*");
			}
			Space++;
			System.out.println();
		}

	}

}
