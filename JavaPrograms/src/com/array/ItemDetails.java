package com.array;

public class ItemDetails {

//	private Item[] items;
//
//	public ItemDetails(int size) {
//		items = new Item[size];
	//}

	public static void showItemsWithCostMoreThan2000(Item items[]) {

		for(int i =0; i<items.length;i++)
		{
			if (items[i].getItemCost() > 2000) 
			{
				System.out.println("Item Name: " + items[i].getItemName());
			}
		}
		
	}
	
	public static void showItemsWithHigherCost(Item items[]) 
	{
		 Item higherCostItem = items[0];
		for(Item item : items) 
		{
			if(item.getItemCost()>higherCostItem.getItemCost()) 
			{
				higherCostItem = item;
			}
		}
		 System.out.println(higherCostItem);
	}
	
	public static  double calculateAveragePrice(Item items[]) 
	{
		double totalCost = 0;
        for (Item item : items) {
            totalCost =  totalCost+item.getItemCost();
//            System.out.println(" Average Price of All Items: Rs. " + calculateAveragePrice());
        }
		return totalCost/items.length;
		
	}
	public static void showAveragePrice(Item items[]) {
		 System.out.println("\n4. Average Price of All Items: Rs. " + calculateAveragePrice(items));
	}
	 public static void add200Rs(Item items[]) {
//	        for (Item item : items) {
//	            if(items[Item].itemCost<1000) 
//	            {
//	            items[Item].itemCost=items[Item].itemCost+200;
//	            }
//	        }
		 for(int i=0; i<items.length; i++) 
		 {
			 if(items[i].getItemCost()<1000) 
			 {
				 double itemscost=items[i].getItemCost()+200;
				 items[i].setItemCost(itemscost);
			 }
		 }
	 }
	 
	
	@Override
	public String toString() {
		return "ItemDetails []";
	}

	public static void main(String[] args) {
		Item[] item = new Item[5];
		item[0] = new Item(1, "Item1", 500);
		item[1] = new Item(2, "Item2", 1500);
		item[2] = new Item(3, "Item3", 2500);
		item[3] = new Item(4, "Item4", 800);
		item[4] = new Item(5, "Item5", 1200);
		
//	showItemsWithCostMoreThan2000(item);
//		calculateAveragePrice(item);
//		showAveragePrice(item);
		showItemsWithHigherCost(item);
		add200Rs(item);
		
	for(int i=0;i<item.length;i++)
		{
			System.out.println(item[i]);
		}
		
		//System.out.println(items[3].getItemCost());
		
		
	}

}
