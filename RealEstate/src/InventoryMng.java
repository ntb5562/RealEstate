
public interface InventoryMng {

	public void Add(House h);

	public void Edit(int id, double price);

	//allow the user to update the price and whether the house is available for sell or not.

	public int Delete(int id);

	//delete a house whose ID’ value is id – returns zero if the house was not deleted (not found)

	// return 1 is the house was deleted.

	public House[] HousesBellowPrice(double p);

	//returns an array of houses that are below a price p.
	
	//in case there are none – then you need to return an empty array.
	
	//once this method called in the main, you will need to print the array being return by the method to the screen. 
	
	public void Duplicates();
	//displays the ID of all houses with duplicate prices in the array
	//assuming duplicate meaning only two of the same prices

	
}
