package bus_Reserve;
import java.util.ArrayList;
import java.util.Scanner;
public class BusDemo {

	
	public static void main(String args[]) {
		
		ArrayList<Bookings> bookings=new ArrayList<Bookings>();
		
		Bus bus1=new Bus(1,1,true);
		Bus bus2=new Bus(2,5,true);
		Bus bus3=new Bus(3,2,false);
		
		
		Bus busess[]= {bus1,bus2,bus3};
		int userOpt=1;
		while(userOpt==1) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 1 for booking and 0 for exit");
			userOpt=sc.nextInt();
			if(userOpt==1) {
				Bookings booking=new Bookings();
				if(booking.isAvaliable(busess,bookings)) {
					bookings.add(booking);
					System.out.println("your seat has been booked ");
				}
				else {
					System.out.println("Oops the bus is full... Select other dates or bus");
				}
			}
		}
		
		
		
		
	//bus array
		
		
		
		
		
	
		
		
	}
}
