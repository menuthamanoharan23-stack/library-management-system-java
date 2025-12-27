package LIBRAY;

public abstract class Book {
	protected String title;
	protected String author;
	protected String isbn;
	protected boolean isAvailable;
	

	public Book(String title,String author, String isbn, boolean isAvailable) {
		this.title=title;
		this.author=author;
		this.isbn=isbn;
		this.isAvailable=isAvailable;
		// TODO Auto-generated constructor stub
	}
	//abstract method
	public abstract double calculateFine(int daysLate);
	
	//Show Details
	public void showDetails() {
		System.out.println("Title:"+ title +",Author"+author +", IsAvailable " +isAvailable);
	}
	 
	//Borrow Book
	public void borrowBook() {
		if(isAvailable) {
			isAvailable=false;
			System.out.println("Book Borrowed Successfully!");
		}else {
			System.out.println("Sorry! Book is not available");
		}
	}

	//Return Book 
	public void returnBook() {
		isAvailable=true;
		System.out.println("Book returned Successfully");
	}
	}

