 import java.util.Random;  	
 public class Customer
	{
		String name;
		int numberOfFriends;
		int amount;

		String[] names = {"Innocent", "Kelechi", "Laud", "Prince", "Esther","Dubem"};

		public Bills buyFood(Menus menu)
		{
			Random i = new Random();

			Bills bill = new Bills(this, menu); //(this, menu)
			bill.menu.menu_name= "Akara";
			
			bill.cus = this;
			int plates = i.nextInt(4);
			bill.menu.price = 20 + (20 * plates);
			bill.cus.name = names[i.nextInt(5)];
			bill.cus.numberOfFriends = (plates);
			
			return bill;
		}
		

	}
