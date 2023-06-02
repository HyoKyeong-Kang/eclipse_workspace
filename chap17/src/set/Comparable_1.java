package set;

import java.util.TreeSet;

	//나이를 기준으로 Person 객체를 
class Person implements Comparable<Person> {
	public String name; // 이름
	public int age; // 나이- 해당 필드를 기준으로 정렬

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		// this.age 가 비교 대상으로 들어온 age (o)의 값보다 작다면 -1 을 리턴
		// this.age 가 비교 대상으로 들어온 age (o)의 값과 같다면 0을 리턴
		// this.age 가 비교 대상으로 들어온 age (o)의 값보다 크다면 1 을 리턴
		if (age < o.age)
			return -1;
		else if (age == o.age)
			return 0;
		else
			return 1;
	}
	// Person 이라는 객체가 추가 되면 - 자동 정렬 - 해당 compareTo()의 결과 값을 기준으로 정렬 시키겠다.
	// 나이가 적은 순으로 오름차순 정렬을 하겠다.

}

public class Comparable_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> treeSet = new TreeSet<>();

		//객체 저장
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("임꺽정", 30));
		treeSet.add(new Person("김기역", 80));
		
		//객체 하나씩 가져오기
		for(Person p : treeSet) {
			System.out.println(p.name + " : " + p.age);
		}
	}

}
