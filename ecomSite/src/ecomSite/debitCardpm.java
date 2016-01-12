package ecomSite;

public class debitCardpm implements paymentMethod {

	
	

	@Override
	public void pay(int itemCost) {
		System.out.println("you paid through debit card");
			}

	@Override
	public void makePayment(Item i) {
		// TODO Auto-generated method stub
		
	}

}
