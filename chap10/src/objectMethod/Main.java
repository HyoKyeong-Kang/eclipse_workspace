package objectMethod;

public class Main {
	public static void main(String[] args) {
	Person p1 = new Person("홍길동" ,50);
	Person p2 = new Person("홍길동" ,30);
	
	
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p1.equals(p2));
}
}
