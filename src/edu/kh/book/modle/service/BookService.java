package edu.kh.book.modle.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import edu.kh.book.modle.vo.Book;


public class BookService {

	
	Scanner sc = new Scanner(System.in);
	
	private List<Book> bookList = new ArrayList<Book>(); 
	private List<Book> favList = new ArrayList<Book>();

	
	// 메인메뉴
	public void displayMenu() {
		
	int input = 0;
	
	do {
		
		System.out.println("======== 도서 목록 프로그램 ========");
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 목록 조회");
		System.out.println("3. 도서 정보 수정");
		System.out.println("4. 도서 목록 삭제");
		System.out.println("5. 즐겨찾기 추가");
		System.out.println("6. 즐겨찾기 삭제");
		
		System.out.print("메뉴 번호 입력 >>");
		
		try {
			input = sc.nextInt();
			sc.nextLine();
			
			switch(input) {
			
			case 1: System.out.println(addBook()); break;
			case 2: searchBook(); break;
			case 3: System.out.println(updateBook()); break;
			case 4: System.out.println(removeBook());break;
			case 5: System.out.println(addFavorit()); break;
			case 6: removeFavorit(); break;
			case 0: System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("번호를 잘못 입력 하셨습니다.");
			}
		}catch(InputMismatchException e) {
			System.out.println("error : 잘못 입력 하셨습니다.");
			sc.nextLine();
			input = -1;
		}
		
	}while(input != 0);
	
	}
	
	// 책 등록 
	
	public String addBook() throws InputMismatchException{
		
		System.out.println("======== 도서 등록 ========");
		
		System.out.print("도서등록번호: ");
		int bookNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("책 제목: ");
		String bookName = sc.nextLine();
		
		System.out.print("작가: ");
		String author = sc.nextLine();
		
		System.out.print("가격: ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("출판사: ");
		String publisher = sc.nextLine();
		
		if(bookList.add(new Book(bookNum, bookName, author, price, publisher))){
			return "등록 완료되었습니다.";
		}else {
			return "등록에 실패하였습니다.";
		}
		
	}
	
	
	// 조회
	public void searchBook() {
		
		System.out.println("======== 도서 목록 조회 ========");
		
		if(bookList.isEmpty()) {
			System.out.println("등록된 도서가 없습니다.");
		}

		for(Book bk : bookList) {
			
			System.out.println(bk.toString());
			
		}
		
		
	}
	
	// 수정
	public String updateBook() throws InputMismatchException{
		
		System.out.println("======== 도서 정보 수정 ========");
		
		System.out.print("수정하실 인데스 번호를 입력하세요: ");
		int index = sc.nextInt();
		sc.nextLine();
		
		if(bookList.isEmpty()) {
			
			return "도서를 먼저 등록해 주세요";
			
		
		}else if (index < 0) {
		
			return "0 이상의 숫자를 입력해주세요.";
			
		}else if (index >= bookList.size()){
			
			return "등록된 도서가" + index + "권 보다 적습니다.";
			
			
		}else {
			
			System.out.println("*** 현재 인덱스에 등록된 도서정보 ***");
			System.out.println(bookList.get(index));
			
			System.out.print("도서등록번호: ");
			int bookNum = sc.nextInt();
			sc.nextLine();
			
			System.out.print("책 이름 :");
		    String bookName = sc.nextLine();
		    
		    System.out.print("작가: ");
		    String author = sc.nextLine();
		    
		    System.out.print("가격: ");
		    int price = sc.nextInt();
		    sc.nextLine();
		    
		    System.out.print("출판사: ");
		    String publisher = sc.nextLine();
		    
		    Book book = bookList.set(index, new Book(bookNum, bookName, author, price, publisher));
		    return  book.getBookName() + "의 정보가 변경되었습니다.";
		    
		}
		
		
	}
	
	// 삭제 
	public String removeBook() throws InputMismatchException{
		
		System.out.println("======== 도서 목록 삭제 ========");
		
		System.out.print("삭제하실 인덱스 번호를 입력하세요: ");
		int index = sc.nextInt();
		sc.nextLine();
		
		
		if(bookList.isEmpty()) {
			
			return "도서를 먼저 등록해 주세요";
			
		}else if (index >= bookList.size()){
			
			return "등록된 도서가 적습니다. 더 낮은 값을 입력해 주세요.";
			
		}else if (index < 0) {
			
			return "0 이상의 숫자를 입력해주세요.";
			
		}else {
			
			System.out.println("삭제 하시겠습니까? (Y/N) :");
			char anser = sc.next().toUpperCase().charAt(0);
			
			if(anser == 'Y') {
				Book book = bookList.remove(index);
				return book.getBookName() + "의 도서 목록이 삭제되었습니다.";
				
			}else {
				
				return "취소 되었습니다.";
				
			}
			
		}
		
		
	}
	
	
	// 즐겨찾기 추가
	public String addFavorit() {
		
		
		
	return "";
	
 }
		
	
	
	
	
	
	// 즐겨찾기 취소
	public void removeFavorit() {
		
	}
}







