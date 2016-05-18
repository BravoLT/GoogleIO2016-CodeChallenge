//Ali Itani
public class PrimeNumbers {
	public static void main(String args[]) {

		String result = "";
		
		for (int i = 2; i <= 101; i++) {

			if (isPrime(i)) {

				result += i + " ";

			}

		}
		System.out.println(result);

	}

	public static boolean isPrime(int n) {

		if (n == 2) {

			return true;

		}

		for (int i = 2; i < (int) Math.sqrt(n) + 1; i++) {
			
			if (n % i == 0) {
			
				return false;
			
			}
		}

		return true;
	}
}
