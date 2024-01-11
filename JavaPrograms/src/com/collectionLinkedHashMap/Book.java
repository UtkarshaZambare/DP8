package com.collectionLinkedHashMap;

public class Book {

	int bookid;
	String bookName;
	int price;

	public Book(int bookid, String bookName, int price) {
		super();
		this.bookid = bookid;
		this.bookName = bookName;
		this.price = price;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "bookid=" + bookid + ", bookName=" + bookName + ", price=" + price + " ";
	}

}
