//in version 2 pipenode and waterfall node are not used
public class PipeNode extends BoardNode
{
	private boolean isPipeMouth;
	private boolean isPipeExit;
	private PipeNode pipePartner;
	
	//constructoers
	PipeNode(int nodeNumber) 
	{
		super(nodeNumber);
		super.setFinish(false);
		super.setStart(false);
	}
	
	//getters and seters
	public boolean isPipeMouth() {
		return isPipeMouth;
	}
	public void setPipeMouth(boolean isPipeMouth) {
		this.isPipeMouth = isPipeMouth;
	}
	public boolean isPipeExit() {
		return isPipeExit;
	}
	public void setPipeExit(boolean isPipeExit) {
		this.isPipeExit = isPipeExit;
	}
	public PipeNode getPipePartner() {
		return pipePartner;
	}
	public void setPipePartner(PipeNode pipePartner) {
		this.pipePartner = pipePartner;
	}
}
