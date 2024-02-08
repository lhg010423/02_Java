package edu.kh.array2.practice;

import java.util.Arrays;
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
	
	
	
	
}
