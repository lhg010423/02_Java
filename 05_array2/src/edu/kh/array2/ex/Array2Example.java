package edu.kh.array2.ex;

import java.util.Arrays;

public class Array2Example {

	/* 2차원 배열
	 * 
	 * - 자료형이 같은 1차원 배열을 묶음으로 다루는 것
	 * -> 행, 열 개녕 추가
	 * 
	 * 
	 * */
	
	public void ex1() {
		
		// 2차원 배열 선언
		int[][] arr;
		// int arr[][];
		// int[] arr[];
		// ==> int 2차원 배열을 참조하는 참조변수 arr 선언
		// 참조변소 == 참조형 == 레퍼런스 변수 == 레퍼런스
		
		// 2차원 배열 할당
		// -> new 자료형[행크기][열크기]
		
		arr = new int[2][3];
		// heap 영역에 int 2차원 배열 2행 3열 공간을 할당
		
		// 2차원 배열 쵝화
		// 1) 행, 열 인덱스를 이용해서 직접 초기화
		/*
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;

		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		*/
		
		// 2) 2중 for문을 이용한 초기화
		int num = 10; // 배열 요소 초기화에 사용할 변수
		
		// * 배열 길이
		// -> 배열명.length 는 변수가 직접 참조하고 있는 배열의 길이를 반환
		// arr = new int[2][3];
		
		System.out.println(arr.length); // 2 (행길이)
		// arr이 참조하고 있는 2차원 배열의 행의 길이
		
		System.out.println(arr[0].length); // 3 (열길이)
		
		System.out.println(arr[1].length); // 3 (열길이)
		
		
		
		
		
		for(int row = 0; row < arr.length; row++) { // 행 반복 (0,1)
			// arr.length = 2,  arr = new int[2][3]; 의 행이 길이가 됨
			
			for(int col = 0; col < arr[row].length; col++) { // 열 반복
				
				arr[row][col] = num;
				num += 10;
				
			}
		}
		
		// Arrays.toString(배열명) : 참조하고 있는 1차원 배열값을 문자열로 반환
		System.out.println("Arrays.toString() : " + Arrays.toString(arr));
		// Arrays.toString() : [[I@626b2d4a, [I@5e91993f]
		
		// Arrays.deepToString(배열명)
		// - 참조하고 있는 배열의 데이터가 나오는 부분까지 파고 들어가서
		// 모든 값을 문자열로 반환
		System.out.println("Arrays.deepToString() : " + Arrays.deepToString(arr));

	}
	
	public void ex2() {
		
		// 2차원 배열 선언과 동시에 초기화
		// 3행 3열짜리 정수형 2차원 배열 선언과 동시에
		// 1 ~ 9 까지 초기화
		
		// int[] arr = {1,2,3,4,5};
		
		int[][] arr = { {1, 2, 3},
						{4, 5, 6},
						{7, 8, 9} };
		
		// 행 별로 합 출력
		// 0행의 합 : 6
		// 1행의 합 : 15
		// 2행의 합 : 24
		
		
		for(int y = 0; y < arr.length; y++) {
			int sum = 0;
			
			for(int x = 0; x < arr[y].length; x++) {
				sum += arr[y][x];
				
			}
			System.out.printf("%d행의 합 : %d\n", y, sum);
		}
		
		System.out.println();
		

		// 열별로 합 출력
		
		for(int y = 0; y < arr.length; y++) {
			int sum2 = 0;
			
			for(int x = 0; x < arr[y].length; x++) {
				sum2 += arr[x][y];
				
			}
			System.out.printf("%d열의 합 : %d\n", y, sum2);
		}
		
		
		
	}
	
	public void ex3() {
		
		// 가변 배열
		// - 2차원 배열 생성 시 마지막 벼얼 차수(열)를 지정하지 않고
		//   나중에 서로 크기라 다른 1차원 배열을 생성하여 참조하는 배열
		
		char[][] arr = new char[4][];
				// char 2차원 배열 생성 시 행 부분만 생성
		
		arr[0] = new char[3]; // 0행에 3열짜리 1차원 배열을 생성하여 주소값 저장
		arr[1] = new char[4]; // 1행에 4열짜리 1차원 배열을 생성하여 주소값 저장
		arr[2] = new char[5]; // 2행에 5열짜리 1차원 배열을 생성하여 주소값 저장
		arr[3] = new char[2]; // 3행에 2열짜리 1차원 배열을 생성하여 주소값 저장
		
		char ch = 'a';
		for(int row = 0; row < arr.length; row++) { // 행
			
			for(int col = 0; col < arr[row].length; col++) {
				arr[row][col] = ch++;
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
		

	}
	
	// getInfo() : 입력받은 이름 주개를 배열로 만들어 반환하는 메서드
	//				콘솔 출력 시 ["김나나", "홍길동"]
	// - getInfo() 정의와 호출을 해야함
	// - 호출 시 입력받은 이름 두개를 전달인자로 전달할 것
	// - getInfo() 메서드의 정의는 전달받은 매개변수 값을 이용할 것
	
	
	
	
	
	
	
}
