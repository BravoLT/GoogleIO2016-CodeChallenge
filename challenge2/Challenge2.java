import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Challenge2 {

	public static void main(String[] args) {

                // Process file 
                String fileName = "challenge2_sample.txt";

                if (args.length == 1) {
			fileName = args[0];
                }

		// Create character decoder array
		String[][] characterDecoder = new String[][] {
			{"","",""}, 		// 0
			{"","",""}, 		// 1
			{"A","B","C"}, 		// 2
			{"D","E","F"}, 		// 3 
			{"G","H","I"}, 		// 4 
			{"J","K","L"}, 		// 5 
			{"M","N","O"}, 		// 6 
			{"P","Q","R","S"}, 	// 7 
			{"T","U","V"}, 		// 8 
			{"W","X","Y","Z"},	// 9 
		}; 

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fileName));
		    	String line;
			StringBuilder decodedMessage = new StringBuilder();
		    	while ((line = br.readLine()) != null) {
				// Split line by spaces
				String[] words = line.split(" ");
				for (String word : words) {
					// Split on dots to seperate characters
					String[] characters = word.split("\\.");
					for (String character : characters) {
						// Decode the character
						int i = Integer.parseInt(character.substring(0,1));
						int j = (character.length() - 1);
						decodedMessage.append(characterDecoder[i][j]);
					}
					decodedMessage.append(" ");
				}
		    	}

			System.out.println("Decoded message: " + decodedMessage.toString());
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try { br.close(); } catch (IOException e) { /* do nothing */ }
			}
		}
	}
}
