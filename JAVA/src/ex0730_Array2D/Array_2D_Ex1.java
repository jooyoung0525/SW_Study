package ex0730_Array2D;

public class Array_2D_Ex1 {
	public static void main(String[] args) {

		int[][]a = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int[][]b = new int[][] {{10,20,30},{40,60},{70,80,90}}; 
		
		System.out.println("a배열...");
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				System.out.printf("%4d",a[i][j]);
			}
			System.out.println();
		}
		
		//향상된 for문장으로 이차원 배열 출력
		System.out.println("\na배열 향상된 for문장...");
		for(int row[] : a) {
			for(int x : row)
				System.out.printf("%4d",x);
			System.out.println();
		}
		
		
		System.out.println("\nb배열...");
		for(int i = 0; i<b.length; i++) {
			for(int j = 0; j<b[i].length; j++) {
				System.out.printf("%4d",b[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
