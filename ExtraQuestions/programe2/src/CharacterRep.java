/*Author : Aayush Agarwal
version :  1.0.0
Purpose: Write a programe to shown ascii value of given character.
         
	*/

class CharacterRep{
	public static void main(String[] args) {
		char ch = 'a';  // character decleration and initialization

		int ascii = ch;

		int castascii = (int) ch;  //type casting  

		System.out.println("The Ascii value of " + ch + " is: " + ascii);
        System.out.println("The Ascii value of " + ch + " is: " + castascii);

	}
}