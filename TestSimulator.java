public class TestSimulator
{
	public static void main(String[] args) 
	{	// number of hours
		//int hours = Integer.parseInt (args[0]);
		
		
		int i = 1;
		while (i<20) {
			Restaurant classiq = new Restaurant();
			System.out.println("--> " 
			+ classiq.newBill.cus.name 
			+ "  " + classiq.newBill.cus.numberOfFriends + " Guests" 
			+ " " + classiq.newBill.menu.menu_name + " " 
			+ classiq.newBill.menu.price);
			i++;
		}
		
		
		//classiq.bill();

		
	}
}

