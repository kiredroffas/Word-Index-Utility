public class PositionList //This is a linked list that stores PositionListNode's
{
	public PositionListNode positionSent = null; //sentinel node of LL
	public PositionListNode positionTemp = null; //temp node of LL
	
	public PositionList()  //Initializes a positionNode sentinel
	{
		positionSent = new PositionListNode(-99); //Sentinel node
	}
	
	public void add(int data)  //adds new postionNode containing given data to end of positionList
	{
		if(positionSent.next == null)  //If the positionList is empty
		{
			positionTemp = new PositionListNode(data);  //Make a new positionList node
			positionSent.next = positionTemp;  //set the sentinel to newly created node
		}
		else  //If list already has data, insert after the last node
		{
			positionTemp = positionSent;  //Save the location of the sentinel
			while(positionTemp.next != null)  //While its not the end of the list
			{
				positionTemp = positionTemp.next; //Traverse until end of list
			}
			positionTemp.next = new PositionListNode(data); //add new node
		}
	}
	public void print()  //This prints the positions the wordNode's occur in
	{
		PositionListNode temp = positionSent.next;  //temp equals the node's positionList (after the sentinel)
		while(temp != null)  //While its not the end of the positionList
		{
			System.out.print(" " + temp.data);
			temp = temp.next;
		}
		System.out.println(" ");
	}
}
