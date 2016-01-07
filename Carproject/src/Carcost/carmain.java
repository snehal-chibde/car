package Carcost;

public class carmain {
	public static void main(String args[])
	{
		
		
		
		
		carborator carbCost= new carborator(3000);
		pistol pistolCost=new pistol(2000); 
		
		dashboard dashbCost=new dashboard(15000);
		bumper bumperCost=new bumper(20000);
		
		
		engine e =new engine(pistolCost,carbCost); 
		chasis cs=new chasis(dashbCost,bumperCost);
		
 		car myCar= new car(e,cs);
 		System.out.println("the car cost is : ");	
		System.out.print(myCar.getcarCost());	
	
	}

}
