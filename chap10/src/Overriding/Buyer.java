package Overriding;

import java.util.Scanner;

public class Buyer {
	int amount = 10000000;
	
	void buy(Phone p, String telecom) {
		if(amount < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		amount -= p.price;
		System.out.println(telecom + "의 " + p.toString() + "을(를) 구입 하셨습니다.");
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Buyer buyer = new Buyer();
	
	System.out.println("구매할 핸드폰을 선택해주세요.");
	System.out.println("1. 아이폰  2. 갤럭시 3. 샤오미");
	int phoneBrand = sc.nextInt();
	
	
	System.out.println("통신사를 선택해주세요.");
	System.out.println("1.SKT 2.KT 3.LG");
	String telecom = sc.next();
	
	switch(phoneBrand) {
		case 1:
			buyer.buy(new Iphone(telecom), telecom);
		break;
		case 2:
			buyer.buy(new Galaxy(telecom), telecom);
			break;
		case 3:
			buyer.buy(new Xiaomi(telecom), telecom);
			break;
			default:
				System.out.println("번호를 잘못선택하셨습니다.");
		
	}
	
}
	
}
