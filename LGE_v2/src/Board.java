import java.util.*;

public class Board 
{
	private Player[] players;
	private int pipeCount;
	private int waterfallCount;
	private int boardLength;
	private BoardNode Node;
	private Plant[] plantCardDeck;
	private int plantDeckPsotion;
	private boolean gameInProgress;
	
	public String toString() 
	{	
		BoardNode temp = this.Node;	
//https://stackoverflow.com/questions/19283083/printing-out-a-linked-list-using-tostring		
//this toString method has been mopdifyed from one of the code  fragements in the link above
		
		StringBuilder result = new StringBuilder();
	    while(temp.getNextNode()!=null)
	    {
	        result.append(temp.toString());
	        result.append(" "); 
	        
	        temp = temp.getNextNode();
	    }
	    return result.toString();
	}
	
	public void play() 
	{
		this.gameInProgress=true;
		int playerTurn = 4;
		
		while(this.gameInProgress) 
		{
			System.out.println(this.toString());
			
			for (int i =0;i<playerTurn;i++)
			{
				if(this.getPlayers()[i].isAtFianl() == false) 
				{
					this.getPlayers()[i].move(this.rollDice());
					System.out.println(this.toString());
				}
			}
			if((this.getPlayers()[0].isAtFianl())
						&& (this.getPlayers()[1].isAtFianl())
						&& (this.getPlayers()[2].isAtFianl())
						&& (this.getPlayers()[3].isAtFianl())) 
			{
				this.gameInProgress = false;
			}
			
			
		}
	}
	
	public int rollDice() 
	{
		return new Random().nextInt(6) + 1;
	}
	
	/*
	 * adds the cards to the board
	 * goes to each node and fills each nodes
	 * array of plants with a plant card from the plant card deck
	 * tempNode is used to hold the current position of where we are 
	 * on the board. then the plantDeckPosition is increased so we 
	 * dont add the same plant cards to every node in the board
	 * the first and last nodes shouldnt have any cards 
	**/
	public void addCards()
	{
		BoardNode tempNode =this.Node.getNextNode();
		
		while(tempNode.getNextNode()!=null) 
		{
			for(int i =0;i< this.Node.getNodesPlants().length-1;i++) 
			{
				tempNode.getNodesPlants()[i] = this.getPlantCardDeck()[this.plantDeckPsotion];
				this.plantDeckPsotion++;
			}
			
			tempNode = tempNode.getNextNode();
		}
	}
	
	/*shuffelPlantCards goes thruogh the 
	 * plantcards array and reassigns each card to a new position
	 * through first generating a random number, then preforming a modulus 
	 * operation then 
	 * */
	public void shuffelPlantCards() 
	{
		Random rand = new Random(); 
        
        for (int i = 0; i < this.plantCardDeck.length - 1; i++) 
        { 
            // Random for remaining positions. 
            int r = i + rand.nextInt(this.plantCardDeck.length - i); 
              
             //swapping the elements 
             Plant temp = this.plantCardDeck[r]; 
             this.plantCardDeck[r] = this.plantCardDeck[i]; 
             this.plantCardDeck[i] = temp; 
               
        } 
	}
	
	/*creates the start node first 
	*then adds in rest of the nodes 
	*the board is represented as a linked list
	*nextNode is a temp variable used to craete and 
	*hold new nodes in the board
	*/
	public void createBoard() 
	{
		this.Node = new BoardNode(0);
		this.Node.setStart(true);
		BoardNode tempStartNode = this.Node;
		
		for ( int i =0 ; i < this.boardLength; i++) 
		{
			if(i==0) 
			{
				this.Node.setNextNode( new BoardNode(i,0));
			}
			else if(i==this.boardLength-1) 
			{
				this.Node.setNextNode(new BoardNode(1+i,0));
				this.Node.setFinish(true);
			}
			else 
			{
				this.Node.setNextNode( new BoardNode(i,0));
			}
	
			this.Node = this.Node.getNextNode();
		}
		
		this.Node = tempStartNode;
	}
	
	//constructors 
	Board()
	{
		this.boardLength = 12;
		this.createBoard();
		this.setPlayers(4); 
		this.play();
	}
	
	Board(int playerCount)
	{
		this.boardLength = 31;
		this.createBoard();
		this.setPlayers(playerCount); 
		this.play();
	}

	//gettes and setters
	public Player[] getPlayers() 
	{
		return players;
	}

	//modifyed setter creates i number of players numbered 1 to i+1
	public void setPlayers(int numPlayers) 
	{
		this.players = new Player[numPlayers];
		int playerID =1;
		
		for(int j =0; j<numPlayers; j++ )
		{
			this.players[j] = new Player(playerID++,this.Node);
		}
	}

	public int getPipeCount() {
		return pipeCount;
	}

	public void setPipeCount(int pipeCount) {
		this.pipeCount = pipeCount;
	}

	public int getWaterfallCount() {
		return waterfallCount;
	}

	public void setWaterfallCount(int waterfallCount) {
		this.waterfallCount = waterfallCount;
	}

	public Plant[] getPlantCardDeck() {
		return plantCardDeck;
	}

	public void setPlantCardDeck(Plant[] plantCardDeck) {
		this.plantCardDeck = plantCardDeck;
	}

	public int getBoardLength() {
		return boardLength;
	}

	public void setBoardLength(int boardLength) {
		this.boardLength = boardLength;
	}
}
