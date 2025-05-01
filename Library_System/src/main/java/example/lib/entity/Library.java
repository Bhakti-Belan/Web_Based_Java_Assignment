package example.lib.entity;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private int id;
	private List<Book> books;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public Library(int id, List<Book> books) {
		super();
		this.id = id;
		this.books = books;
	}
	public Library() {
		List<Book> books=new ArrayList<Book>();
	}
	@Override
	public String toString() {
		return "Library [id=" + id + ", books=" + books + "]";
	}
	public void print()
	{
		System.out.println("Library With ID "+id+" Has Following Books Available "+books);
	}

}
