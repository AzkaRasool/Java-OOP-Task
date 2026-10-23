public class LibrarySection{

private String sectionName;
private LibraryItem [] items;
private int count;

public LibrarySection(String sectionName){

	this.sectionName=sectionName;
	items=new LibraryItem[4];
	count=0;	
}

public void addItem(LibraryItem items){
    if (items!=null){	
	this.items[count++]=items;
}
   if(count>=this.items.length){
	System.out.println("Section Full");
}

}

public void displayItems(){
 for(int i=0;i<count;i++){
  items[i].displayInfo();
System.out.println();
  
}

}

public String getName(){ return sectionName;

}

}