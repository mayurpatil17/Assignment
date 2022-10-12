package Day2;

public class BookInfo {

	public static void main(String[] args) {
		Book b = new Book();
		b.createBook("selenium", 500);
		b.showBook();
		b.setBook_Price(700);
		b.showBook();
		b.createBook("Manual", 100);
		b.showBook();
		

	}

}
