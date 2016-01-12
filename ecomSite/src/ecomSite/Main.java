package ecomSite;

public class Main {

	
	public static void main(String args[])
	{
		 Item i= new Item("abc",20000);
		ecomSitepay e=new ecomSitepay();
		e.choosePayment("cc");
		e.makePayment(i.getItemCost());	
	}
	
	
}
