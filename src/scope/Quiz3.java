package scope;

public class Quiz3 {

	public static void main(String[] args) {
		
//		Person person = new Person();			//메인함수 끝나기전까지
		
		int i = 10;								//메인함수 끝나기전가지
		
		if(i >1) {								//if 블록 끝나기전가지
			
			String str = "안녕하세요";
		}
		
		for(int k = 0; k < 10; k++) {			//for문 블록 끝나기전까지
			System.out.println();
		}

	}
//		**지역변수의 유효 범위는 변수가 선언된 블록 스코프에 따라 달라진다**
//		(참고) 파랭이는 전역변수 갈색이는 지역변수 (공부 더 필요)

}
