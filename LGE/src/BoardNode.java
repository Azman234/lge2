
public class BoardNode
{
	private int nodeNumber;
	private boolean isStart;
	private boolean isFinish;
	private BoardNode nextNode;
	private Plant[] nodesPlants;
	private int playerCount;
	
	@Override
	public String toString() 
	{
		return "[]";
	}
	
	//constrouctors 
	BoardNode(int nodeNumber)
	{
		this.setPlayerCount(4);
		this.setNodeNumber(nodeNumber);
	}
	

	BoardNode(int nodeNumber,BoardNode nextNode)
	{
		this.setNodeNumber(nodeNumber);
		this.setNextNode(nextNode);
	}
			
	//getters and setters
	public int getNodeNumber() {
		return nodeNumber;
	}

	public void setNodeNumber(int nodeNumber) {
		this.nodeNumber = nodeNumber;
	}

	public boolean isStart() {
		return isStart;
	}

	public void setStart(boolean isStart) {
		this.isStart = isStart;
	}

	public boolean isFinish() {
		return isFinish;
	}

	public void setFinish(boolean isFinish) {
		this.isFinish = isFinish;
	}

	public BoardNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(BoardNode nextNode) {
		this.nextNode = nextNode;
	}

	public Plant[] getNodesPlants() {
		return nodesPlants;
	}

	public void setNodesPlants(Plant[] nodesPlants) {
		this.nodesPlants = nodesPlants;
	}
	
	public int getPlayerCount() 
	{
		return this.playerCount;
	}
	
	public void setPlayerCount(int i)
	{
		this.playerCount =i;
	}
}
