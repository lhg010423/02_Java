package edu.kh.array2.practice;

import java.util.Scanner;

public class Array2Practice {
	Scanner sc = new Scanner(System.in);

	
	public void practice1() {
		
		String[][] arr = new String[3][3];
		
		for(int y = 0; y < arr.length; y++) {
			
			for(int x = 0; x < arr[y].length; x++) {
				arr[y][x] = "(" + y + ", " + x + ")";
				System.out.print(arr[y][x]);
			}
			System.out.println();
		}

		
		
	}
	
	public void practice2() {
		
		int[][] arr = new int[4][4];
		int num = 1;
		
		for(int y = 0; y < arr.length; y++) {
			
			for(int x = 0; x < arr[y].length; x++) {
				arr[y][x] = num;
				num++;
				if(arr[y][x] >= 10) {
					System.out.print(arr[y][x] + " ");
				} else {
					System.out.print(" " + arr[y][x] + " ");
				}
				
			}
			System.out.println();
		}
		
		
	}
	
	public void practice3() {
		
		int[][] arr = new int[4][4];
		int num = 16;
				
		for(int y = 0; y < arr.length; y++) {
			
			for(int x = 0; x < arr[y].length; x++) {
				arr[y][x] = num;
				num--;
				if(arr[y][x] >= 10) {
					System.out.print(arr[y][x] + " ");
				} else {
					System.out.print(" " + arr[y][x] + " ");
				}
				
			}
			System.out.println();
		}
		
		
		
		
	}
	
	public void practice4() {
		int[][] arr = new int[4][4];
		int sum = 0;
		
		for(int y = 0; y < arr.length; y++) {
			
			for(int x = 0; x < arr[y].length; x++) {
				if(x == 3) {
					arr[y][x] = sum;
					System.out.println(" " + sum);
				} else {
					int rd = (int)(Math.random() * 10 + 1);
					arr[y][x] = rd;
					sum += rd;
					if(arr[y][x] >= 10) {
						System.out.print(arr[y][x] + " ");
					} else {
						System.out.print(" " + arr[y][x] + " ");
					}
				}
				
			}
			
			
		}
		
		
	}
	
	public void practice5() {
		
		int row = 0;
		int col = 0;
		
		
		// 입력한 숫자가 1~10 이 아닐때 처음부터 다시 시작함
		for(int i = 0; i < 1; i++) {
			
			System.out.print("행의 크기 : ");
			row = sc.nextInt();
			if(row > 10 || row < 1) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				i--;
				continue;
			}
			
			
			System.out.print("열의 크기 : ");
			col = sc.nextInt();
			if(col > 10 || col < 1) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				i--;
				continue;
			}		
		}
		
		
		
		char[][] arr = new char[row][col];
		
		for(int y = 0; y < arr.length; y++) {
			
			for(int x = 0; x < arr[y].length; x++) {
				int rd = (int)(Math.random() * 26 + 65);
				arr[y][x] = (char)rd;
				System.out.print(arr[y][x] + " ");
				
			}
			System.out.println();
			
			
		}
		
		
		
		
		
		
		
	}

	public void practice6() {
		
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		char[][] arr = new char[row][];
		char eng = 'a';
		int col = 0;;
		String[] result = new String[row];
		String sum = "";
		
		for(int i = 0; i < row; i++) {
			System.out.print(i + "열의 크기 : ");
			col = sc.nextInt(); // 열 크기 입력
			arr[i] = new char[col];
			
			
			for(int x = 0; x < col; x++) {
				
				arr[i][x] = eng;
				eng++;
				sum += arr[i][x] + " ";
			}
			result[i] = sum;
			sum = "";
		}
		
		
		
		
		for(int y = 0; y < row; y++) {
			System.out.println(result[y]);

		}
		
		
	}
	
	public void practice7() {
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"	};
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		int index = 0;
		
		int row;
		int col;
		
		System.out.println("==1분단==");
		for(row = 0; row < arr1.length; row++) {
			for(col = 0; col < arr1[row].length; col++) {
				arr1[row][col] = students[index];
				index++;
				System.out.print(arr1[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("==2분단==");
		for(row = 0; row < arr2.length; row++) {
			for(col = 0; col < arr2[row].length; col++) {
				arr2[row][col] = students[index];
				index++;
				System.out.print(arr2[row][col] + " ");
			}
			System.out.println();
		}
		
		
		
		
	}
	
	public void practice8() {
		
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"	};
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		int index = 0;
		
		int row;
		int col;
		
		System.out.println("==1분단==");
		for(row = 0; row < arr1.length; row++) {
			for(col = 0; col < arr1[row].length; col++) {
				arr1[row][col] = students[index];
				index++;
				System.out.print(arr1[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("==2분단==");
		for(row = 0; row < arr2.length; row++) {
			for(col = 0; col < arr2[row].length; col++) {
				arr2[row][col] = students[index];
				index++;
				System.out.print(arr2[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println("=================================================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String input = sc.next();
		
		int bd = 0;
		int j = 0;
		String lr = null;
		
		
		for(int y = 0; y < arr1.length; y++) {
			for(int x = 0; x < arr1[y].length; x++) {
				if(arr1[y][x].equals(input)) {
					bd = 1;
					j = y+1;
					lr = x == 0 ? "왼쪽" : "오른쪽";
					
				} else if(arr2[y][x].equals(input)) {
					bd = 2;
					j = y+1;
					lr = x == 0 ? "왼쪽" : "오른쪽";
				}
			}
		}
		
		System.out.printf("검색하신 %s 학생은 %d분단 %d번째 줄 %s에 있습니다.", input, bd, j, lr);
		
		
	}
	
	public void practice9() {
		
		String[][] arr = new String[6][6];
		
		for(int a = 0; a < arr.length-1; a++) {
			arr[a+1][0] = "" + a;
			arr[0][a+1] = "" + a;	
		}
		
		int row = 0;
		int col = 0;
		
		while(true) {
			System.out.print("행 인덱스 입력 : ");
			row = sc.nextInt();
			
			if(row >= 0 && row <= 4) {
				while(true) {
					System.out.print("열 인덱스 입력 : ");
					col = sc.nextInt();
					if(col >= 0 && col <= 4) {
						for(int y = 0; y < arr.length; y++) {
							for(int x = 0; x < arr[y].length; x++) {
								if(y == row && x == col) {
									arr[y+1][x+1] = "X";
								}	
								if(arr[y][x] == null) {
									arr[y][x] = " ";
								}
								System.out.print(arr[y][x] + " ");
							}
							System.out.println();
							
						}
						
						return; // 메소드 종료(practice9() 종료)
					}
					
					System.out.println("0~4사이 인덱스를 입력해주세요");
				}
			}
			System.out.println("0~4사이 인덱스를 입력해주세요");
		}
		
		
		
		
//		System.out.println(Arrays.deepToString(arr[0]));
//		System.out.println(Arrays.deepToString(arr[1]));
//		System.out.println(Arrays.deepToString(arr[2]));
//		System.out.println(Arrays.deepToString(arr[3]));
//		System.out.println(Arrays.deepToString(arr[4]));
//		System.out.println(Arrays.deepToString(arr[5]));
		
		
		
		
	}
	
	public void practice10() {
		
		String[][] arr = new String[6][6];
		
		for(int a = 0; a < arr.length-1; a++) {
			arr[a+1][0] = "" + a;
			arr[0][a+1] = "" + a;
		}
		
		while(true) {
			while(true) {
				System.out.print("행 인덱스 입력 : ");
				int row = sc.nextInt();
				if(row == 99 || row >= 0 && row <= 4) {
					if(row == 99) {
						System.out.println("프로그램 종료");
						return; // 메소드 종료(practice10() 종료)
					}
					
					while(true) {
						System.out.print("열 인덱스 입력 : ");
						int col = sc.nextInt();
						if(col >= 0 && col <= 4) {
							for(int y = 0; y < arr.length; y++) {
								for(int x = 0; x < arr[y].length; x++) {
									if(y == row && x == col) {
										arr[y+1][x+1] = "X";
									}
									
									if(arr[y][x] == null) {
										arr[y][x] = " ";
									}
									
									System.out.print(arr[y][x] + " ");
								}
								
								System.out.println();
							}
							break;
						}	
					}
				} else {
					System.out.println("0~4사이 인덱스를 입력하시오.");
				}
				
				
			} // 두번째 while문
			
		} // 처음 while문
		
		
	}
	
	
	
	
}
