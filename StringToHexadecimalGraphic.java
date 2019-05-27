/*
 *Author @Kurt Kelly
 *			-kurtbkelly@gmail.com
 *
 *Published February 26th, 2019
 */

import java.util.ArrayList;

public class StringToHexadecimalGraphic {

	private String words;
	private int numOfPixels;
	private ArrayList<String> wordsWithoutSpaces;
	private ArrayList<String> hexVal;
	private ArrayList<String> colorsInHex;
	
	/**Constructs a new StringToHexadecimalGraphic object
	 * takes a String of any size
	 * takes out spaces from String
	 * puts word(s) from String into an ArrayList 'wordsWithoutSpaces'
	 * converts each letter's respective ASCII val into Hexadecimal,
	 * places each letter into an ArrayList 'hexVal'
	 * groups every three Hexadecimal vals into one string,
	 * places said String into an ArrayList 'colorsInHex' 
	 * 
	 * @param entry the words you are inputting to be converted to hexadecimal vals
	 */
	public StringToHexadecimalGraphic(String entry) {
		words = entry;
		wordsWithoutSpaces = new ArrayList<String>();
		hexVal = new ArrayList<String>();
		colorsInHex = new ArrayList<String>();
		while(words.indexOf(" ") > -1) {
			wordsWithoutSpaces.add(words.substring(0,  words.indexOf(" ")));
			words = words.substring(words.indexOf(" ")+1);
		}
		if(words.length() > 0)
			wordsWithoutSpaces.add(words);
		for(String word: wordsWithoutSpaces)
			for(int letter = 0; letter < word.length(); letter++) {		      //original map of characters in ASCII 33-122
				int asciiValOfLetter = (((word.charAt(letter))-33))*255/89;   //function that makes colors go from 0-255 instead of 33-122
				hexVal.add(Integer.toHexString(asciiValOfLetter));	
			}
		for(int val = 0; val < hexVal.size()-2; val+=3)
			colorsInHex.add("#"+hexVal.get(val)+hexVal.get(val+1)+hexVal.get(val+2));
		numOfPixels = (int) (Math.sqrt(colorsInHex.size()))+1;
		for(int sqrtOfNumPixels = (int) (Math.sqrt(colorsInHex.size()))-1; sqrtOfNumPixels <= (int) (Math.sqrt(colorsInHex.size()))+1; sqrtOfNumPixels++)
			if(Math.sqrt(colorsInHex.size()) == (double) sqrtOfNumPixels)  //checks if the number of pixels is a perfect square
				numOfPixels--;											   //if so, adjusts bounds of graphicBuilder so it isn't rounded up (ex: so 16 doesnt round up to 25 by mistake)
	}
	
	/**Returns the size of ArrayList 'colorsInHex'
	 * 
	 * @return the number of colors in one line
	 */
	public int getNumOfPixels() {
		return numOfPixels;
	}
	
	/**@return ArrayList 'colorsInHex' 
	 */
	public ArrayList<String> getColorsInHex() {
		return colorsInHex;
	}

}