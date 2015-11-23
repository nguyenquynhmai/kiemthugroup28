public class MorseDecoder {
    public static String Decode (String sentence) {
	String result = "";
	//three spaces to seperate words
	sentence = sentence.trim ();
	String[] words = sentence.split ("   ");
	String[] alphabets;
	for (String word : words) {
	    word = word.trim ();
	    alphabets = word.split (" ");
	    for (String alphabet : alphabets) {
		result += MorseTable.Get (alphabet);
	    }
	    result += " ";
	}
	return result;
    }
}
