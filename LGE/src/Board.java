import java.util.*;

public class Board 
{
	private Player[] players;
	private int pipeCount;
	private int waterfallCount;
	private BoardNode Node;
	private Plant[] plantCardDeck;
	private int plantDeckPsotion;
	
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
            int r = i + rand.nextInt(52 - i); 
              
             //swapping the elements 
             Plant temp = this.plantCardDeck[r]; 
             this.plantCardDeck[r] = this.plantCardDeck[i]; 
             this.plantCardDeck[i] = temp; 
               
        } 
	}
	
	/*creates the start node first 
	*then adds in rest of the nodes 
	*the board is represented as a linked list
	*/
	public void createBoard() 
	{
		this.Node = new BoardNode(0);
		BoardNode nextNode=null;
		
		for ( int i =1 ; i<9; i++) 
		{
			if(i==1)
				nextNode = new BoardNode(i,this.Node);
			else
				nextNode = new BoardNode(i,nextNode);
		}
	}
	
	//constructors 
	Board()
	{
		this.createBoard();
		this.setPlayers(4); 
	}
	
	Board(int playerCount)
	{
		this.createBoard();
		this.setPlayers(playerCount); 
	}

	//gettes and setters
	public Player[] getPlayers() {
		return players;
	}

	//modifyed setter creates i number of players numbered 1-i+1
	public void setPlayers(int i) 
	{
		for(int j =0;j<i;j++ )
		{
			this.players[j] = new Player(j++,this.Node);
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
}
