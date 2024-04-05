package staticex;

public class Ex3 {

	public static void main(String[] args) {
		
		System.out.println(10 * 10 * Calulator.pi);  //static변수는 바로 생성이 되기 때문에 생성자 만들지 x 가능
		
		System.out.println(Calulator.plus(10, 5));
		
		System.out.println(Calulator.minus(10, 5));

	}

}

//	계산기 클래스
class Calulator{
	
	static double pi = 3.14159;			//원의 둘레를 구하는 pi 공통속성
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}

// 학생  => 고유한 정보 가짐
// 계산기 => 다들 똑같이 동작하는값, 딱히 고유정보 X -> static으로 만들시 장점: 객체를 생성하지 않아도 어디서나 기능 사용 가능
// instance 일지 static일지 고민 여부
