
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Morse {
	private static class Node {
		Character value;
		Node dit = null;
		Node dah = null;

		public Node(Character v, Node da, Node di) {
			value = v;
			dit = di;
			dah = da;
		}

		public Node dit() {
			return dit;
		}

		public Node dah() {
			return dah;
		}
	}

	static Node root = null;

	private static Node buildTree() {
		Node qMark = new Node('?', null, null);
		Node slash = new Node('/', null, null);
		Node asym = new Node('@', null, null);
		Node period = new Node('.', null, null);
		Node AR = new Node('\n', period, null);
		Node aTop = new Node(' ', null, asym);
		Node qTop = new Node(' ', null, qMark);
		Node Ä = new Node('Ä', null, AR);
		Node zero = new Node('0', null, null);
		Node nine = new Node('9', null, null);
		Node space = new Node(' ', zero, nine);
		Node eight = new Node('8', null, null);
		Node dot = new Node(' ', null, eight);
		Node o = new Node('O', space, dot);
		Node seven = new Node('7', null, null);
		Node q = new Node('Q', null, null);
		Node comma = new Node(',', null, null);
		Node commahead = new Node(' ', comma, null);
		Node z = new Node('Z', commahead, seven);
		Node g = new Node('G', q, z);
		Node m = new Node('M', o, g);
		Node six = new Node('6', null, null);
		Node y = new Node('Y', null, null);
		Node c = new Node('C', null, null);
		Node k = new Node('K', y, c);
		Node x = new Node('X', null, slash);
		Node b = new Node('B', null, six);
		Node d = new Node('D', x, b);
		Node n = new Node('N', k, d);
		Node t = new Node('T', m, n);
		Node one = new Node('1', null, null);
		Node two = new Node('2', null, null);
		Node three = new Node('3', null, null);
		Node four = new Node('4', null, null);
		Node five = new Node('5', null, null);
		Node j = new Node('J', one, null);
		Node p = new Node('P', aTop, null);
		Node l = new Node('L', null, null);
		Node dash = new Node('-', two, qTop);
		Node f = new Node('F', null, null);
		Node v = new Node('V', three, null);
		Node h = new Node('H', four, five);
		Node w = new Node('W', j, p);
		Node r = new Node('R', Ä, l);
		Node u = new Node('U', dash, f);
		Node s = new Node('S', v, h);
		Node a = new Node('A', w, r);
		Node i = new Node('I', u, s);
		Node e = new Node('E', a, i);
		Node result = new Node(null, t, e);
		return result;
	}

	public static void main(String[] args) throws IOException {
		if (root == null) {
			root = buildTree();
		}
		StringBuffer result = new StringBuffer();
		try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			String everything = sb.toString().trim();
			String[] wordCodes = everything.split("\\s{3}");
			for (String wordCode : wordCodes) {
				StringBuffer wordBuffer = new StringBuffer();
				StringTokenizer letterCodes = new StringTokenizer(wordCode, " ");
				while (letterCodes.hasMoreElements()) {
					String letterCode = letterCodes.nextToken().trim();
					try {
						wordBuffer.append(traverseCode(letterCode, root));
					} catch (NullPointerException npe) {
						System.out.println("Unsupported character found: " + letterCode);
					}
				}
				result.append(wordBuffer).append(" ");
			}
		}
		System.out.println(result.toString());
	}

	static private Character traverseCode(String code, Node node) {
		if (code.length() > 0) {
			if (code.charAt(0) == '-') {
				return traverseCode(code.substring(1), node.dah());
			} else {
				return traverseCode(code.substring(1), node.dit());
			}
		} else {
			return node.value;
		}

	}

}
