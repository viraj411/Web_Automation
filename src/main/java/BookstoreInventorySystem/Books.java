package BookstoreInventorySystem;

public class Books {

    private String title;
    private String author ;
    private int stockquantity;

    public Books (String title,String author,int stockquantity){
        this.title=title;
        this.author=author;
        this.stockquantity=stockquantity;
    }

      public void displayBookDetails(){

          System.out.println("Book Title:" + title + "Author :" + author + " Book Quantity:" + stockquantity);

      }

      public int updatestock(int quantity){

        stockquantity = stockquantity+quantity;
        return stockquantity;
      }

}
/*Book Class:

Fields: title, author, price, stockQuantity (private fields).
Methods:
displayDetails() – Displays the details of the book.
updateStock(int quantity) – Updates the stock of the book.
Main Class:

Create Book objects and manage the inventory (add books, update stock, display details).*/