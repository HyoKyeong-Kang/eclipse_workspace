package Overriding;

public class Phone {
	public int price;
	public String telecom;
	public Phone(int price, String telecom) {
		super();
		this.price = price;
		this.telecom = telecom;
	}
	
	
}

class Iphone extends Phone {
	public Iphone(String telecom) {
		super(100000, telecom);
	}

	@Override
	public String toString() {
		return "IPhone";
	}
	
	
}
class Galaxy extends Phone {
	public Galaxy(String telecom) {
		super(900000, telecom);
	}

	@Override
	public String toString() {
		return "Galaxy";
	}
	
}
class Xiaomi extends Phone {
	public Xiaomi(String telecom) {
		super(500000, telecom);
	}

	@Override
	public String toString() {
		return "Xiaomi";
	}
}