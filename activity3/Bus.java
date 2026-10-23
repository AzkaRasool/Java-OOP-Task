public class Bus{

private String busNumber;
private Seat[][] seats;

	public Bus(){
 	this("BUS-101",2);
 
}

	public Bus(String busNumber,int rows){
		this.busNumber=busNumber;

	seats=new Seat[rows][4];
 	 int num=1;
	for(int i=0;i<seats.length;i++){
		for(int j=0;j<seats[i].length;j++){
  	 seats[i][j]=new Seat(num++);
}

} 
 
}

public void displaySeats(){
	int count=1;
	for(int i=0;i<seats.length;i++){
	System.out.print("Row "+ count +":");
	count++;
	for(int j=0;j<seats[i].length;j++){
        // System.out.print(" "+seats[i][j].getSeatNumber()+" ");

	if(seats[i][j].isReserved()){
	System.out.printf("%02d:X",seats[i][j].getSeatNumber());
	System.out.print(" ");
	}
	if(!(seats[i][j].isReserved())){
	System.out.printf("%02d:0",seats[i][j].getSeatNumber());
	System.out.print(" ");
	}
  	if(j==1){
	System.out.print("||");
}
}
    
  	 System.out.println();
} 
 

}

	public void reserveSeat(int seatNumber){

	for(int i=0;i<seats.length;i++){
 		for(int j=0;j<seats[i].length;j++){
	if((seats[i][j].getSeatNumber())==seatNumber){
		if(seats[i][j].reserve()){
	System.out.println("Reserving seat "+seatNumber +" : Successfull");
}
	else{	
	System.out.println("Reserving seat "+seatNumber +" : Already Reserved");
}
	return;	
}
}
}
}


public int countAvailableSeats(){

int count=0;

for(int i=0;i<seats.length;i++){
 
for(int j=0;j<seats[i].length;j++){
      if((seats[i][j].isReserved())==false){
	++count;
}
}
	
}
	return count;
} 

}
