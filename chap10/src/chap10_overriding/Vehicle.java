package chap10_overriding;

class Brand extends Object {
	String brand = "BMW";
	void car() {}
	void motorCycle() {}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
	

class Car extends Brand{
	String brand = "현대";
	@Override
	void car() {
		System.out.print("차가");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.brand;
	}
}

class MotorCycle extends Brand{
	@Override
	void motorCycle() {
		System.out.print("오토바이가");
	}
}

public class Vehicle {
	protected String brand;
	
	public Vehicle(String brand) {
		this.brand = brand;
	}
	public void drive() {
		System.out.println(" 운전 중입니다.");
	}
	public void horn() {
		System.out.println(" 경적을 울립니다.");
	}
	public void accelate() {
		System.out.println(" 가속합니다.");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Brand bb = new Brand();
		Car c =new Car();
		MotorCycle m = new MotorCycle();
		
		Vehicle vv = new Vehicle(null);
		
		c.car();
		vv.drive();
		c.car();
		vv.horn();
		m.motorCycle();
		vv.drive();
		m.motorCycle();
		vv.accelate();
		System.out.println(c.brand);
		System.out.println(c);

		
	}
	
}
