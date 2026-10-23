public class Magazine extends LibraryItem{

private int issueNumber;

 public Magazine(int issueNumber,String itemId,String title,String barcodeNumber,String shelfCode){
	super(itemId,title,barcodeNumber,shelfCode);
	this.issueNumber=issueNumber;

}

public void displayInfo(){
	super.displayInfo();
  System.out.println("IssueNO : "+issueNumber);
   System.out.println();
}



}