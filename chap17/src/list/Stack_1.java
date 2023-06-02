package list;

import java.util.Stack;

class Coin {
	private int value;

	public Coin(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}

public class Stack_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스택 컬렉션 생성
		Stack<Coin> coinBox = new Stack<>();
		
		//동전 넣기
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		//동전 하나씩 꺼내기
		System.out.println(coinBox.empty());
		while(!coinBox.empty()) { //비어있지 않다면 반복해달라
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전은 :  " + coin.getValue() + "원");
		}
		
	}

}
