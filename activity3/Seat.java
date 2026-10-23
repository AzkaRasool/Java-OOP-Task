public class Seat{

private int seatNumber;
private boolean reserved;
	
	public Seat(int seatNumber){
	
	this.seatNumber=seatNumber;
	this.reserved=false;
}

	public boolean reserve(){

	if(reserved==false){
	reserved=true;
	return true;	
}
	else{
	return false;
}	
}

	public boolean isReserved(){
	 
	return reserved;
}

	public int getSeatNumber(){
	
	return seatNumber;
}

}