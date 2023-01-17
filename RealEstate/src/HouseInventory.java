import java.util.ArrayList;

public class HouseInventory implements InventoryMng {
	
	private ArrayList<House> houses = new ArrayList<House>();
	
	@Override
	public void Add(House h) {
		// TODO Auto-generated method stub
		houses.add(h);
	}

	@Override
	public void Edit(int id, double price) {
		// TODO Auto-generated method stub
		int i;
		for (i=0; i<houses.size(); i++) {
			if (houses.get(i).getID()==id) {
				houses.get(i).setPrice(price);
				break;
			}
			
		}
		
		if(houses.get(i).isStatus()==false) {
			houses.get(i).setStatus(true);
		}else if(houses.get(i).isStatus()==true) {
			houses.get(i).setStatus(false);
		}
	}

	@Override
	public int Delete(int id) {
		// TODO Auto-generated method stub
		int i;
		int result =1;
		for(i=0; i<houses.size();i++) {
			if(houses.get(i).getID()==id) {
				result = 1;
				break;
			}else {
				result =0;
			}
		}
		if (result ==1) {
			houses.remove(i);
		}
		return result;
	}

	@Override
	public House[] HousesBellowPrice(double p) {
		// TODO Auto-generated method stub
		int count = 0;
		int i;
		ArrayList<House> bellow = new ArrayList<House>();
		for (i=0;i<houses.size();i++) {
			if(houses.get(i).getPrice()<p) {
				count ++;
				bellow.add(houses.get(i));
			}
		}
		House[] bellowP= new House[count];
		for(int j=0; j<bellowP.length;j++) {
			bellowP[j]=bellow.get(j);
			bellowP[j].printMe();
		}
		return bellowP;
	}


	@Override
	public void Duplicates() {
		// TODO Auto-generated method stub
		int i;
		int dupes = 0;
		for (i=0;i<houses.size();i++) {
			for(int j=i+1; j<houses.size();j++) {
				if (houses.get(i).getPrice()==houses.get(j).getPrice()) {
					System.out.println("House ID: " + houses.get(i).getID() + " has the same price as house ID "
							+ houses.get(j).getID());
					dupes++;
				}
			}
		}
		if (dupes == 0) {
			System.out.println("The arraylist of houses has zero duplicates.");
		}
	}

}
