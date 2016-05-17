
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Translate {
	
	static private Map<String,Character> map = new HashMap<String,Character>();
	static{
		map.put("2",'A');
		map.put("22",'B');
		map.put("222",'C');
		map.put("3",'D');
		map.put("33",'E');
		map.put("333",'F');
		map.put("4",'G');
		map.put("44",'H');
		map.put("444",'I');
		map.put("5",'J');
		map.put("55",'K');
		map.put("555",'L');
		map.put("6",'M');
		map.put("66",'N');
		map.put("666",'O');
		map.put("7",'P');
		map.put("77",'Q');
		map.put("777",'R');
		map.put("7777",'S');
		map.put("8",'T');
		map.put("88",'U');
		map.put("888",'V');
		map.put("9",'W');
		map.put("99",'X');
		map.put("999",'Y');
		map.put("9999",'Z');
	}
	
	public static void main(String[] args) throws IOException {
	    StringBuffer result = new StringBuffer();
		try(BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    String everything = sb.toString();
		    StringTokenizer wordCodes = new StringTokenizer(everything," ");
		    while(wordCodes.hasMoreElements()){
		        String wordCode = wordCodes.nextToken();
		        StringTokenizer letterCodes = new StringTokenizer(wordCode,".");
		        StringBuffer wordBuffer = new StringBuffer();
		        while(letterCodes.hasMoreElements()){
		        	String letterCode = letterCodes.nextToken().trim();
		        	if(map.containsKey(letterCode)){
		            	wordBuffer.append(map.get(letterCode));
		        	}
		        }
		        result.append(wordBuffer).append(" ");
		    }
		}
		System.out.println(result.toString());
	}
}
