public class PositionListNode  //This is a position node structure used by PositionList
{	
	public int data;   //Holds the integer of the position of the word in wordList
	public PositionListNode next;  //Points to the next position node in the positionList
	
	public PositionListNode(int data) //Creates a node that points to null
	{
		this.data = data;
		next = null;
	}
}
