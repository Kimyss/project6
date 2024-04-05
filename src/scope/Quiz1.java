package scope;
//	접근제어자를 확인하고, 변수의 사용범위를 작성하세요 ! 지역변수 멤버(인스턴스)변수 전역변수
public class Quiz1 {
	
	public int field1;		//전역변수 어디서든 사용가능
	
	int field2;		//멤버변수	같은패키지 안에서만 사용가능 scope 패키지 내에서만
	
	private int field3;		//지역변수 클래스내부에서만 사용가능 A라는 클래스 내부에서만
}
