//Ali Itani
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Challenge2 throws IOException, FileNotFoundException {

	public static void main(String[] args) {

		String[] Alphabets = { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
				"R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
		String[] Numbers = { " ", "2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66",
				"666", "7", "77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999" };

		BufferedReader br = null;
		String Phrase = "";
		String result = "";
		String alphaLine = "";

		try {

			br = new BufferedReader(new FileReader("challenge2_sample.txt"));

			Phrase = br.readLine() + ".";
			
			br.close();
		} catch (Exception e) {

			System.out.println(e);
		}
		
		for (int i = 0; i < Phrase.length(); i++) {

			if (Phrase.charAt(i) == '.' || Phrase.charAt(i) == ' ') {

				for (int j = 0; j < Numbers.length; j++) {

					if (alphaLine.equals(Numbers[j])) {

						result += Alphabets[j];

					}

				}
				alphaLine = "";
			}
			if (Phrase.charAt(i) == ' ') {

				result += " ";

			}
			if (Phrase.charAt(i) != '.' && Phrase.charAt(i) != ' ') {

				alphaLine += Phrase.charAt(i);
			}

		}

		System.out.println(result);

	}

}
