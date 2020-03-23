import java.util.ArrayList;

public class Player 
{
	private int id;
	private BoardNode currentNode;
	private int boardNodeNumber;
	private ArrayList<Plant> inverntory;
	
	public void move(int numSpaces) 
	{
		for(int i=0;i<numSpaces;i++) 
		{
			this.currentNode = this.currentNode.getNextNode();
		}
		
		if(this.currentNode.) 
		{
			
		}
	}
	
	//constructors
	Player(int id, BoardNode currentNode)
	{
		this.setId(id);
		this.setInverntory(new ArrayList<Plant>());
		this.setCurrentNode(currentNode);
		
	}

	//getters and setter
	public BoardNode getCurrentNode() {
		return currentNode;
	}

	public void setCurrentNode(BoardNode currentNode) {
		this.currentNode = currentNode;
	}

	public int getBoardNodeNumber() {
		return boardNodeNumber;
	}

	public void setBoardNodeNumber(int boardNodeNumber) {
		this.boardNodeNumber = boardNodeNumber;
	}

	public ArrayList<Plant> getInverntory() {
		return inverntory;
	}

	public void setInverntory(ArrayList<Plant> inverntory) {
		this.inverntory = inverntory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
