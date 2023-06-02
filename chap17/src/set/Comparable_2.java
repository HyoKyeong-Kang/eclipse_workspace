package set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Fruit {
	public String name;
	public int price;
	
	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
}
 class FruitComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		if (o1.price < o2.price)
			return -1;
		else if (o1.price == o2.price)
			return 0;
		else
			return 1;
	}
	 
 }

public class Comparable_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Fruit> treeFruit =new TreeSet<>(new FruitComparator());
		treeFruit.add(new Fruit("포도", 5000));
		treeFruit.add(new Fruit("수박", 15000));
		treeFruit.add(new Fruit("딸기", 7000));
	
		for (Fruit f : treeFruit) {
			System.out.println(f.name + " : " + f.price);
			
		}
		
	}

}
