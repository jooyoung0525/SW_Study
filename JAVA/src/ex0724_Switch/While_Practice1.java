package ex0724_Switch;

import java.util.Scanner;

public class While_Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s,n;
		 
		//1*2*..*10의 결과 (10!)
		
		/* 방법1.
		s = 1; n = 1;
		while(true) {
			s*=n;
			n++;
			if(n>=11)break;
		}
		
		System.out.println(s); //3628800
		*/
		
		// 방법2
		s = 1; n = 1;
		while(n<11) {
			s*=n;
			n++;
		}
		
		System.out.println(s);
	
		
		
		sc.close();
	}
}
