import java.util.ArrayList;

public class Player 
{
	private int id;
	private BoardNode currentNode;
	private int boardNodeNumber;
	private ArrayList<Plant> inverntory;
	private boolean isAtFinal;
	
	public boolean isAtFianl() 
	{
		if(this.currentNode.isFinish()==true)
			this.isAtFinal=true;
			
			return this.isAtFinal;
	}
	
	/*
	 * This function move(int) 
	 * takes in the number of nodes that need to be moved accross 
	 * then sets the players position to the next node until the player has moved 
	 * Across all the spaces required the loop will break if the current node is also 
	 * the finish
	 * 
	 * */
	public void move(int numSpaces) 
	{
		for(int i=0;i<numSpaces;i++) 
	{
			if(this.isAtFinal == false) 
			{
				if(this.currentNode.isPipe()||this.currentNode.isWaterfall()) 
				{
					this.currentNode.setPlayerCount(-1);
					this.currentNode = this.currentNode.getPairedNode();
					this.currentNode.setPlayerCount(1);
				}
				else 
				{	
					if(this.getCurrentNode().getNextNode()==null)
					{
						System.out.println("Player: "+ this.id + " has finished");
						this.isAtFinal=true;
					}
					else
					{
						if(this.getCurrentNode().getNextNode()!=null)
							this.currentNode.setPlayerCount(-1);
						this.currentNode = this.currentNode.getNextNode();
						this.currentNode.setPlayerCount(1);
					}
				}
			}
			else 
			{
				this.setIsAtFinal(true);
			}
		}	
	}
	
	//constructors
	Player(int id, BoardNode currentNode)
	{
		this.setId(id);
		this.setInverntory(new ArrayList<Plant>());
		this.setCurrentNode(currentNode);
		this.setIsAtFinal(false);		
	}

	//getters and setters
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
	
	public void setIsAtFinal(boolean isAtFinal) 
	{
		this.isAtFinal = isAtFinal;
	}
}
