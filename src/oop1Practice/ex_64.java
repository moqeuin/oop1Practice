package oop1Practice;

public class ex_64 {

	public static void main(String[] args) {
		//두 점 사이에 거리 구하기
		// Math.sqrt는 제곱근, Math.pow는 제곱
		
		System.out.println(getDistance(1, 1, 2, 2));

	}
	
	static double getDistance(int x, int y, int x1, int y1) {
		
		return Math.sqrt(Math.pow((x1-x),2)+Math.pow((y1-y), 2));
	}
	

}
