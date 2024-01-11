package com.array;

public class Item {

	private int itemId;
	private String itemName;
	private double itemCost;

	public Item() {

	}

	public Item(int itemId, String itemName, double itemCost) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemCost = itemCost;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemCost() {
		return itemCost;
	}

	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}
//	public void showItemNames() 
//	{
//		Item[] items;
//		for (Item item : items) {
//            if (item.getItemCost() > 2000) {
//            
//            }
//                System.out.println("Item Name: " + item.getItemName());
//            
//	}
//		}

	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemCost=" + itemCost + "]";
	}
//	public void increasePriceBy200(Item items[]) {
//		if (itemCost < 1000) {
//            itemCost += 200;
//        }
//    }

}
