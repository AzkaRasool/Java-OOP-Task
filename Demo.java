public class Demo{

public static void main(String args[]){

LibrarySection ls=new LibrarySection("Computing Section");

Book b1=new Book("x","AB-01","League","121212","A-34");
Book b2=new Book("y","AB-02","Heros","13131313","B-52");

b1.displayInfo();

Magazine m1=new Magazine(876,"BC-09","Dailycuts","454545","C-53");

b2.displayInfo();
m1.displayInfo();

ls.addItem(b1);
ls.addItem(b2);
ls.addItem(m1);

System.out.println(ls.getName());
//ls.displayItems();

Book b3=new Book("XYZ","AB-03","Tragic","141414","C-67");
Book b4=new Book("Unknown","AB-04","Magic","15151515","D-75");

ls.addItem(b3);
ls.displayItems();

//ls.addItem(b4);

}

}