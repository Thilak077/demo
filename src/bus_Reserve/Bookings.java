package bus_Reserve;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Bookings {
	int busNo;
	int howManySeats;
	Date date;
	String name;
	
	Bookings(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the bus Number ");
		busNo=sc.nextInt();
		System.out.println("how many seats do you want ");
		howManySeats=sc.nextInt();

		System.out.println("enter your name ");
		name=sc.next();
		System.out.println("enter the date in dd-mm-yy");
		String SDate=sc.next();
		SimpleDateFormat Cdate=new SimpleDateFormat("dd-MM-yy");
		try {
			date=Cdate.parse(SDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

		
		public boolean isAvaliable(Bus busess[],ArrayList <Bookings>bookings) {
			int capacity=0;
			for(Bus bus:busess) {
				if(bus.busNo==busNo) {
					capacity=bus.busNo;
				}
			}
			int booked=0;
			for(Bookings b:bookings) {
				if(b.busNo==busNo&& b.date==date) {
					booked++;
				}
			}
			
			return booked<capacity?true:false;
		}


		
	

	
}
