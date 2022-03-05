package com.composite;
public class Book {
  Pages pages;

public Pages getPages() {
	return pages;
}

public void setPages(Pages pages) {
	this.pages = pages;
}
public static void main(String[] args) {
	Book b=new Book();
	Pages p=b.new Pages();
	p.setPages(700);
	b.setPages(p);
	System.out.println(b.getPages().getPages());
}
  class Pages{
	  private int pages;

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
  }
}
