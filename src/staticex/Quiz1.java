package staticex;
/*
 * 카드를 발급하는 프로그램을 구현하세요.
 * 
 * 카드(Card)을 정의하는 클래스를 만드세요.
 * 속성: 카드번호
 * 카드번호는 100번부터 시작하고 발급할 때마다 1씩 증가합니다.
 * 카드 3장을 생성한 후 카드정보를 출력하세요.
 * */

public class Quiz1 {

	public static void main(String[] args) {
		Card card1 = new Card("카카오 드림카드");
		Card card2 = new Card("카카오 드림카드");
		Card card3 = new Card("카카오 드림카드");
		
		
		System.out.println(card1.cardName + ": " + card1.cardNumber);
		System.out.println(card2.cardName + ": " + card2.cardNumber);
		System.out.println(card3.cardName + ": " + card3.cardNumber);
		

	}

}

class Card{
	static int cardNo = 100;
	
	String cardName;
	int cardNumber;
	
	
	public Card(String nameCard){
		this.cardName = nameCard;
		cardNo++;
		cardNumber = cardNo;
	}
	
//	public void Card(String nameCard) {
//		this.cardName = nameCard;
//	}
	
	
}
