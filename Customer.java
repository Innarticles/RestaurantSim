 import java.util.Random;  	
 public class Customer
	{
		String name;
		String lname;
		int numberOfFriends;
		int amount;

		String[] names = {"Innocent", "Kelechi", "Laud", "Prince", "Esther","Dubem"};
		String[] lnames = {"Barnabas", "Kennedy", "David", "Ayo", "Abideen","Jerry"};
		String[] mNames = {"Kenke", "Fufu and Vegetable", "Banku", "Bitter Leaf soup"};
		public Bills buyFood(Menus menu)
		{
			Random i = new Random();

			Bills bill = new Bills(this, menu); //(this, menu)
			
			bill.cus = this;
			int plates = i.nextInt(4);
			bill.menu.menu_name=mNames[i.nextInt(3)] ;
			bill.menu.price = 20 + (20 * plates);
			bill.cus.name = names[i.nextInt(5)];
			bill.cus.lname = lnames[i.nextInt(5)];
			bill.cus.numberOfFriends = (plates);
			
			return bill;
		}
		

	}
