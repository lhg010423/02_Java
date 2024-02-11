package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	Scanner sc = new Scanner(System.in);
	
	
	public void practice1() {
		
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			if(i % 2 == 0) {
				sum += arr[i];
			}
		}
		
		System.out.printf("\n짝수 번째 인덱스 합 : %d", sum);
	}
	
	public void practice2() {
		
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = (arr.length)-1; i >= 0; i--) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			if(i % 2 != 0 && i != 0) {
				sum += arr[i];
			}
		}
		System.out.printf("\n홀수 번째 인덱스 합 : %d", sum);
		
		
	}
	
	public void practice3() {
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		
		for(int i = 1; i <= input; i++) {
			arr[i-1] = i;
			System.out.print(arr[i-1] + " ");
		}

	}
	
	public void practice4() {
		
		int[] arr = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("입력 %d : ", i);
			int num = sc.nextInt();
			arr[i] = num;
//			System.out.println();
		}
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		boolean flag = false;
		
		for(int i = 0; i < 5; i++) {
			if(arr[i] == search) {
				System.out.printf("인덱스 : %d", i);
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	

		
		
	}
	
	public void practice5() {
		System.out.print("문자열 : ");
		String input = sc.next();
		char[] arr = new char[input.length()];
		
		
		for(int i = 0; i < input.length(); i++) {
			arr[i] += input.charAt(i);
		}
		System.out.print("문자 : ");
		char search = sc.next().charAt(0); // 문자하나 입력
		
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", input, search);
		
		int count = 0;
		for(int i = 0; i < input.length(); i++) {
			if(arr[i] == search) {
				count++;
				System.out.print(i + " ");
			}
		}
		
		System.out.printf("\n%c 개수 : %d", search, count);
	}
	
	public void practice6() {
		System.out.print("정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		int sum = 0;
		String result = "";
		
		for(int i = 0; i < input; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			int num = sc.nextInt();
			arr[i] = num;
			sum += num;
			result += num + " ";
			
		}
		System.out.println(result);
		System.out.printf("총 합 : %d", sum);
		
		
		
	}
	
	public void practice7()	{
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.next();
		char[] arr = new char[14];
		
		for(int i = 0; i < input.length(); i++) {
			arr[i] = input.charAt(i);
			if(i > 7) {
				arr[i] = '*';
			}
			System.out.print(arr[i]);		
		}
		
		
	}
	
	public void practice8() {
		for(int a = 0; a <= 1; a++) {
		System.out.print("정수 : ");
		int input = sc.nextInt();
		int mid = 0;
	
			if(input % 2 != 0 && input >= 3) {
				int[] arr = new int[input];
				mid = input / 2; // 5 입력시 mid = 2
				for(int i = 0; i < input; i++) {
					if(i > mid) {
						arr[i] = arr[--mid];
						
					} else {
						arr[i] = i+1;	
					}
					
					if(i+1 == input) {
						System.out.print(arr[i]);					
					} else {
						System.out.print(arr[i] + ", ");
					}	
				}
				break;
			} else {
				System.out.println("다시 입력하세요.");
				a--;
			}
		}
		
		
		
		
	}
	
	public void practice9() {
		int[] arr = new int[10];
		System.out.print("발생한 난수 : ");		
		for(int i = 0; i < 10; i++) {
			int rd = (int)(Math.random() * 10 + 1);
			arr[i] = rd;
			System.out.print(arr[i] + " ");
		}
		
		
		
	}
	
	public void practice10() {
		int[] arr = new int[10];
		int max = 0;
		int min = 10;
		
		System.out.print("발생한 난수 : ");		
		for(int i = 0; i < 10; i++) {
			int rd = (int)(Math.random() * 10 + 1);
			arr[i] = rd;
			System.out.print(arr[i] + " ");
			
			if(arr[i] > max) {
				max = arr[i];
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		
		
		
	}
	
	public void practice11() {
		int[] arr = new int[10];
		System.out.print("발생한 난수 : ");		
		for(int i = 0; i < 10; i++) {
			int rd = (int)(Math.random() * 10 + 1);
			arr[i] = rd;
			for(int a = 0; a < i; a++) {
				if(rd == arr[a]) {
					i--;
					break;
				}
			} 
			
		}
		for(int n = 0; n < 10; n++) {
			System.out.print(arr[n] + " ");
		}
		
	}
	
	public void practice12() {
		int[] lotto = new int[6];
		for(int i = 0; i < 6; i++) {
			int rd = (int)(Math.random() * 46 + 1);
			lotto[i] = rd;
			
			for(int x = 0; x < i; x++) {
				if(lotto[x] == rd) {
					i--;
					break;
				}
			}	
		}
		Arrays.sort(lotto);
		for(int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
			
		}
		
		
		
	}
	
	public void practice13() {
		System.out.print("문자열 : ");
		String input = sc.next();
		char[] arr = new char[input.length()];
		System.out.print("문자열에 있는 문자 : ");
		for(int i = 0; i < input.length(); i++) {
			arr[i] = input.charAt(i);
			if(i+1 == input.length()) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.println();
		System.out.println("문자 개수 : " + input.length());
		
		
		
	}
	
	public void practice14() {
		
		// 사용자가 입력한 배열의 길이만큼의 String 배열을 선언 및 할당하고
		// 배열의 인덱스에 넣을 값 역시 가용자가 입력하여 초기화 하세요.
		// 단, 사용자에게 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
		// 늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
		// 사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요

		// 1. 첫 배열 크기 지정
		System.out.print("배열의 크기를 입력하시오 : ");
		int size = sc.nextInt();
		sc.nextLine(); // 개행 넘기기
		
		String[] arr = new String[size]; // 입력한 수만한 배열 생성
		
		// 2. 첫 배열에 저장할 문자열 입력 받기
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		
		// 3. 반복이 시작되는 구간부터 무한루프로 작성하여 내부에 종료 조건을 만들어 break
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0); // 문자형 입력받기	
			
			//  4. 값을 더 입력한 경우
			if(ch == 'y' || ch == 'Y') {
				
				// 5. 더 입력받을 개수 입력 받기
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine(); // 개행 없애기
				
				// 6. 새로 값을 입력 받을 배열 생성 --> 기존 배열 크기 + 추가 입력 개수
				String[] newArr = new String[arr.length + addSize];
				
				// 7. 배열 복사 + 새로운 문자열 입력 받기
				for(int i = 0; i < newArr.length; i++) {
					if(i < arr.length) { // 인덱스의 크기가 기존 배열보다 작을 경우 기존 배열값 복사
						newArr[i] = arr[i];
					} else { // 인데스의 크기가 기존 배열보가 클 경우 새로운 문자열 입력 받기
						System.out.print((i+1) + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}	
				}
				
				// 8. 기존 배열공간을 참조하던 변수 arr에 새로운 배열 공간의 주소 newArr 대입
				arr = newArr;
				
			} else if(ch == 'n' || ch == 'N') { // 9. 값을 더 입력하지 않은 경우
				break; // 반복문 종료
				
			} else { // 잘못 입력한 경우
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
			}	
		}
		
		// 10. 배열값 모두 출력
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		/*
		boolean flag = false;
		for(int i = 0; i < 1; i++) {
			
			if(!flag) {
				System.out.print("배열의 크기를 입력하세요 : ");
				flag = true;
			} else {
				System.out.print("더 입력하고 싶은 개수 : ");
				
			}
			
			int size = sc.nextInt(); // 배열의 크기
			String b = sc.nextLine();
			
			String[] arr = new String[size]; // 배열 생성
			
			for(int a = 0; a < size; a++) {
				System.out.print(a+1 + "번째 문자열 : ");
				String input = sc.nextLine();
				arr[a] = input;
			}
			
			System.out.print("더 값을 입력하시겠습니까? (Y/N) : ");
			char result = sc.next().charAt(0);
			if(result == 'Y' || result == 'y') {
				i--;
			} else {
				System.out.println(Arrays.toString(arr));
			}
		
		*/
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
