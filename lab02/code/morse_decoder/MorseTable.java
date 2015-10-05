import java.lang.*;

public class MorseTable {
    public static final int ASCIIStart = 65; //the ASCII code for letter "A"
    public static String[] transitionTable = {
	".-",   //A
	"-...", //B
	"-.-.", //C
	"-..",  //D
	".",    //E
	"..-.", //F
	"--.",  //G
	"....", //H
	"..",   //I
	".---", //J
	"-.-",  //K
	".-..", //L
	"--",   //M
	"-.",   //N
	"---",  //O
	".--.", //P
	"--.-", //Q
	".-.",  //R
	"...",  //S
	"-",    //T
	"..-",  //U
	"...-", //V
	".--",  //W
	"-..-", //X
	"-.--", //Y
	"--.."  //Z
    };
	
    public static char Get (String input) {
	int i = 0;
	char result = ' ';
	for (String ele : transitionTable) {
	    if (ele.equals (input))
		result =  ((char) (ASCIIStart + i));
	    i++;
	}
	return result; //result will be ' ' if the function unable to translate the input
    }
}
    

