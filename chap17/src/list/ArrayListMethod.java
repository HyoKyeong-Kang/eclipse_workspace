package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> aList1 = new ArrayList<Integer>();
		//데이터 추가 - add (E element)
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		System.out.println(aList1.toString());
		
		aList1.add(1,6);
		System.out.println(aList1.toString());

		
		List<Integer> aList2 = new ArrayList<Integer>();
		aList2.add(1);
		aList2.add(2);
		aList2.addAll(aList1);
		System.out.println(aList2);
		
		List<Integer> aList3 = new ArrayList<Integer>();
		aList3.add(1);
		aList3.add(2);
		aList3.addAll(1,aList3);
		System.out.println(aList3);
		
		aList3.set(1, 5);
		aList3.set(3, 6);
		System.out.println(aList3);
	}

}
