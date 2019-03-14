class Main {
	
	public static void main(String[] args) {
		fibCalc();
	}

	static void fibCalc () {
		long fib1 = 0; 
		long fib2 = 1;
		long newFib = 0;
		int end = 50;


		for (int x = 0; x <= end; x++) {
			System.out.println(fib2);
			newFib = fib1 + fib2;
			fib1 = fib2;
			fib2 = newFib;

		}
	}
}