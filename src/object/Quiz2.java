package object;
/* 학생이 택시에 타는 과정을 구현하세요.
 * 
 * 둘리 학생이 택시를 타고 학교에 갑니다.
 * 택시요금은 10000원을 지불했습니다.
 * 단, 소지금이 만원보다 적으면 택시에 탈수없습니다.
 * */

public class Quiz2 {

	public static void main(String[] args) {
		Student student = new Student("고길동", 8000);
		Taxi taxi = new Taxi();		//택시 개체만들고

		student.takeTaxi(taxi);		//인자값으로 주소전달

		student.showInfo();
		taxi.showInfo();
	}

}

class Taxi {
	int passengerCount;
	int money;

	public void take(int money) {
		this.money = money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println("택시의 승객은" + passengerCount + "명 이고, 수입은 " + money + "원 입니다");
	}
}
