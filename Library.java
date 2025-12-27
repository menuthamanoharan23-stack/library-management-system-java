package LIBRAY;

public class Library {
	private String bookTitle;
	private String issuedDate;
	private String memberName;
	

	public Library(String bookTitle, String issuedDate, String memberName) {
		this.bookTitle=bookTitle;
		this.issuedDate=issuedDate;
		this.memberName=memberName;
	}
	
	//Getters
	public String getBookTitle() {
		return bookTitle;
	}
	
	public String getIssuedDate() {
		return issuedDate;
	}
	public String getMemberName() {
		return  memberName;
	}
	
	//Issue Book
	
	public void issueBook() {
		System.out.println("Issuing Book:" + bookTitle + "to" + memberName+"on"+bookTitle);
	}
	
	//Submit Book 
	public void submitBook() {
		System.out.println(memberName+"has returned the book:"+bookTitle);
	}
	
	//show library info
	public void showLibraryInfo() {
		System.out.println("Library Info:Member:" + memberName);
	}
	
}
	
		
		// TODO Auto-generated constructor stub
	


