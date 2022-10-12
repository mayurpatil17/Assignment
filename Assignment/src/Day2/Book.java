package Day2;

public class Book {

	
		private String Book_Title;
		private int Book_Price;
		public String getBook_Title() {
			return Book_Title;
		}
		public void setBook_Title(String Title) {
			this.Book_Title = Title;
		}
		public int getBook_Price() {
			return Book_Price;
		}
		public void setBook_Price(int Price) {
			this.Book_Price = Price;
		}
		public void createBook(String Title, int Price) {
			Book_Title = Title;
			Book_Price= Price;
			
		}
		
		public void showBook() {
			System.out.println("Book name is:"+getBook_Title());
			System.out.println("Book price is:"+getBook_Price());
		}
		
		
}
