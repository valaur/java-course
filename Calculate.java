public class Calculate {
	public static void main(String[] args) {
		System.out.println("Calculate...");
		int one = Integer.valueOf(args[0]);
		int two = Integer.valueOf(args[1]);
		int sum = one+two;
		int mlt = one*two;
		double div = one/two;
		System.out.println("sum is "+ sum + " mlt is "+mlt);
		System.out.println("div is "+ (double)one/two);
		
	}
}