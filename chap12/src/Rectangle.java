
public class Rectangle extends Shape{
	double length;
	double width;
	


public Rectangle(String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
	}






@Override
double area() {
	// TODO Auto-generated method stub
	return length *width;
}



@Override
public String toString() {
	// TODO Auto-generated method stub
	return  "사각형의 색상은 " + super.getColor() + " 그리고 면적은 " + area();
}
}
