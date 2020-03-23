
public class WaterFallNode extends BoardNode
{
	private boolean isWaterFallMouth;
	private boolean isWaterFallExit;
	private WaterFallNode waterFallPartner;
	
	//constructors	
	WaterFallNode(int nodeNumber) 
	{
		super(nodeNumber);
		super.setFinish(false);
		super.setStart(false);
	}
	
	//getters and setters 
	public boolean isWaterFallMouth() {
		return isWaterFallMouth;
	}
	public void setWaterFallMouth(boolean isWaterFallMouth) {
		this.isWaterFallMouth = isWaterFallMouth;
	}
	public boolean isWaterFallExit() {
		return isWaterFallExit;
	}
	public void setWaterFallExit(boolean isWaterFallExit) {
		this.isWaterFallExit = isWaterFallExit;
	}
	public WaterFallNode getPartner() {
		return waterFallPartner;
	}
	public void setPartner(WaterFallNode partner) {
		this.waterFallPartner = partner;
	}
}
