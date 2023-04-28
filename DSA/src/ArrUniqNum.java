import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrUniqNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,1,5,1,51,51,5,54,8,4,21,1,1,51};
		Set<Integer> hsi = new HashSet<>(Arrays.stream(a).boxed().collect(Collectors.toList()));
		Iterator<Integer> i = hsi.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
