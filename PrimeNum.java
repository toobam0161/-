public class PrimeNum {

	public static void main(String[] args) {
		int val = 14;
		int div = 2;
		boolean isPrimeNum = true;
		for (int i = 0; i < val -2; i++ ) {
			if (val % div == 0) {
				isPrimeNum = false;
			}
			div++;
		}
		if(isPrimeNum == true) {
			System.out.println("소수");
		}
		else {
			System.out.println("합성수");
		}
		
	}
}
