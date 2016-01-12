package ecomSite;

public class ecomSitepay {

	paymentMethod pm=null;	
	
	public void choosePayment(String methodOfPayment)
	{
		if(methodOfPayment=="cc")
		{
			 pm=new creditCardpm();
			 
	       	
		}
		else if(methodOfPayment=="dc")
		{
			pm=new debitCardpm();
		}
		else if(methodOfPayment=="cash")
		{
			pm=new debitCardpm();
		}
		else if(methodOfPayment=="net banking")
		{
			pm=new netBankingpm();
		}	
	}

	public void makePayment(int itemCost) {
		
		pm.pay(itemCost);
	}
	
	
	
	
}
