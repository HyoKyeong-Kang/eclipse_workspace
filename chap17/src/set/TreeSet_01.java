package set;

import java.util.NavigableSet;
import java.util.TreeSet;
import javax.print.DocFlavor.INPUT_STREAM;

public class TreeSet_01 {

	public static void main(String[] args) {
		// 무작위로 저장한 점수를 검색하는 방법 - TreeSet

		// TreeSet 컬렉션을 생성 - Integer 객체만 저장할 수 있는
		TreeSet<Integer> scores = new TreeSet<>();
		// Integer 객체를 무작위로 저장
		// TreeSet 은 자동 정렬을 시켜서 데이터를 저장 -> 정렬하는 기준이 정해져 있다는 것 (기준이 있는 객체만 TreeSet으로 저장
		// 가능)
		scores.add(87);
		scores.add(98);
		scores.add(88);
		scores.add(75);
		scores.add(50);

		// 향상된 for문
		for (Integer s : scores) {
			System.out.printf("[%d]", s);
		}
		System.out.println();
		// 특정 Integer 객체 가져오기
		System.out.println("가장 낮은 점수 : " + scores.first()); // first(); -> 첫번째 값을 반환(가장 작은 값)
		System.out.println("가장 높은 점수 : " + scores.last()); // last(); -> 마지막 값을 반환(가방 큰 값)
		System.out.println("95점 바로 아래의 점수 : " + scores.lower(95));
		System.out.println("95점 바로 위의 점수 : " + scores.higher(95));
		System.out.println("95점 이거나 바로 아래의 점수 : " + scores.floor(95));
		System.out.println("85점 바로 위의 점수 : " + scores.ceiling(85));

		System.out.println();

		// 내림차 순으로 정렬하기
		NavigableSet<Integer> desendingScore = scores.descendingSet();
		for (Integer s : desendingScore) {
			System.out.printf("[%d]", s);
		}

		System.out.println("\n");

		// 범위 검색
		// 80 이상의 숫자들로만 구성된 Set 객체를 반환한다 - 80 이상인 객체를 검색
		for (Integer s : scores.tailSet(80, true)) {
			// true는 <= (같거나 크다에 해당) - 주어진 범위를 포함한 이상을 찾겠다.
			System.out.printf("[%d]", s);
		}

		System.out.println();
		
		NavigableSet<Integer> tailScore = scores.tailSet(80, true);
		for (Integer s : tailScore) {
			System.out.printf("[%d]", s);
		}
		
		System.out.println();
		
		for (Integer s : scores.subSet(80, true, 90, false)) {
			System.out.printf("[%d]", s);
		}
	}

}
