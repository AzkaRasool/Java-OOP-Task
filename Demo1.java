public class Demo1{
	public static void main(String args[]){

	Cart c=new Cart();
	
        c.addItem(120);
	System.out.println(c.getTotal());
	c.addItem(50,3);

	System.out.println(c.getTotal());

	//Task 3
        
       c.addItem(-10);
	System.out.print(c.getTotal());
	c.addItem(10,0);

	System.out.println(c.getTotal());

	//task 4

       c.addItem(10.0);

       System.out.println(c.getTotal());

}

}