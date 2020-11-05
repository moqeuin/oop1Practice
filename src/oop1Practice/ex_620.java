package oop1Practice;

public class ex_620 {

	public static void main(String[] args) {
	// 배열의 요소 중 최댓값을 구하는 메서드 구현
		
		int[] data = {2,3,1,4,7,9,5};
		System.out.println("최댓값" + getMax(data)); // 최댓값 9
		System.out.println("최댓값" + getMax(null)); // -999999
		System.out.println("최댓값" + getMax(new int[]{})); //-999999
	}
	
	static int getMax(int[] data) {
		
		int max;
		
		if(data != null && data.length != 0) {			
			max = data[0];			
			for (int i = 1; i < data.length; i++) {			
				if(max < data[i]) {				
					max = data[i]; 
				}			
			}
		}
		else {
			max = -999999;
		}
		return max;		
	}
}