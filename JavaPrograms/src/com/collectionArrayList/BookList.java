package com.collectionArrayList;

import java.util.ArrayList;

public class BookList {
	Book b;

	public BookList(Book b) {

		this.b = b;
	}

	public static void main(String[] args) {
		ArrayList<Book> obj = new ArrayList<Book>();
		obj.add(new Book(1, "Chetan Bhagat", "One Indian Girl", 200));
		obj.add(new Book(2, "Amitav Ghosh", "Circle of Silence", 650));
		obj.add(new Book(3, "Chetan Bhagat", "Half Girlfriend", 350));
		obj.add(new Book(4, "Balwant Gargi", "Naked Triangle", 400));
		obj.add(new Book(5, "Chetan Bhagat", "Revolution 2020", 320));

		int count = 0;
		for (int i = 0; i < obj.size(); i++) {
			count = 0;
			for (int j = 0; j < obj.size(); j++) {
				if (obj.get(i).bookAuthor.equals(obj.get(j).bookAuthor) && j < i)
					break;
				else if(obj.get(i).bookAuthor.equals(obj.get(j).bookAuthor))
				count++;
			}
				if(count>0)
				System.out.println(obj.get(i).bookAuthor+ "=" + count);

			}

		}
	}


