public class test {
    public static void main (String[] args) {
	System.out.println(MorseTable.Get ("."));
	System.out.println(MorseTable.Get ("--."));
	String[] string = {
	    "  .---   ..-. .     .  ",
	    ".... . .-.. .-.. ---",
	    "-.. --- -. -   - .-. -.--   -. ..- -- -... . .-."
	};
	for (String sentence : string) {
	    System.out.println (MorseDecoder.Decode (sentence));
	}
	
    }
}
