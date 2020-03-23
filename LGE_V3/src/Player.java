import java.util.ArrayList;

public class Player 
{
	private int id;
	private BoardNode[] Board;
	private int boardPosition;
	private ArrayList<Plant> inverntory;
	private boolean isAtFinal;
	
	public boolean isAtFianl() 
	{
		if(this.Board.length>=this.boardPosition)
			this.isAtFinal=true;
			
			return this.isAtFinal;
	}
	
	/*
	 * This function move(int) 
	 *
	 * 
	 * */
	public void move(int numSpaces) 
	{
		this.Board[this.boardPosition].remove(this.id);
		
		if(this.boardPosition + numSpaces > this.Board.length) 
		{
			this.boardPosition = this.Board.length-1;
		}
		else
		{
			this.boardPosition += numSpaces;
		}
		
		this.Board[this.boardPosition].add(this.id;)
	}
	
	//constructors
	Player(int id, BoardNode[] board2)
	{
		this.setId(id);
		this.setInverntory(new ArrayList<Plant>());
		this.setBoard(board2);
		this.setIsAtFinal(false);		
	}

//	public Player(int id2, BoardNode boardNode) {
//		// TODO Auto-generated constructor stub
//		this.setId(id);
//		this.setInverntory(new ArrayList<Plant>());
//		this.setBoard(boardNode);
//		this.setIsAtFinal(false);	
//	}

	//getters and setters
	public BoardNode[] getBoard() {
		return Board;
	}

	public void setBoard(BoardNode[] board2) {
		this.Board = board2;
	}

	public int getboardPosition() {
		return boardPosition;
	}

	public void setboardPosition(int boardPosition) {
		this.boardPosition = boardPosition;
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
