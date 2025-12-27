package LIBRAY;

public class Main {
     
	public static void main(String[] args) {
		
		System.out.println("===========Library Management System===========");
		
		//Encapsulation Example
		Library lib =new Library("Java Programming ","John Doe", "25.11.2025");
		lib.showLibraryInfo();
		System.out.println();
		
		System.out.println("=========Book Details=========");
		
		System.out.println();
		//Inheritance and  polymorphism Example
		Book textbook= new Textbook("Java programming ", "John Doe", "12345",true,"Computer");
		textbook.showDetails();
		System.out.println("Fine for 5 days Late:$"+textbook.calculateFine(5));
		
		System.out.println();
		
		Book novel= new Novel("Pride and Prejuidice", "June Auster", "67890",true,"Romance");
		novel.showDetails();
		System.out.println("Fine for 5 days Late:$"+novel.calculateFine(5));
		
		System.out.println();
		
		System.out.println("============Book Operations");
		
		System.out.println();
		System.out.println("Borrowing"+textbook.title+"--------");
		textbook.borrowBook();
		System.out.println(textbook.title+"is now Available:"+ textbook.isAvailable);
		
		System.out.println();
		System.out.println("Returning"+textbook.title+"--------");
		textbook.returnBook();
		System.out.println(textbook.title+"is now Available:"+ textbook.isAvailable);
		
		
		

	}

}
