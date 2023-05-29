
public class Fibonacci {
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		for(long i :f.fib(95))System.out.print(i + " ");
	}
	
	public long[] fib(int i) {
		long first = 0;
		long second = 1;
		long[] ai = new long[i];
		long sum = 0;
		for(int j = 0;j<i;j++) {
			ai[j]	= first;
			sum 	= first + second;
			first 	= second;
			second 	= sum;
		}
		return ai;
	}
}
