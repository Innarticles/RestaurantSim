public class Bills {

Customer cus;
Menus menu; 
int amount;
//(Customer a, Menus b)

public Bills(Customer a, Menus b)
	{
		cus = a;
		menu = b;
		amount = b.price;

	}
	
}