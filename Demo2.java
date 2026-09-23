public class Demo2{

	static void increaseNumber(int n) {
	 n += 3; 
}
	static void updateObject(LabProgress p) {
	 p.completeOne();
 }
	static void replaceLocal(LabProgress p) {
    	p = new LabProgress();
    	p.completeOne();
}



public static void main(String args[]){

	LabProgress p=new LabProgress();

	int n=4;
	
        System.out.println(n);

	increaseNumber(n);
	System.out.println(p.getCompletedLabs()); 

	updateObject(progress);
	System.out.println(p.getCompletedLabs());

	replaceLocal(progress);
	System.out.println(p.getCompletedLabs()) ;


	

}


}