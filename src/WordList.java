public class WordList  //This is a linked list that stores WordListNode's
{
	WordListNode wordSent;   //Sentinel node
	WordListNode wordTemp,wordPrev;  
	
	public WordList()
	{
		wordSent = new WordListNode("random",0);  //initialize sentinel node
	}
	
	public void addWord(String word,int position)  //Adds a new node or appends a new position to
	{                                              //the positionList associated with the word
		if(wordSent.next == null)   //If the list is empty
		{
			wordTemp = new WordListNode(word,position);  //Create a new WordListNode with the new word information
			wordSent.next = wordTemp;                    //Point the sentinel to the newly created node
		}
		else    //If the list is not empty
		{
			wordPrev = wordSent;         //Make the sentinel node the previous node
			wordTemp = wordPrev.next;    //take the node after the sentinel as wordTemp
			while(wordTemp != null)  //While its not the end of the list
			{
				if(wordTemp.input.equals(word))  //if wordTemp equals our newly created node (same word)
				{
					wordTemp.occurance.add(position);  //Add a position to wordTemp's positionList
					return;
				}
				else if(word.compareTo(wordTemp.input) < 0)  //If the new word being added is alphabetically before wordTemp
				{
					WordListNode newNode = new WordListNode(word,position);  //Create a new word node
					wordPrev.next = newNode;      //Point previous node to newNode
					newNode.next = wordTemp;      //Point newNode to wordTemp
					return;
				}
				else  //Else if the new word being added is alphabetically after wordTemp
				{
					wordTemp = wordTemp.next;   //wordTemp equals the word node after wordTemp
					wordPrev = wordPrev.next;   //wordPrev equals the word node after wordPrev
					if(wordTemp == null)  //If we reach the end of the list before finding alphabetically after
					{
						WordListNode newNode = new WordListNode(word,position);  //create a new word node
						wordPrev.next = newNode;  //Point the previous node to the newNode
						newNode.next = null;      //Point the newNode to nothing (end of list)
						return;
					}
				}
			}
		}		
	}
	public void print()  //Traverses the wordList, prints sorted output,one word per line w/positions separated by spaces (increasing order)
	{                    
		WordListNode temp = wordSent.next;  //temp equals the word node after the sentinel
		System.out.print("\n");
		while(temp != null)  //While the list is not empty
		{
			System.out.print(temp.input);   //Print the word from the word node
			PositionList thisOne = temp.occurance;
			if(thisOne != null)
			{
				thisOne.print();  //Print the positions the word occurs (from PositionList)
			}
			temp = temp.next;  //Iterate through the word list
		}
	}
}
