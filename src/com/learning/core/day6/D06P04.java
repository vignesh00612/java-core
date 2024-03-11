package com.learning.core.day6;

import java.util.*;

import java.util.HashMap;
import java.util.TreeSet;

class Book1 implements Comparable<Book1> {

	int bookid;
	String title;
	double price;
	String dateof;
	String author;

	public Book1(int bookid, String title, double price, String dateof, String author) {
		this.bookid = bookid;
		this.title = title;
		this.price = price;
		this.dateof = dateof;
		this.author = author;

	}

	@Override
	public int compareTo(Book1 o) {
		return this.author.compareTo(o.author);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int res = bookid * 31;
		return res;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Book1 b = (Book1) obj;
		return title.equals(b.title);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bookid + "    " + title + "   " + price + "    " + author + "     " + dateof;
	}

}

public class D06P04 {
	public static void main(String[] args) {
		TreeSet<Book1> b = new TreeSet<>();

		b.add(new Book1(1001, "Python Learning", 200.0, "2/2/2020", "Brown"));
		b.add(new Book1(1002, "Modern Mainframes", 150.0, "19/5/1997", "David"));
		b.add(new Book1(1003, "Java Programming", 230.0, "23/11/1984", "A.Gilad Bracha"));
		b.add(new Book1(1004, "Read C++", 295.0, "19/11/1984", "Henry Harvin"));
		b.add(new Book1(1005, ".Net Platform", 349.7, "6/3/1984", "Mark J. Price"));

		for (Book1 bk : b) {
			System.out.println(bk.toString());
		}
	}
}
