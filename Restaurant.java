public class Restaurant{

	private String name_restaurant;

	private int no_of_tables = 5;

	private int no_of_avaliable_tables;

	boolean isTableFree()
	{
		
		if (no_of_avaliable_tables == 0)
			return false;
		else
			return true;
	}
	
}