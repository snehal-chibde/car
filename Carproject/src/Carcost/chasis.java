package Carcost;

public class chasis {
	
private dashboard db;
private bumper bp;
public chasis(dashboard db, bumper bp) {
	super();
	this.db = db;
	this.bp = bp;
}	

public int getTotalSubCost()
{
	return db.getCost()+bp.getCost();
}



}
