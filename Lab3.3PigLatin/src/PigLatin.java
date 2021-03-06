
public class PigLatin {

	public static void main(String[] args) {

		System.out.println(convertToLatin("crumpits"));
	}

	public static String convertToLatin(String string) {
		String end = "";
		String delims = "\\s+";
		String[] words = string.split(delims);
		for (int i = 0; i < words.length; i++) {
			if (isVowel(words[i].toLowerCase().charAt(0))) {
				end += words[i] + "way";
			} else {
				end += words[i].substring(1) + words[i].substring(0, 1) + "ay";
			}
		}
		return end;
	}

	public static boolean isVowel(char c) {
		if (c == 'a')
			return true;
		if (c == 'e')
			return true;
		if (c == 'i')
			return true;
		if (c == 'o')
			return true;
		if (c == 'u')
			return true;
		return false;
	}

}