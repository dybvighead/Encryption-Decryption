package encryptdecrypt;

public class Encryption {

	StringBuilder result;

	protected String unicode(String data, int key) {
		result = new StringBuilder();

		for (int i = 0; i < data.length(); i++) {
			int oldUnicode = data.charAt(i);
			int newUnicode = oldUnicode + key;
			result.append(Character.toChars(newUnicode));
		}
		return result.toString();
	}

	protected String shift(String data, int key) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		result = new StringBuilder();

		for (int i = 0; i < data.length(); i++) {
			char c = data.charAt(i);

			if (c == ' ') {
				result.append(" ");

			} else if (Character.isAlphabetic(c)) {
				int oldIndex = alphabet.indexOf(Character.toLowerCase(c));
				int newIndex;

				if (key == 0) {
					newIndex = 25 - oldIndex;
				} else {
					newIndex = oldIndex + key;
				}

				if (newIndex > 25) {
					newIndex -= 26;
				}

				if (Character.isUpperCase(c)) {
					result.append(Character.toUpperCase(alphabet.charAt(newIndex)));
				} else {
					result.append(alphabet.charAt(newIndex));
				}

			} else {
				result.append(c);
			}
		}
		return result.toString();
	}
}
