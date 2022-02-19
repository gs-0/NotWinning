import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public class Guess {
	private String word;
	private String user;

public String takeWord() {
	try {
	File dict = new File("src/words.txt");
	Scanner scan = new Scanner(dict);
	String[] retroWords = new String[6];
	int i = 0;
	while (scan.hasNext()) {
		retroWords[i] = scan.next();
		i++;
	}
	Random rand = new Random();
	int number = rand.nextInt(6);
	word = retroWords[number];
	return word;
	} catch (FileNotFoundException e) {
		System.err.println(e.getMessage());
	}
	return "";
}

public void promptUser() {
	Scanner stdIn = new Scanner(System.in);
	System.out.print("Your Guess: ");
	user = stdIn.nextLine();
}
public String compareWords() {
	String[] temp = new String[5];
	for (int i = 0 ; i < word.length(); i++) {
		boolean check = true;
		for (int j = i ; j < user.length() && check; j++) {
			
			if(user.charAt(j) == word.charAt(i) && i != j ) {
				temp[j] = "#";
				check = false;
			}
			
			if(user.charAt(j) != word.charAt(i) && i == j){
				temp[j] = "_";

			}
			
			
			
			if (user.charAt(j) == word.charAt(i) && i == j) {
				temp[j] = "*";
				check = false;
			}
		}
			
	}
	String tempWord = "";
	for (int i = 0 ; i < temp.length; i++) {
		tempWord += temp[i];
	}
	return tempWord;
}}
