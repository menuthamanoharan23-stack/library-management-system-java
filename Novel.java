package LIBRAY;

public class Novel extends Book {
	private String genre;
	

	public Novel(String title,String author, String isbn, boolean isAvailable, String genre) {
		super(title,author,isbn,isAvailable);
		this.genre=genre;
		// TODO Auto-generated constructor stub
	}
	
	public String getGenre() {
		return genre;
	}
	
	@Override
	public double calculateFine(int daysLate) {
		return daysLate;
	}
	
	@Override 
	public void showDetails() {
				System.out.println("Novel-Title:"+ " , Author:" + author+", Available:" +isAvailable);
				System.out.println("Genre:" +genre);
	}

}
