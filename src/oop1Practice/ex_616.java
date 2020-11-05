package oop1Practice;

public class ex_616 {

	public static void main(String[] args) {
		
		String str = "abc123";
		System.out.println("change()전에 결과" + str);
		// change()전에 결과abc123
		change(str);
		System.out.println("change()후에 결과" + str);
		// change()전에 결과abc123
	}
	
	
	
	static void change(String str) {
		 /*
		 	String은 참조형 변수이라서 main에 str의 주소를 change의 매개변수가 참조하게된다
			 처음에 같은 값을 가리키게 되지만 String은 값이 변하지않는 특성때문에 str에 456을 더할 때
			 새로운 문자열을 생성하고 매개변수는 그 값을 가리키게 된다.
			 str(change) -> abc123456, str(main) -> abc123
			 결국엔 change블럭이 끝나면 매개변수 str은 제거되고 abc123456은 gc에 의해 제거된다. 
		  
		 */
		str += "456";
	}
}
