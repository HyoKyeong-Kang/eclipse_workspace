package objectMethod;

import java.util.Objects;

public class Person { //extends object
	String name;
	int age;
	
	
	public Person(String name, int age) {
		super(); //Object();
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name은 " + name + ", age는" + age + "]";
		//Person [강효경= 강효경]
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if(!(obj instanceof Person)) return false;
		Person person = (Person)obj;
		return Objects.equals(name, person.name);
	}
	
	
}
