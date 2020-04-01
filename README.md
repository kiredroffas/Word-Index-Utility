# Word-Index-Utility
* This program reads in text from stdin and breaks it into "words", and converts each word to lowercase. It then keeps count of the position (starting from 1) of each word in the input stream. Next it builds an index of each word, identifying all the positions in which it occurs. Finally it prints the index, with the words alphabetically sorted. 
* The index is a linked list of linked lists. The WordList contains the words (sorted), a pointer to the next word node, and a pointer to a linked list of positions (PositionList). The PositionList contains a position (int) and a pointer to the next position node. The nodes for the two linked lists (WordListNode and PositionListNode) are in separate classes and utilize sentinal nodes to keep track of the beginning of each linked list.
<br>
![Alt text](/screenshots/sc1.png?raw=true "Screenshot")
