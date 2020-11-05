package oop1Practice;

public class ex_621 {

	public static void main(String[] args) {
		// 절댓값 변환 메서드 구현
		
		int value1 = 5;
		System.out.println("value1의 절댓값"+abs(value1));
		int value2 = -10;
		System.out.println("value2의 절댓값"+abs(value2));
	}
	
	static int abs(int value) {		
		return value>0?value:-value;
	}
}
