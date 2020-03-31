/*  Erik Safford
 *  Word Index Utility in Java
 *  MAY 2018
*/
public class Main 
{
	public static void main(String[] args)
	{
		IndexUtility myIU=new IndexUtility(); //contruct the IU
		WordList myList=myIU.buildIndex(); // index stdin, build a WordList, save as myList
		myList.print(); // show the index
	}
}
