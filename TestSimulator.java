import java.util.Random; 
public class TestSimulator
{
	public static void main(String[] args) 
	{	// number of hours
		int hours = Integer.parseInt (args[0]);
		int time = 0;

		int factoruse = factorSet(hours);
		int i = 1;
		int totalSales = 0;
		int totaLGuest = 0;

		while (i<factoruse) 
		{
			Random rnd = new Random();
			Random reject = new Random();
			int intReject = reject.nextInt(5);
			time = 5 * i + rnd.nextInt(5);
			Restaurant classiq = new Restaurant();

			if (!(intReject==0))
			{
				System.out.println("--> "+ "Entered at: " + (time -5) + "mins "
				+ classiq.newBill.cus.name  + "   "
				+ classiq.newBill.cus.lname 
				+ "  " + classiq.newBill.cus.numberOfFriends + " Guests" 
				+ " " + classiq.newBill.menu.menu_name + " " 
				+ classiq.newBill.menu.price + "GHS" + " " 
				+ time + "mins");
				System.out.println("");// Todo: Add a method to convert a given minutes to hours and minute
								//It will return the time as a string
				totaLGuest = totaLGuest + classiq.newBill.cus.numberOfFriends;
				totalSales = totalSales +  classiq.newBill.menu.price;
			}
			else
			{
				System.out.println("--> "+ "Entered at: " + (time -1) + "mins"
				+ " " +classiq.newBill.cus.name  + "   "
				+ classiq.newBill.cus.lname 
				+ "  " + classiq.newBill.cus.numberOfFriends + " Guests" 
				+ "  OH! No space now. Please check later" + "  "
				+ time + "mins");

				System.out.println("");
			}
			
			i++;
		}
		System.out.println("");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("--> " + "Total Guests :" + totaLGuest + " totaling " + totalSales + "GHS in Sales");
				
	}

	//do this in a static class
	public static int factorSet(int hours)
	{
		int factor = 2;
		Random rdFactor = new Random();
		int m;
		if (hours<= 1)
		{	
			m = rdFactor.nextInt(6) + 1;//rdFactor.nextInt(5)
			return factor*m;
		}
		else if(hours>=2 && hours <= 5)
		{
			m = rdFactor.nextInt(10) + 5; 
			return factor*m;
		}
		else if(hours>=5 && hours <= 10)
		{
			m = rdFactor.nextInt(10) + 10;
			return factor*m;
		}
		else if(hours>=10 && hours <= 15)
		{
			m = rdFactor.nextInt(10) + 15;
			return factor*m;
		}
		else
		{
			m = rdFactor.nextInt(5) + 10;
			return factor*m;

		}
	}
}

