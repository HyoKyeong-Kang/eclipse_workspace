package chap10;

class Vehicle {
	void drive() {}
	void horn() {}
}

class Car extends Vehicle {
	@Override
	void drive() {System.out.println("차가 운전 중입니다.");}
	void horn() {System.out.println("차가 경적을 울립니다.");}
		
	}
public class Driving {
	public static void main(String[] args) {
		Vehicle vv = new Vehicle();
		Car cc = new Car();
		
		
		cc.drive();
		cc.horn();
		
		
		//
	}
}
