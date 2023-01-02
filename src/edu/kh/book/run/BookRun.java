package edu.kh.book.run;

import edu.kh.book.modle.service.BookService;

public class BookRun {

	public static void main(String[] args) {
		
		BookService bookservice = new BookService();
		
		
		bookservice.displayMenu();
	}

}
