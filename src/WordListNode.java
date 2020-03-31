public class WordListNode  //This is a word node structure used by WordList
{
	public String input;  //Holds the user entered word
	public WordListNode next;  //Points to the next node in the wordList
	public PositionList occurance; //Points to a PositionList node position
	
	public WordListNode(String wordInput,int position) //Creates a new word node that points to null
	{
		input = wordInput;
		next = null;
		PositionList temp = new PositionList();  //Make a new positionList
		temp.add(position);    //Add the position to the positionList
		occurance = temp;
	}
}
