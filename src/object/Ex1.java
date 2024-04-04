package object;

public class Ex1 {

	public static void main(String[] args) {
		
		Student student = new Student("짱구", 10000);
		
		
		Bus bus = new Bus(100);				//100번 버스 만든다
		student.takeBus(bus);				//학생이 100번 버스탄다
		student.showInfo();					//그 이후 학생의 정보확인
		bus.showInfo();						//이후 버스 정보확인
		
		
		
		
		
		

	}

}

//버스 클래스
class Bus {
	int busNumber; // 버스번호
	int passengerCount; // 승객수
	int money; // 수입

//	버스번호를 초기화하는 생성자를 만들어주세요

	public Bus(int busNumber) {
		super();
		this.busNumber = busNumber;
	}

//	메소드추가 승객을 태우는 메소드(함수)

	public void take(int money) {
		this.money = this.money + money; // 버스 수입증가 this.money = money => money가 누적이 아닌 교체가 되어버린다
		passengerCount++; // 승객수 1증가 passengerCount : 중복되는 변수가 없기 떄문에 위의 전역변수 가리킴
	}

	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은" + money + " 입니다");
	}
}

//	지하철 클래스
class Subway {
	String lineNumber; // 지하철노선번호
	int passengerCount; // 승객수
	int money; // 수입

//	지하철 노선번호를 초기화하는 생성자~

	public Subway(String lineNumber) {
		super();
		this.lineNumber = lineNumber;
	}
//	지하철에 승객을 태우는 메소드

	public void take(int money) {
		this.money = money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "의 승객은" + passengerCount + "명 이고, 수입은 " + money + "원 입니다");
	}
}

//	학생클래스 
class Student {
	String student; // 학생 이름
	int money; // 소지금

//학생의 이름과 가진돈을 초기화하는 생성자 ~
	public Student(String student, int money) {
		super();
		this.student = student;
		this.money = money;
	}

//	버스에 타서 요금을 지불하는 메소드
	public void takeBus(Bus bus) {			//리턴값 x 입력값 O 매개변수 :참조변수 버스를 전달받고 그것을 가지고 함수호출
		bus.take(1000);	//1000원지불
		this.money = this.money - 1000;			//가진돈 - 1000 
	}
	
//	지하철에 타서 요금 지불하는 메소드
	public void takeSubway(Subway subway) {		//매개변수로 지하철 객체받음
		subway.take(1500);				
		this.money = this.money - 1500;		
	}
//	정보출력메소드
	public void showInfo() {
		System.out.println(student + "님의 잔액은 " + money + "입니다");
	}
}
