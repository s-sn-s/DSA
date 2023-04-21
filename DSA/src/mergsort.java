import java.util.Arrays;
import java.util.Random;

public class mergsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		int[] myary = new int[10];
		//myary = Math.random();
		Random r = new Random();
		Arrays.asList(myary).stream()
			.map(s->s=r.ints());
			*/
			//.forEach();
		
		int[] myary1 = new Random()
				.ints(10,1000,9999)
				.toArray();
		
		for(int i:myary1){
			System.out.println(i);
		}
		System.out.println("---1");
		
		//Arrays.stream(myary1).sorted()
		//.forEach(s->System.out.println(s));
		//Arrays.asList(myary1).stream()
		System.out.println("---2");
		Arrays.stream(myary1)
		.forEach(s->System.out.println(s));
		
		
		
	}

}
