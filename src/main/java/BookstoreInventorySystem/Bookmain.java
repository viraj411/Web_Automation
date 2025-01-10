package BookstoreInventorySystem;

public class Bookmain  {
    public static void main(String[] args) {
        Books b1= new Books("Stanger Things","Viraj Abhang",45);
        b1.displayBookDetails();
        b1.updatestock(23);
        b1.displayBookDetails();

    }





}
