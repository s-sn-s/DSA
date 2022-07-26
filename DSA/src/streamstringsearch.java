import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class streamstringsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] mySary	= {"Hello","Hey","Hi","Hi","World"};
		List<String> mSalst = Arrays.asList(mySary);
		mSalst.stream().distinct().collect(Collectors.toList()).
		forEach(s->System.out.println(s));
		System.out.println("-----");
		mSalst.stream().collect(Collectors.toSet()).
		forEach(s->System.out.println(s));
		System.out.println("-----");
		System.out.println(mSalst.contains("Hi"));
		System.out.println("-----");
		mSalst.stream().filter(s->s.equalsIgnoreCase("World"))
		.map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}

}
