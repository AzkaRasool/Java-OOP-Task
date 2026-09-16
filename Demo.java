public class Demo{

public static void main(String args[]){

Rectangle r1=new Rectangle();
r1.length=3;
r1.width=8;

Rectangle r2=new Rectangle();
r2.length=97;
r2.width=3;

double area=r1.calArea();

double result=r2.calArea();

System.out.println("Area of r2!!!!:"+result);
System.out.println("@@@@Area of r1:"+area);

}

}