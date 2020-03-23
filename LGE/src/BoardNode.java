
public class BoardNode
{
	private int nodeNumber;
	private boolean isStart;
	private boolean isFinish;
	private BoardNode nextNode;
	private Plant[] nodesPlants;
	private int playerCount;
	private boolean isWaterfall;
	private boolean isPipe;
	private BoardNode pairedNode;
	private int type;
	
	@Override
	public String toString() 
	{
		String temp ="[]";
		if(this.playerCount==0) 
			temp = "[]";
		else if(this.playerCount==1)
			temp = "[ P1 ]";
		else if(this.playerCount==2)
			return temp ="[ P1 P2 ]";
		else if(this.playerCount==3)
			temp = "[ P1 P2 P3 ]";
		else if(this.playerCount==4)
			temp = "[ P1 P2 P3 P4]";
		return temp;
	}
	
	//constrouctors 
	BoardNode(int nodeNumber)
	{
		this.setPlayerCount(4);
		this.setNodeNumber(nodeNumber);
	}
	

	BoardNode(int nodeNumber,BoardNode nextNode,int type)
	{
		this.setNodeNumber(nodeNumber);
		this.setNextNode(nextNode);
		this.setType(type);
		this.setPlayerCount(0);
	}
	
	BoardNode(int nodeNumber,BoardNode nextNode, int type, BoardNode pairedNode)
	{
		this.setNodeNumber(nodeNumber);
		this.setNextNode(nextNode);
		this.setType(type);
		this.setPairedNode(pairedNode);
		this.setPlayerCount(0);
	}
			
	public BoardNode(int nodeNumber, int type) 
	{
		this.setNodeNumber(nodeNumber);
		this.setType(type);
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
		if(i ==0)
			this.playerCount = 0;
		else
			this.playerCount +=i;
	}

	public boolean isWaterfall() {
		return isWaterfall;
	}

	public void setWaterfall(boolean isWaterfall) {
		this.isWaterfall = isWaterfall;
		
		if(isWaterfall) 
		{
			this.setPipe(false);
		}
	}

	public boolean isPipe() {
		return isPipe;
	}

	public void setPipe(boolean isPipe) {
		this.isPipe = isPipe;
		
		if(isPipe) 
		{
			this.setWaterfall(false);
		}
	}

	public BoardNode getPairedNode() {
		return pairedNode;
	}

	public void setPairedNode(BoardNode pairedNode) {
		this.pairedNode = pairedNode;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) 
	{
		this.type = type;
		
		switch(type) 
		{
			case 0: 
				this.setPipe(false);
				this.setWaterfall(false);
				this.setPairedNode(null);
				break;
			case 1:
				this.setWaterfall(true);
				break;
			case 2:
				this.setPipe(true);
				break;
		}
	}
}
