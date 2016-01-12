package ecomSite;

public class Item {

	public Item(String itemName, int itemCost) {
		super();
		this.itemName = itemName;
		this.itemCost = itemCost;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemCost() {
		return itemCost;
	}
	public void setItemCost(int itemCost) {
		this.itemCost = itemCost;
	}
	String itemName;
	int itemCost;
	
	
}
