import java.util.Scanner;

public class HouseApp {
	public static void main (String [] args) {
		Scanner input= new Scanner(System.in);
		HouseInventory array = new HouseInventory();
		int menu = 0;
		while(menu!=6) {
			System.out.printf("Options: %n"
					+ "1.Add a house\r\n"
					+ "2.Edit a house\r\n"
					+ "3.Delete a house\r\n"
					+ "4.Display all houses below a certain price\r\n"
					+ "5.Display Houses with the Same Price (Duplicates)%n"
					+ "6.Exit%n"
					+ "Enter the integer:");
			System.out.println();
			menu = input.nextInt();
			if (menu==1) {
				System.out.println("Enter the ID, the price, and whether the house is available for sale (true/false)");
				int id = input.nextInt();
				double price = input.nextDouble();
				boolean status = input.nextBoolean();
				House house = new House(id,price,status);
				array.Add(house);
			}else if(menu==2) {
				System.out.println("Enter the ID and the new price of the house you want to update:");
				int id = input.nextInt();
				double price = input.nextDouble();
				array.Edit(id, price);
			}else if(menu==3) {
				System.out.println("Enter the ID of the house you want to delete:");
				int id = input.nextInt();
				System.out.println(array.Delete(id));
			}else if(menu==4) {
				System.out.println("Enter the maximun price:");
				double max = input.nextDouble();
				array.HousesBellowPrice(max);
			}else if(menu==5) {
				array.Duplicates();
			}
			
		}
	}
}
