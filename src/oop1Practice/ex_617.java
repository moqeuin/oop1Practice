package oop1Practice;

import java.util.Arrays;

public class ex_617 {

	public static void main(String[] args) {
		// 9개의 요소를 배열 섞기
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(original));
		
		ShuffleClass sc = new ShuffleClass();
		sc.shuffle(original);
		System.out.println(Arrays.toString(original));
	}

}

class ShuffleClass{
	
	void shuffle(int[] original) {
		
		for (int i = 0; i < original.length; i++) {
			
			int ranNum =(int)(Math.random()*9)+1;
			int tmp;
			tmp = original[i];
			original[i] = original[ranNum];
			original[ranNum] = tmp;
		}	
	}	
}