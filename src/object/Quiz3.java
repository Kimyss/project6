package object;

/* 손님이 카페에서 커피를 사는 과정 구현하세요.
 * 
 * 10000원을 가진 둘리는 별다방 카페에서 4000원을 내고 아메리카노를 샀습니다.
 * 20000원을 가진 또치는 별다방 카페에서 4500원을 내고 라떼를 샀습니다.
 * 단, 소지금이 가격보다 적으면 커피를 살 수 없습니다.
 * 객체를 어떤대상으로 해야할지(?) 손님 카페 음료 
 * */

public class Quiz3 {

	public static void main(String[] args) {
		
		Student5 student5 = new Student5("둘리", 4000);
		Cafe cafe = new Cafe();
		
		student5.takeAme(cafe);

	}

}
class Student5{
	String studentName;		//학생이름
	int money;				//소지금
	
//학생의 이름과 가진돈을 초기화하는 생성자 ~
		public Student5(String student5, int money) {
			super();
			this.studentName = student5;
			this.money = money;
		}
	
//	카페 아메 지불메소드
	public void takeAme(Cafe americano) {
		if(money < 4000) {
			System.out.println("소지금부족");
			return;
		} else {
		americano.takeAme(4000);	//4000지불
		this.money =this.money -4000;
		System.out.println("아메리카노 구매, 소지금은 " + money +"입니다");
		}
		
	}
	
//	라떼 지불메소드
	public void  takeLatte(Cafe latte) {
		if(money < 4500) {
			System.out.println("소지금부족");
			return;
		}
		latte.takeAme(4500);	//4500지불
		this.money =this.money -4500;
	}
//	출력메소드
//	public void showInfo() {
//		System.out.println(cafeName + "에서" + );
//	}
	
	
//	public void takeCoffee(Cafe cafe, int pirce) {
//		cafe.money(price);
//		this.money = this.money -price
//	}	메소드 하나로 통합예시
}


class Cafe{
	
	String CafeName;
	int money;			//수입

	
//	아메 판매 메소드
	public void takeAme(int money) {
		this.money = money;
	}
//	라떼 판매 메소드 
	
	public void takeLatte(int money) {
		this.money = money;
	}
//	(참고)메소드 하나로 하고싶으면 인자를 두개생성 요망
	
//	이름출력메소드
	public void CafeName(String CafeName) {
		this.CafeName = CafeName;
	}
	
}
