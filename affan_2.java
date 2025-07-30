

	package affan;

class Book{
	String author;
	String title;
	 double price;
	 int quantity;
	 double total;
	
	Book( String title,String author , double price , int quantity ){
		this.title = title;
		this.author = author;
		this.price= price;
		this.quantity = quantity;
}
public double calculateTotal() {
	return (price*quantity);
}
public void displayDetails() {
	System.out.println("Title:"+ title);
	System.out.println("Author:"+ author);
	System.out.println("Price:"+ price);
	System.out.println("Quantity:"+ quantity);
	System.out.println("Total Value:"+ calculateTotal() );
}
}
public class affan_2 {
	public static void main(String[]args) {
		Book book1=new Book("To Kill a Mockingbird", "Harper Lee", 14.99, 100);
		Book book2=new Book("1984", "George Orwell", 12.99, 150);
		book1.displayDetails();
		book2.displayDetails();
		
	}



}





