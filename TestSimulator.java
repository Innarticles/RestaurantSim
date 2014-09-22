import java.util.Random; 
public class TestSimulator
{
	public static void main(String[] args) 
	{	// number of hours
		int hours = Integer.parseInt (args[0]);
		int time = 0;

		int factoruse = factorSet(hours);
		int i = 1;
		while (i<factoruse) {
			Random rnd = new Random();
			time = 5 * i + rnd.nextInt(5);
			Restaurant classiq = new Restaurant();
			System.out.println("--> " 
			+ classiq.newBill.cus.name  + "   "
			+ classiq.newBill.cus.lname 
			+ "  " + classiq.newBill.cus.numberOfFriends + " Guests" 
			+ " " + classiq.newBill.menu.menu_name + " " 
			+ classiq.newBill.menu.price + "GHS" + " " 
			+ time + "mins");// Todo: Add a method to convert a given minutes to hours and minute
							//It will return the time as a string
			i++;

		}
				
	}

	//do this in a static class
	public static int factorSet(int hours)
		{
		int factor = 2;
		Random rdFactor = new Random();
		int m;
		if (hours>1 && hours < 2)
		{	
			m = rdFactor.nextInt(5);
			return factor*m;
		}
		else if(hours>2 && hours < 10)
		{
			m = rdFactor.nextInt(5) + 5;
			return factor*m;
		}
		else
		{
			m = rdFactor.nextInt(5) + 10;
			return factor*m;

		}
	}
}

