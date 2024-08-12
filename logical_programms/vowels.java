package logical_programms;

public class vowels {

	static public void v(String s) {

		char s1[] = s.toCharArray();
		char vowels[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

		for (int i = 0; i < s1.length; i++) {

			char c = s.charAt(i);

			for (char v : vowels) {
				if (c == v) {
					System.out.print(c + "");
				}
			}

		}
	}

	static private void cons(String s) {
		char s1[] = s.toCharArray();
		for (int i = 0; i < s1.length; i++) {

			char c = s.charAt(i);

			if (c >= 'a' && c <= 'z' && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
				System.out.print(c + " ");
			}
		}
	}

	public static void main(String[] args) {

		vowels.v("nikhIl");
		System.out.println();
		vowels.cons("nikhil");

	}

}