package bus_Reserve;

public class Bus {
 int busNo;
 int capacity;
 boolean ac;
	
 Bus(int busNo,int capacity,boolean ac){
	 this.busNo=busNo;
	 this.capacity=capacity;
	 this.ac=ac;
 }
 
 public void displayInfo() {
	 System.out.println("busno "+busNo+" capacity "+capacity+" ac "+ac);
 }
	
}
