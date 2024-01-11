//Supplier class Contains supid,supName and array of itemsSUpplied.                                                                                                    I
//item class contains itemId,ItemName,itemCost.                                                               1Create 2 Item type arrays with size 5 and associate them with two Supplier objects2. Show item details supplied by each suppliItem class contains itemId,ItemName,itemCost.                                                               
//1Create 2 Item type arrays with size 5 and associate them with two 
//Supplier objects. 2. Show item details supplied by each supplier.                                                                                                                                                                   2. Show item details supplied by each supplier.*/

package com.array;

import java.util.Arrays;

public class Supplier {
	
	private int supid;
	private String supName;
	private Item items[];

	Supplier() {
		System.out.println("i m in default in Supplier");
	}

	Supplier(int supid, String supName, Item item[]) {
		this.supid = supid;
		this.supName = supName;
		this.items = item;
	}

	public int getSid() {
		return supid;
	}

	public void setSid(int supid) {
		this.supid = supid;
	}

	public String getSname() {
		return supName;
	}

	public void setSname(String supName) {
		this.supName = supName;
	}

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	

	@Override
	public String toString() {
		return "Supplier [supid=" + supid + ", supName=" + supName + ", items=" + Arrays.toString(items) + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item arr[] = new Item[5];
		arr[0] = new Item(1, "item 1", 1000);
		arr[1] = new Item(2, "item 2", 7000);
		arr[2] = new Item(3, "item 3", 600);
		arr[3] = new Item(4, "item 4", 1800);
		arr[4] = new Item(5, "item 5", 3000);

		Item arr1[] = new Item[5];
		arr1[0] = new Item(1, "item s", 1000);
		arr1[1] = new Item(2, "item p", 7000);
		arr1[2] = new Item(3, "item r", 600);
		arr1[3] = new Item(4, "item u", 1800);
		arr1[4] = new Item(5, "item v", 3000);

		Supplier s1 = new Supplier(1, "Rutu", arr);
		Supplier s2 = new Supplier(2, "Nitu", arr1);
		System.out.println(s1);        
		System.out.println(s2);
	}

}