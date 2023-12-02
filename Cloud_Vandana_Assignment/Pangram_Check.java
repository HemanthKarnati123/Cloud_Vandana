package JavaCodes;

public class Pangram_Check {

	public static void main(String[] args) {
		String s = "A Quick Brown fox jumps over the lazy dog";
		char ch = 'a';
		int count = 0;

		for (int i = 1; i <= 26; i++) {
			for (int j = 0; j < s.length(); j++) {
				if (ch == Character.toLowerCase(s.charAt(j))) {
					count++;
					break;
				}
			}
			ch++;
		}
		if (count == 26) {
			System.out.println("Given Sentence is Pangram");
		} else {
			System.out.println("Given Sentence is Not a Pangram");
		}

	}

}
