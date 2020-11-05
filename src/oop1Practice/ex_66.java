package oop1Practice;

public class ex_66 {

	public static void main(String[] args) {
		// 예제 6-4의 메서드를 인스턴스 메서드로 구현하기
		
		MyPoint mp = new MyPoint(1, 1);
		System.out.println(mp.getDistance(2, 2));
	}

}

class MyPoint{
	
	
	int x;
	int y;
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {
		
		return Math.sqrt(Math.pow((x1-this.x),2)+Math.pow((y1-this.y), 2));
	}
}
