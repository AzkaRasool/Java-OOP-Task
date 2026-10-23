public class Book extends LibraryItem{

 private String author;

	public Book(String author,String itemId,String title,String barcodeNumber,String shelfCode){
	super(itemId,title,barcodeNumber,shelfCode);
	this.author=author;
}

 public void displayInfo(){
	super.displayInfo();
     System.out.println("Author : "+ author);
      System.out.println();

}



}