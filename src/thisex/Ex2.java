package thisex;

public class Ex2 {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setName("둘리");
		System.out.println(person);
		person.printThis(); 		//위와 같은값 출력됨 

	}

}

class Person{
	String name;
	
//	이름변경메소드
	public void setName(String name) {
		this.name = name;
	}
	
//	this의 값을 출력하는 메소드
	public void printThis() {
		System.out.println(this);
	}
}
