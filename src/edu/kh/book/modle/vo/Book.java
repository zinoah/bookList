package edu.kh.book.modle.vo;

public class Book {

	// 필드
	
	private int bookNum; // 도서등록번호
	private String bookName; // 책이름
	private String author; // 작가
	private int price; // 가격
	private String publisher; // 출판사
	
	// 생성자
	
	public Book() {}

	public Book(int bookNum, String bookName, String author, int price, String publisher) {
		super();
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}

	
	
	// 메소드
	
	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	@Override
	public String toString() {
		return bookName + "    " + author + "    " + price + "원" + "   " + publisher;
	}
	
	
	
}
