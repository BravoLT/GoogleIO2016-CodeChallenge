import java.util.ArrayList;
import java.util.List;

public class Challenge1 {

	public static void main(String[] args) {
		
		// Find primes less than or equal to 101
		int limit = 101;
		
		if (args.length == 1) {
			try {
				limit = Integer.parseInt(args[0]);
			} catch(NumberFormatException nfe) {
				// keep default limit
			}
		}
		
		List<Integer> primes = getPrimesLessThan(limit);

		System.out.println("Prime numbers less than or equal to " + limit + ":");
		for (Integer prime : primes) {
			System.out.print(prime + " ");
		}
	}
	
	public static List<Integer> getPrimesLessThan(int limit) {

		// Create array of numbers from 2 to the limit
		List<Integer> primes = new ArrayList<Integer>(limit-1);
		for (int i = 2; i <= limit; i++) {
			primes.add(i);
		}
		
		for (int i = 2; i <= 9; i++) {
			int multiplier = 2;
			int multiple = i*multiplier;
			while (multiple <= limit) {
				primes.remove(Integer.valueOf(multiple));
				multiplier++;
				multiple = i*multiplier;
			}
		}
		
		return primes;
	}
}
