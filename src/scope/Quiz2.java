package scope;

public class Quiz2 {
	
	String personName;	//인스턴스 변수  class내에서만 사용가능. 객체 생성 후에 사용가능. 전역변수
	
//	PersonName = "객체생성요망";  
	
	int personAge;		//인스턴스변수 class내에서 사용가능.
	
	static char gender = 'F';			//static 전역변수: 클래스 끝나기전까지 사용가능 클래스변수:객체없이 사용가능 전지역사용가능
	
	public void setPersonName(String name) {  // 지역변수 setPersonName 함수내에서만 사용가능 
		this.personName = name;
	}


}
