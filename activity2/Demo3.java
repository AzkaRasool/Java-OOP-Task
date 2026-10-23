public class Demo3{

	public static void main(String args[]){
	
	
	Circle c=new Circle();
	c.radius=-5;

double Area=c.area(c.radius);
double Circumference=c.circumference(c.radius);
        System.out.println(Area);
        System.out.println(Circumference);
	System.out.println(c.radius);

}



}