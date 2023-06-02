package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_1 {
public static void main(String[] args) {
	Map<String, Integer> map = new HashMap<>();
	
	map.put("신용권", 85);
	map.put("홍길동", 90);
	map.put("동장군", 80);
	map.put("홍길동", 95);
	
	System.out.println("총 Entry 수 : " +  map.size()); //3
	
	String str1 = "홍길동";
	String str2 = "홍길동";
	System.out.println("str1 == str2 동등 비교 연산자 결과  : " + (str1 == str2));
	System.out.println("str1.equals(str2) 의 결과  : " + (str1.equals(str2)));
	System.out.println("str1 의 hashCode() : " + str1.hashCode());
	System.out.println("str2 의 hashCode()  : " + str2.hashCode());

	String key ="홍길동";
	int value = map.get(key);
	System.out.println(key + " : " + value);
	System.out.println(key + " : " + map.get(key));
	
	System.out.println();
	
//	Java의 Map은 key, value 로 구성되어 있으며 get(key)를 사용하여 value 값을 얻어낼 수 있다.
//	key에 해당하는 value 값만 가져올 수 있다는 단점이 있다.
//	Map 객체의 모든 데이터가 필요하기 마련이고 , Map 의 모든 데이터를 가져올 때에는 3가지 대표적인 방법이 존재한다.

	//1. 키 Set 컬렉션을 얻고, 반복자를 이용해서 키와 값을 얻기
	System.out.println("=== 1. keySet()을 이용하여 Set<E> 타입의 객체를 얻고 반복자를 이용 ===");
	Set<String> keySet = map.keySet(); //key들로만 구성된 set 객체를 반환
	//key 타입이 String 이기 때문에 Set에 저장될 타입도 String 으로 지정
	
	
	Iterator<String> keyIterator = keySet.iterator(); //Set 객체를 이용해 Iterator 객체를 반환
	while(keyIterator.hasNext()) {
		String k = keyIterator.next();  //keySet()으로 만든 객체니까 key값을 얻어낼 수 있다.
		Integer v = map.get(k);
		System.out.println(k + " : " + v);
	}
	System.out.println();
	
	//향상된 for문 사용
	System.out.println("==== 2. 향상된 for문을 사용해서 key와 value 값 얻어오기 ====");
	for (String k : map.keySet()) {
		Integer v = map.get(k);
		System.out.println(k +" : "+ v);
		
	}
	
	System.out.println();
	
	// 키로 엔트리 삭제
	System.out.println(map); //map.toString();
	map.remove("홍길동");
	System.out.println("총 Entry 수 : " + map.size());
	System.out.println(map);
	map.remove("동장군", 50);
	System.out.println(map); // 동일 Entry가 없으면 동작하지 않음
	
	System.out.println("총 Entry 수 : " + map.size());
	
	} 
}
