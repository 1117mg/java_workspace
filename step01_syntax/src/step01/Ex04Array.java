package step01;

import java.util.Arrays;

public class Ex04Array {

	public static void main(String[] args) {
		// 배열
		int[] arr1 = {1,2,3};
		int[] arr2 = {};
		int[] arr3 = new int[3]; //초기 배열의 크기가 고정
		
		int[] arr4;
//		arr4 = {4,5,6}; //생성과 동시에 초기화가 반드시 필수 !!!
		arr4 = new int[] {4,5,6};
		
		//arr5
		int[] arr5 = {1,2,3,4,5};
//		System.out.println(arr5[5]); // 주의: ArrayIndexOut 문제!
		
		
		//length
		for(int i=0; i<arr5.length; i++) {
			System.out.println(arr5[i]);
		}
		
		//향상된 반복문
		/*
		 * for(변수명 : 배열변수명) {
		 * 
		 * }
		 */
		for(int v : arr5) {
			System.out.println(v);
		}
		
		//참조타입 배열 : 문자열
		String[] alphabet = {"a", "b", null, "d", "e"};
		for(int i=0; i<alphabet.length; i++) {
			System.out.println(alphabet[i]);
		}
		
		for(String alpha : alphabet) {
			System.out.println(alpha);
		}
		
		//다중배열
		int[][] numbers = {
				{5,10},
				{4,8},
				{3,6},
				{2,7}
		};
		
		System.out.println(numbers[2][1]);
		
		//다중배열의 모든 요소 출력?
		for(int i=0; i<numbers.length; i++) {
			for(int j=0;j<numbers[i].length;j++) {
				System.out.println(numbers[i][j]);
			}
		}
		
		
		
		// 복사
		
		int[] arr6 = {1,2,3};
		int[] arr7 = arr6;
		
		arr6[0] = 10;
		System.out.println(arr6[0]);
		System.out.println(arr7[0]);
		
		System.out.println(arr6);
		System.out.println(arr7);
		
		//깊은 복사
		// 1)
		int[] arr8 = {10, 20, 30, 40, 50};
		int[] arr9 = new int[3];
		
		for(int i=0; i<arr9.length; i++) {
			arr9[i] = arr8[i];
		}
		
		// 실제 깊은 복사가 잘 되었는지 확인하는 방법
		arr8[0]=100;
		System.out.println(arr8);
		System.out.println(arr9);
		
		//2)etc
		//clone
		int[] arr10 = arr8.clone();
		for(int i:arr10) {
			System.out.println(i);
		}
		System.out.println(arr8);
		System.out.println(arr10);
		
		// Arrays.copyof(원본배열명, 복사할 요소의 갯수)
		int[] arr11 = Arrays.copyOf(arr8, arg8.length);
		for(int i: arr11) {
			System.out.println(i);
		}
		System.out.println(arr8);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
