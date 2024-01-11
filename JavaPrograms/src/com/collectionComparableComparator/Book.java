package com.collectionComparableComparator;

public class Book {
	int bookId;
	String bookAuthor;
	String bookName;
	int price;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Book() {

	}

	public Book(int bookId,  String bookAuthor,String bookName,  int price) {
		super();
		this.bookId = bookId;
		this.bookAuthor = bookAuthor;
	    this.bookName = bookName;
		this.price = price;
	}

	

	

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookAuthor=" + bookAuthor + ", bookName=" + bookName + ", price=" + price
				+ "]";
	}

	public static void main(String[] args) {
		

	}

}
