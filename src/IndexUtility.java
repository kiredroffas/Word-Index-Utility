import java.util.Scanner;  //Include so we can use a Scanner variable
public class IndexUtility 
{
	public WordList buildIndex() //reads stdin, builds a wordlist, and return that worlist
	{
		WordList theWordList = new WordList();  //Create a new wordlist
		int positionFlag = 0;    //Start position flag at 0 because will increment (to start at 1)
		
		Scanner sc = new Scanner(System.in);  //Open a new scanner for stdin
		String cmdLineInput;
		System.out.println("Enter some words to be sorted, enter q when done\n");  //Promt user input
		while(true)  //Infinite loop
		{
			cmdLineInput = sc.nextLine();  //Reads in a string from stdin to cmdLineInput
			cmdLineInput = cmdLineInput.toLowerCase();  //Convert the string to lowercase
			if(cmdLineInput.equals("q"))   //Check to see if the user is done entering input
			{
				System.out.println("Exit...");  //If user enters 'q' the program exits
				break;
			}
			String[] strArray = cmdLineInput.split(" ");  //.split() splits the read in string into words and stores them in String array
			for(String a : strArray)  // colon notation sets a to every String in strArray (one at a time)
			{
				positionFlag++;  //increment position flag
				theWordList.addWord(a,positionFlag);  //add each word to the word list with its position
			}	
		}
		sc.close();   //Close the Scanner so no memory leaks
		return(theWordList);  //Return the wordlist with words from stdin
	}
}
