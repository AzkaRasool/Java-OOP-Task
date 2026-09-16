public class Student{

  int id;
  String name;
  int completedCredits;

public void addCredits(int amount){
    this.completedCredits+=amount;
}

public void printSummary(){

System.out.println("ID:"+id);
System.out.println("Name:"+name);
System.out.println("Credits:"+completedCredits);



 public void rename(String name){
   this.name=name;
}



}