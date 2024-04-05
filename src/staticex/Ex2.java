package staticex;

public class Ex2 {

	public static void main(String[] args) {
		
		Student2 student1 = new Student2();
		System.out.println(Student2.getCount());	//클래스 이름으로 호출 참조변수를 사용해서 호출해도 되지만 static는 클래스이름으로 사용
		
		Student2 student2 = new Student2();
		System.out.println(Student2.getCount());	//클래스 이름으로 호출 참조변수를 사용해서 호출해도 되지만 static는 클래스이름으로 사용
		
	}

}


class Student2 { 					// 같은 패키지 내에 Ex1에 Student 있기때문에 2를 붙여줌
	static private int count = 0; 	// 공통속성 공통 변수이기 때문에 변수값 넣어줌 private이기 떄문에public생성자 만들어 주어야함

	int studentID;
	String studentName; 			// 인스턴스변수는 값을 넣어주지 X

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Student2.count = count;
//		StudentName = "둘리";		
//		static메소드에서는 static변수와 지역변수만 사용가능 인스턴스변수(멤버변수) 사용불가. **객체 < static메소드 먼저 생성되기때문**
	}

	public Student2() {
		count++; // 학생이 생성될 때마다 증가
		studentID = count; // 증가된 값을 학번에 부여
	}
}





