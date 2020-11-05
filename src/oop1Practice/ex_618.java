package oop1Practice;

// 문자열이 모두 숫자로만 이루어져있으면 true, 
// 아니면 false, null이어도 false를 반환하는 메서드 구현

public class ex_618 {

	public static void main(String[] args) {
		String str1 = "1234";
		System.out.println("str1은 숫자입니까?" + isNumber(str1));
		
		String str2 = "1234ab";
		System.out.println("str2은 숫자입니까?" + isNumber(str2));
		
		String str3 = null;
		System.out.println("str3은 숫자입니까?" + isNumber(str3));
	}


	static boolean isNumber(String str) {
		
		boolean check = false;
		
		if(str != null && !str.equals("")) {
			for (int i = 0; i < str.length(); i++) {
				
				int ch = (int)(str.charAt(i));
				
				if(ch >= 48 && ch <= 57 ) {
					
					check = true;
				}
				else {
					check = false;
					break;
				}
			}
		
		}
		return check;
	}
}