package oop1Practice;

public class ex_63 {

	public static void main(String[] args) {
		
		// 총합을 구하는 메서드와 소수둘째자리에서 반올림하는 평균을 구하는 메서드를 구현하여라
		
		Student st = new Student();
		st.kor = 100;
		st.eng = 60;
		st.math = 76;
		
		System.out.println("총합"+st.getTotal());
		System.out.println("평균"+st.getAverage());
	}
	

}

class Student {
	
	int kor;
	int math;
	int eng;
	
	int getTotal() {
		return this.kor + this.math + this.eng;
	}
	
	float getAverage() {
		return Math.round((getTotal()/3f)*10)/10f  ; 
	}
}