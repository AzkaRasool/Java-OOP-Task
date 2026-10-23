public class DeliveryRider extends Person{

private String vehicleNumber;

public DeliveryRider(String personId,String name,String vehicleNumber){
super(personId,name);
this.vehicleNumber=vehicleNumber;


}

public void displayInfo(){
super.displayInfo();

System.out.println("VehicleNumber : "+vehicleNumber);
System.out.println();

}

}