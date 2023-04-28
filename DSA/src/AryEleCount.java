import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AryEleCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 1, 1, 1, 1, 2, 2, 2, 2, 2, 4, 4, 4, 4, 4, 4 };
		// HashMap<Integer,Integer> hmi = new HashMap<>();
		List<Integer> ali = new ArrayList<Integer>();
		int lowCount = 0;
		int lowIndx = 0;
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			int[] sa = Arrays.copyOfRange(a, i + 1, a.length);
			if (ali.contains(a[i])) {
				continue;
			}
			for (int j : sa) {

				ali.add(a[i]);

				if (a[i] == j) {
					count++;
				}
				// (a[1], count);
			}
			if (lowCount > count || lowCount == 0) {
				lowCount = count;
				lowIndx = a[i];
			}
			System.out.println(a[i] + " " + count);
		}
		System.out.println(lowIndx + " has occured only " + lowCount + " times!");
		System.out.println(System.getProperty("user.dir"));
	}
}
//		for(int i:a) {
//			l.add(i);
//			
//			for(int:) {
//				
//			}
//			if(l.contains(i)) {
//				hmi.put(i, 1);
//				hmi.replace(null, null);
//			}
//		}
