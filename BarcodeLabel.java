public class BarcodeLabel{

private String barcodeNumber;
private String shelfCode;

public BarcodeLabel(String barcodeNumber,String shelfCode){

this.barcodeNumber=barcodeNumber;
this.shelfCode=shelfCode;

}

public void displayInfo(){

 System.out.println("BarcodeNumber :"+ this.barcodeNumber);

 System.out.println("Shelfcode :"+ this.shelfCode);
}

}