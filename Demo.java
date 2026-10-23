public class Demo{

public static void main(String []args){

DeliveryDesk ds=new DeliveryDesk("Front Desk-1");
//System.out.println(ds.getName());

DeliveryRider d1=new DeliveryRider("ABC-554","Hamza","LHF-7176");
d1.displayInfo();

Customer c1=new Customer("TD-77","Hina","DHA-PHASE 2");
c1.displayInfo();

FoodOrder f1=new FoodOrder("XY-11",c1,"B-001",2060);
f1.displayOrder();

ds.addOrder(f1);
ds.addRider(d1);

System.out.println(ds.getName());
ds.displayDesk();

DeliveryRider d2=new DeliveryRider("GHF-384","Ashraf","BBR-8906");
FoodOrder f2=new FoodOrder("FT-12",c1,"B-002",5050);
FoodOrder f3=new FoodOrder("FS-13",c1,"B-003",3200);

ds.addOrder(f2);
ds.addOrder(f3);
ds.addRider(d2);

System.out.println(ds.getName());
ds.displayDesk();

} 

}