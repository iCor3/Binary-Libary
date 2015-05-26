package org.k3rnel.util.ascii;


/**
 * 
 * @author Lucas Møller / Ferreon
 * @param <T>
 * @since Java 1.8
 * @category Math
 * 
 * @description
 * This class convert,
 * Ascii to Binary numbers
 * Disclaimer : The program is distributed in open source, Therefore it have no warranty.
 * YOU'RE FREE TO CHANGE THE PROGRAM AND DISTRIBUTE NEW VERSION OF IT!
 * YOU'RE ALSO FREE TO CLAIM THAT YOU MADE THIS, HOWEVER LEACHING WILL LEAD NOWHERE IN LIFE.
 * YOU CAN FIND ME AT XAT.COM/CSCE , XAT.COM/UID0, XAT.COM/BINKNIFE , XAT.COM/ABCZ ,
 * XAT.COM/DOSHMANIA2LTD , XAT.COM/HEARTLESS_DEMONS , XAT.COM/JUSTINBIEBERZONE . Regname is Ferreon,
 * I usually go with the nickname: Lucas	\\KittenSquad.
 * A
 * -------------------------------------------------------------------------------
 * 
 * @see public static String getChar(String binary);
 * 
 * @see public static String getBinary(char Char);
 * 
 * @see byASCII(String text);
 * 
 */

public abstract class Binary implements java.io.Serializable
{ 
	/**
	 * Using the serialVersionUID for interoperability
	 */
	private static final long serialVersionUID = -2243126548449633035L;

	/*
	 * Small Character's Binaray Value
	 */
	// Small a's, binary value
	public static final String BINARY_SMALL_A = "0"+ Integer.toBinaryString(97);
	
	// Small b's, binary value
	public static final String BINARY_SMALL_B = "0"+ Integer.toBinaryString(98);
	
	// Small c's, binary value
	public static final String BINARY_SMALL_C = "0"+ Integer.toBinaryString(99);
	
	// Small d's, binary value
	public static final String BINARY_SMALL_D = "0"+ Integer.toBinaryString(100);
	
	// Small e's, binary value
	public static final String BINARY_SMALL_E = "0"+ Integer.toBinaryString(101);
	
	// Small f's, binary value
	public static final String BINARY_SMALL_F = "0"+ Integer.toBinaryString(102);
	
	// Small g's, binary value
	public static final String BINARY_SMALL_G = "0"+ Integer.toBinaryString(103);
	
	// Small h's, binary value
	public static final String BINARY_SMALL_H = "0"+ Integer.toBinaryString(104);
	
	// Small i's, binary value
	public static final String BINARY_SMALL_I = "0"+ Integer.toBinaryString(105);
	
	// Small j's, binary value
	public static final String BINARY_SMALL_J = "0"+ Integer.toBinaryString(106);
	
	// Small k's, binary value
	public static final String BINARY_SMALL_K = "0"+ Integer.toBinaryString(107);
	
	// Small l's, binary value
	public static final String BINARY_SMALL_L = "0"+ Integer.toBinaryString(108);
	
	// Small m's, binary value
	public static final String BINARY_SMALL_M = "0"+ Integer.toBinaryString(109);
	
	// Small n's, binary value
	public static final String BINARY_SMALL_N = "0"+ Integer.toBinaryString(110);
	
	// Small o's, binary value
	public static final String BINARY_SMALL_O = "0"+ Integer.toBinaryString(111);
	
	// Small p's, binary value
	public static final String BINARY_SMALL_P = "0"+ Integer.toBinaryString(112);
	
	// Small q's, binary value
	public static final String BINARY_SMALL_Q = "0"+ Integer.toBinaryString(113);
	
	// Small r's, binary value
	public static final String BINARY_SMALL_R = "0"+ Integer.toBinaryString(114);
	
	// Small s's, binary value
	public static final String BINARY_SMALL_S = "0"+ Integer.toBinaryString(115);
	
	// Small t's, binary value
	public static final String BINARY_SMALL_T = "0"+ Integer.toBinaryString(116);
	
	// Small u's, binary value
	public static final String BINARY_SMALL_U = "0"+ Integer.toBinaryString(117);
	
	// Small v's, binary value
	public static final String BINARY_SMALL_V = "0"+ Integer.toBinaryString(118);
	
	// Small w's, binary value
	public static final String BINARY_SMALL_W = "0"+ Integer.toBinaryString(119);
	
	// Small x's, binary value
	public static final String BINARY_SMALL_X = "0"+ Integer.toBinaryString(120);
	
	// Small y's, binary value
	public static final String BINARY_SMALL_Y = "0"+ Integer.toBinaryString(121);
	
	// Small z's, binary value
	public static final String BINARY_SMALL_Z = "0"+ Integer.toBinaryString(122);
	
	
	/*
	 * Capitalized Characters Binary Value
	 */
	
	// Capitalized A's Binary value
	
	public static final String BINARY_CAP_A = "0"+ Integer.toBinaryString(65);
	
	// Capitalized B's Binary value
	public static final String BINARY_CAP_B = "0"+ Integer.toBinaryString(66);
	
	// Capitalized C's Binary value
	public static final String BINARY_CAP_C = "0"+ Integer.toBinaryString(67);
	
	// Capitalized D's Binary value
	public static final String BINARY_CAP_D = "0"+ Integer.toBinaryString(68);
	
	// Capitalized E's Binary value
	public static final String BINARY_CAP_E = "0"+ Integer.toBinaryString(69);
	
	// Capitalized F's Binary value
	public static final String BINARY_CAP_F = "0"+ Integer.toBinaryString(70);
		
	// Capitalized G's Binary value
	public static final String BINARY_CAP_G = "0"+ Integer.toBinaryString(71);
		
	// Capitalized H's Binary value
	public static final String BINARY_CAP_H = "0"+ Integer.toBinaryString(72);
		
	// Capitalized I's Binary value
	public static final String BINARY_CAP_I = "0"+ Integer.toBinaryString(73);
		
	// Capitalized J's Binary value
	public static final String BINARY_CAP_J = "0"+ Integer.toBinaryString(74);

	// Capitalized K's Binary value
	public static final String BINARY_CAP_K = "0"+ Integer.toBinaryString(75);
	
	// Capitalized L's Binary value
	public static final String BINARY_CAP_L = "0"+ Integer.toBinaryString(76);
	
	// Capitalized M's Binary value
	public static final String BINARY_CAP_M = "0"+ Integer.toBinaryString(77);
	
	// Capitalized N's Binary value
	public static final String BINARY_CAP_N = "0"+ Integer.toBinaryString(78);
	
	// Capitalized O's Binary value
	public static final String BINARY_CAP_O = "0"+ Integer.toBinaryString(79);
	
	// Capitalized P's Binary value
	public static final String BINARY_CAP_P = "0"+ Integer.toBinaryString(80);
		
	// Capitalized Q's Binary value
	public static final String BINARY_CAP_Q = "0"+ Integer.toBinaryString(81);
		
	// Capitalized R's Binary value
	public static final String BINARY_CAP_R = "0"+ Integer.toBinaryString(82);
		
	// Capitalized S's Binary value
	public static final String BINARY_CAP_S = "0"+ Integer.toBinaryString(83);
		
	// Capitalized T's Binary value
	public static final String BINARY_CAP_T = "0"+ Integer.toBinaryString(84);
		
	// Capitalized U's Binary value
	public static final String BINARY_CAP_U = "0"+ Integer.toBinaryString(85);
	
	// Capitalized V's Binary value
	public static final String BINARY_CAP_V = "0"+ Integer.toBinaryString(86);
		
	// Capitalized W's Binary value
	public static final String BINARY_CAP_W = "0"+ Integer.toBinaryString(87);
		
	// Capitalized X's Binary value
	public static final String BINARY_CAP_X = "0"+ Integer.toBinaryString(88);
		
	// Capitalized Y's Binary value
	public static final String BINARY_CAP_Y = "0"+ Integer.toBinaryString(89);
		
	// Capitalized Z's Binary value
	public static final String BINARY_CAP_Z = "0"+ Integer.toBinaryString(90);
	
	// Special Signs
	
	// Space
	public static final String BINARY_SPACE = "0"+ Integer.toBinaryString(32);
	public static final String BINARY_COMMA = "0"+ Integer.toBinaryString(44);
	public static final String BINARY_PERIOD = "0"+ Integer.toBinaryString(44);
	//Add more here, the template is:
//	  public static final String BINARY_CHARNAME = "0"+ Integer.toBinaryString(CHARCODE);
//	  Remember to add to byChar(char Char) and getChar(String binary), function			
		
	
	/**
	 * 
	 * @param Char
	 * returns Binary value of character Char.
	 */
	
	public static String byChar(char Char) 
	{
		String retBinary = "NULL"; // the return value
		
		/*
		 * Checks what character it is.
		 */
		if(Char == 'a') retBinary = BINARY_SMALL_A;
		if(Char == 'b') retBinary = BINARY_SMALL_B;
		if(Char == 'c') retBinary = BINARY_SMALL_C;
		if(Char == 'd') retBinary = BINARY_SMALL_D;
		if(Char == 'e') retBinary = BINARY_SMALL_E;
		if(Char == 'f') retBinary = BINARY_SMALL_F;
		if(Char == 'g') retBinary = BINARY_SMALL_G;
		if(Char == 'h') retBinary = BINARY_SMALL_H;
		if(Char == 'i') retBinary = BINARY_SMALL_I;
		if(Char == 'j') retBinary = BINARY_SMALL_J;
		if(Char == 'k') retBinary = BINARY_SMALL_K;
		if(Char == 'l') retBinary = BINARY_SMALL_L;
		if(Char == 'm') retBinary = BINARY_SMALL_M;
		if(Char == 'n') retBinary = BINARY_SMALL_N;
		if(Char == 'o') retBinary = BINARY_SMALL_O;
		if(Char == 'p') retBinary = BINARY_SMALL_P;
		if(Char == 'q') retBinary = BINARY_SMALL_Q;
		if(Char == 'r') retBinary = BINARY_SMALL_R;
		if(Char == 's') retBinary = BINARY_SMALL_S;
		if(Char == 't') retBinary = BINARY_SMALL_T;
		if(Char == 'u') retBinary = BINARY_SMALL_U;
		if(Char == 'v') retBinary = BINARY_SMALL_V;
		if(Char == 'w') retBinary = BINARY_SMALL_W;
		if(Char == 'x') retBinary = BINARY_SMALL_X;
		if(Char == 'y') retBinary = BINARY_SMALL_Y;
		if(Char == 'z') retBinary = BINARY_SMALL_Z;
		if(Char == 'A') retBinary = BINARY_CAP_A;
		if(Char == 'B') retBinary = BINARY_CAP_B;
		if(Char == 'C') retBinary = BINARY_CAP_C;
		if(Char == 'D') retBinary = BINARY_CAP_D;
		if(Char == 'E') retBinary = BINARY_CAP_E;
		if(Char == 'F') retBinary = BINARY_CAP_F;
		if(Char == 'H') retBinary = BINARY_CAP_G;
		if(Char == 'H') retBinary = BINARY_CAP_H;
		if(Char == 'I') retBinary = BINARY_CAP_I;
		if(Char == 'J') retBinary = BINARY_CAP_J;
		if(Char == 'K') retBinary = BINARY_CAP_K;
		if(Char == 'L') retBinary = BINARY_CAP_L;
		if(Char == 'M') retBinary = BINARY_CAP_M;
		if(Char == 'N') retBinary = BINARY_CAP_N;
		if(Char == 'O') retBinary = BINARY_CAP_O;
		if(Char == 'P') retBinary = BINARY_CAP_P;
		if(Char == 'Q') retBinary = BINARY_CAP_Q;
		if(Char == 'R') retBinary = BINARY_CAP_R;
		if(Char == 'S') retBinary = BINARY_CAP_S;
		if(Char == 'T') retBinary = BINARY_CAP_T;
		if(Char == 'U') retBinary = BINARY_CAP_U;
		if(Char == 'V') retBinary = BINARY_CAP_V;
		if(Char == 'W') retBinary = BINARY_CAP_W;
		if(Char == 'X') retBinary = BINARY_CAP_X;
		if(Char == 'Y') retBinary = BINARY_CAP_Y;
		if(Char == 'Z') retBinary = BINARY_CAP_Z;
		if(Char == ' ') retBinary = BINARY_SPACE;
		if(Char == ',') retBinary = BINARY_COMMA;
		
		/*
		 * Returns the binary number of the character!
		 */
		return retBinary;
	}
	
	
	/**
	 * @param binary
	 * returns the char of (String)binary number!
	 */
	public static String getChar(String binary)
	{
		String Char = "";
	
		if(binary == BINARY_SMALL_A) Char = "a";
		if(binary == BINARY_SMALL_B) Char = "b";
		if(binary == BINARY_SMALL_C) Char = "c";
		if(binary == BINARY_SMALL_D) Char = "d";
		if(binary == BINARY_SMALL_E) Char = "e";
		if(binary == BINARY_SMALL_F) Char = "f";
		if(binary == BINARY_SMALL_G) Char = "g";
		if(binary == BINARY_SMALL_H) Char = "h";
		if(binary == BINARY_SMALL_I) Char = "i";
		if(binary == BINARY_SMALL_J) Char = "j";
		if(binary == BINARY_SMALL_K) Char = "k";
		if(binary == BINARY_SMALL_L) Char = "l";
		if(binary == BINARY_SMALL_M) Char = "m";
		if(binary == BINARY_SMALL_N) Char = "n";
		if(binary == BINARY_SMALL_O) Char = "o";
		if(binary == BINARY_SMALL_P) Char = "p";
		if(binary == BINARY_SMALL_R) Char = "r";
		if(binary == BINARY_SMALL_S) Char = "s";
		if(binary == BINARY_SMALL_T) Char = "t";
		if(binary == BINARY_SMALL_U) Char = "u";
		if(binary == BINARY_SMALL_V) Char = "v";
		if(binary == BINARY_SMALL_W) Char = "w";
		if(binary == BINARY_SMALL_X) Char = "x";
		if(binary == BINARY_SMALL_Y) Char = "y";
		if(binary == BINARY_SMALL_Z) Char = "z";
		if(binary == BINARY_CAP_A) Char = "A";
		if(binary == BINARY_CAP_B) Char = "B";
		if(binary == BINARY_CAP_C) Char = "C";
		if(binary == BINARY_CAP_D) Char = "D";
		if(binary == BINARY_CAP_E) Char = "E";
		if(binary == BINARY_CAP_F) Char = "F";
		if(binary == BINARY_CAP_G) Char = "G";
		if(binary == BINARY_CAP_H) Char = "H";
		if(binary == BINARY_CAP_I) Char = "I";
		if(binary == BINARY_CAP_J) Char = "J";
		if(binary == BINARY_CAP_K) Char = "K";
		if(binary == BINARY_CAP_L) Char = "L";
		if(binary == BINARY_CAP_M) Char = "M";
		if(binary == BINARY_CAP_N) Char = "N";
		if(binary == BINARY_CAP_O) Char = "O";
		if(binary == BINARY_CAP_P) Char = "P";
		if(binary == BINARY_CAP_Q) Char = "Q";
		if(binary == BINARY_CAP_R) Char = "R";
		if(binary == BINARY_CAP_S) Char = "S";
		if(binary == BINARY_CAP_T) Char = "T";
		if(binary == BINARY_CAP_V) Char = "U";
		if(binary == BINARY_CAP_W) Char = "V";
		if(binary == BINARY_CAP_X) Char = "X";
		if(binary == BINARY_CAP_Y) Char = "Y";
		if(binary == BINARY_CAP_Z) Char = "Z";
		if(binary == BINARY_SPACE) Char = " ";
		if(binary == BINARY_COMMA) Char = ",";
		
		return Char;
	}
	
	/**
	 * 
	 * @param ASCII
	 * ASCII, means American standard code of interchange information.
	 * In other words, characters.
	 */
	public static String byASCII(String ASCII)
	{
		StringBuilder retVal = new StringBuilder(""); // Return Value-
		char[] asciiChars = ASCII.toCharArray(); // The char array from Text String
		
		for(char c: asciiChars) // For each character in string.
		{	
			switch(c) 
			{
			case '.':
				retVal.append(".");
				break;
			default:
				retVal.append(byChar(c) + " ");
				break;
			}
		}
		
		retVal.trimToSize();
		return retVal.toString(); // Return Binary Numbers
		// Example of returned value is: 1101000 1101001 = hi
	}	
}
