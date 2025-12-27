package LIBRAY;

public class Textbook extends Book {
	private String subject;
	
	public Textbook(String title, String author, String isbn, boolean isAvailable,String subject) {
		super(title,author,isbn,isAvailable);
		this.subject=subject;
		}
	public String getSubject() {
		return subject;
	}
	
	@Override 
	public double calculateFine(int daysLate) {
		return daysLate*2.0;
	}
	
	@Override 
	public void showDetails() {
			System.out.println("TextBook-Title:"+ title + ",Author:"+author + ", Available:" +isAvailable);
			System.out.println("Subject:"+ subject);
	}

}
