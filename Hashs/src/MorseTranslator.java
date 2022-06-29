import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MorseTranslator {
	public String translate(String morseCode) {
		Map<String, String> morseMap = new HashMap<>();
		morseMap.put(".-", "A");
		morseMap.put("-...", "B");
		morseMap.put("-.-.", "C");
		morseMap.put("-..", "D");
		morseMap.put(".", "E");
		morseMap.put("..-.", "F");
		morseMap.put("--.", "G");
		morseMap.put("....", "H");
		morseMap.put("..", "I");
		morseMap.put(".---", "J");
		morseMap.put("-.-", "K");
		morseMap.put(".-..", "L");
		morseMap.put("--", "M");
		morseMap.put("-.", "N");
		morseMap.put("---", "O");
		morseMap.put(".--.", "P");
		morseMap.put("--.-", "Q");
		morseMap.put(".-.", "R");
		morseMap.put("...", "S");
		morseMap.put("-", "T");
		morseMap.put("..-", "U");
		morseMap.put("...-", "V");
		morseMap.put(".--", "W");
		morseMap.put("-..-", "X");
		morseMap.put("-.--", "Y");
		morseMap.put("--..", "Z");
		morseMap.put("/", " ");

		String morseWord = "";
		String translation = "";

		for (int i = 0; i < morseCode.length(); i++) {
			if (!morseCode.substring(i, i + 1).equals(" ")) {
				morseWord += morseCode.substring(i);
			} else if (!morseCode.substring(i).equals("/")) {
				translation += morseMap.get(morseWord);
				morseWord = "";
			} else {
				translation += " ";
			}
		}

		String word = "";
		String[] parts = morseCode.split(" ");
		for (String part : parts) {
			word += morseMap.get(part);
		}

		return word;

	}

	public String translateToMorse(String morseCode) {
		Map<String, String> morseMap = new HashMap<>();
		morseMap.put(".-", "A");
		morseMap.put("-...", "B");
		morseMap.put("-.-.", "C");
		morseMap.put("-..", "D");
		morseMap.put(".", "E");
		morseMap.put("..-.", "F");
		morseMap.put("--.", "G");
		morseMap.put("....", "H");
		morseMap.put("..", "I");
		morseMap.put(".---", "J");
		morseMap.put("-.-", "K");
		morseMap.put(".-..", "L");
		morseMap.put("--", "M");
		morseMap.put("-.", "N");
		morseMap.put("---", "O");
		morseMap.put(".--.", "P");
		morseMap.put("--.-", "Q");
		morseMap.put(".-.", "R");
		morseMap.put("...", "S");
		morseMap.put("-", "T");
		morseMap.put("..-", "U");
		morseMap.put("...-", "V");
		morseMap.put(".--", "W");
		morseMap.put("-..-", "X");
		morseMap.put("-.--", "Y");
		morseMap.put("--..", "Z");
		morseMap.put("/", " ");

		String word = "";
		String[] parts = morseCode.split(" ");
		for (String part : parts) {
			for (Entry<String, String> entry : morseMap.entrySet()) {
				if (entry.getValue().equals(part)) {
					word += (entry.getKey());
					System.out.println(word);
				}
			}

		}

		return word;

	}
}
