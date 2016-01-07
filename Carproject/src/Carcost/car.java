package Carcost;

public class car 

{
		int	TotalCost;
		private engine e;
		private chasis c;

		public car( engine e, chasis c) {
			super();
			this.e = e;
			this.c = c;
		}

		public car(int totalCost) {
			super();
			TotalCost = totalCost;
		}

		public int getcarCost() 
		{
			return e.getTotalSubCost()+c.getTotalSubCost();
	
		}

}
