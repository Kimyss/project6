package thisex;

public class Ex1 {

	public static void main(String[] args) {

		BirthDay bDday = new BirthDay();

		bDday.setYear(2000);

		System.out.println(bDday);

		bDday.printThis();

	}

}

class BirthDay {

	int year;

	public void setYear(int year) { // setter 외부전달받은 값을 저장하는 메소드(함수)
		this.year = year; // 파랭이는 전역변수 갈색은 지역변수
	}

	public void printThis() {
		System.out.println(this); // 키워드 자체를 인자로 출력
	}
}
