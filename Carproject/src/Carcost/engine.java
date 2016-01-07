package Carcost;

public class engine 
{
	private pistol p; 
	private carborator cb;
    int engineCost;

	public int getEngineCost() {
	return engineCost;
}
public void setEngineCost(int engineCost) {
	this.engineCost = engineCost;
}
	public engine(pistol p, carborator cb) {
		super();
		this.p = p;
		this.cb = cb;
	}
	//calculating cost of subsys
	public int getTotalSubCost()
	{
		return p.getCost()+cb.getCost();
	}

}
