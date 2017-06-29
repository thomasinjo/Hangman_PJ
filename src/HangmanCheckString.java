import java.util.Arrays;
import java.util.Random;


public class HangmanCheckString {

	public String[] hangmanWords = {"afghanistan", "albania","algeria","andorra",
            "angola","argentina","armenia","australia","austria","azerbaijan",
            "bahamas","bahrain","bangladesh","barbados","belarus","belgium","belize",
            "benin","bhutan","bolivia","bosnia","botswana","brazil","brunei","bulgaria",
            "burma","burundi",
            "cambodia","cameroon","canada","chad","chile","china","colombia","comoros","congo",
            "croatia","cuba","curacao","cyprus","czechia",
            "denmark","djibouti","dominica",
            "ecuador","egypt","eritrea","estonia","ethiopia",
            "fiji","finland","france",
            "gabon","georgia","germany","ghana","greece","grenada","guatemala","guinea","guyana",
            "haiti","honduras","hungary",
            "iceland","india","indonesia","iran","iraq","ireland","israel","italy",
            "jamaica","japan","jordan",
            "kazakhstan","kenya","kiribati","korea","kuwait","kyrgyzstan",
            "laos","latvia","lebanon","lesotho","liberia","libya","liechtenstein","lithuania","luxembourg",
            "macau","macedonia","madagascar","malawi","malaysia","maldives","mali","malta","mauritania",
            "mauritius","mexico","micronesia","moldova","monaco","mongolia","montenegro","morocco","mozambique",
            "namibia","nauru","nepal","netherlands","nicaragua","niger","nigeria","norway","oman",
            "pakistan","palau","palestinian","panama","paraguay","peru","philippines","poland","portugal","quatar",
            "romania","russia","rwanda",
            "samoa","senegal","serbia","seychelles","singapore","slovakia","slovenia","somalia",
            "spain","sudan","suriname","swaziland","sweden","switzerland","syria"};
	public String hangmanTemp;
	public char[] hangmanBlank = {'-','-','-','-','-','-','-','-','-','-',
			'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',};
	public char[] hangmanLetters;
	public char[] usedLetterList = {'-','-','-','-','-','-','-','-','-','-',
			'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',};
	char[]  charArray;
	char[] charArrayTest;
	boolean winOrLoose;
	boolean wrongChoice;
	int wrongGuess;
	boolean usedLetter;

	Random r;

public void chooseWord(){
	r = new Random();
	
	// choose a word from the list of words
            hangmanTemp = hangmanWords[r.nextInt(hangmanWords.length)];
            charArrayTest = hangmanTemp.toCharArray();
            hangmanLetters = hangmanTemp.toCharArray();
            charArray = hangmanTemp.toCharArray();
                for(int i = 0;i < charArray.length;i++){
                        charArrayTest[i]=hangmanBlank[i];
                        hangmanLetters[i]=hangmanBlank[i];
                }

}
public void checkWord(char ch){
	usedLetter= false;
	wrongChoice = false;
	char c = '-';
	int temp =0;
	for(int i = 0;i < charArray.length;i++){
			if(charArray[i] == ch){
				hangmanLetters[i] = ch; 
			}
	}
	for(int i = 0;i < usedLetterList.length;i++){
		if(usedLetterList[i] == ch){
			usedLetter = true;
		}
	}


	for(int i = 0;i < charArray.length;i++){
		if(charArray[i] == ch && wrongChoice == false){
			wrongChoice = true; 
		}
	}
	if(usedLetter == false){
		for(int i = 0;i < usedLetterList.length;i++){
			if(usedLetterList[i] == c){
				 temp = i;
				 break;
			}
		}
		usedLetterList[temp] = ch;
	}
	if(wrongChoice == false){
		wrongGuess = wrongGuess + 1;
		if(usedLetter == true){
			wrongGuess = wrongGuess - 1;
		}
	}
	winOrLoose = Arrays.equals(charArray,hangmanLetters);
}


}

