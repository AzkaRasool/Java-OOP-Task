public class Demo{

	public static void main(String args[]){

 	Student s1=new Student();
	Student s2=new Student();
	s1.id=89;
 	s1.name="Azka";
 	s1.completedCredits=7;

	s1.printSummary();

        s2.id=63;
 	s2.name="Hiba";
 	s2.completedCredits=3;

	s2.printSummary();
        
	s1.addCredits(8);
        s1.printSummary();

        Student a=new Student();
	a.name="ali";
	Student b=a;
	b.name="sara";
	Student c=new Student();
	c.name=a.name;

      a.printSummary();
      b.printSummary();
      c.printSummary();

	

	s1.rename("laiba");
        s1.printSummary();
}
}