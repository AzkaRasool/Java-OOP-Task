public class DeliveryDesk{

private String deskName;
private FoodOrder orders[];
private DeliveryRider riders [];
int count=0;
int index=0;

public DeliveryDesk(String deskName){

this.deskName=deskName;
orders=new FoodOrder[3];
riders=new DeliveryRider[2];

}

public void addOrder(FoodOrder order){

if(order!=null){
	orders[count++]=order;
	
}

if(count>=orders.length){
 System.out.println("Orders capacity Full");
}

}

public void addRider(DeliveryRider rider){

if(rider!=null){
	riders[index++]=rider;

}
if(index>=riders.length){
	System.out.println("All Riders are packed with orders ");
}
}

public String getName(){
	return deskName;
}

public void displayDesk(){
   System.out.println("----Delivery Desk----");
  for(int i=0;i<count;i++){
	orders[i].displayOrder();
}
  for(int i=0;i<index;i++){
	riders[i].displayInfo();
}


		
}
}