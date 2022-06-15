package day0518;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		
//		for (int i=1; i<=100; i*=2) {
//		System.out.println(i);
//	}
	
//		for (;;) {
//			System.out.println("a");
//		} 무한루프

//		int i;
//		for (i=1; i<=10; i++) {
//			System.out.println(i);
//		}
//		System.out.println("마지막 : " + i);
	
		/* 숫자를 입력받아 1부터 해당 숫자까지의
		 * 짝수합 : ###
		 * 홀수합 : ###
		 * 총합계 : ### */
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("숫자 입력 > ");
		int num = s.nextInt();
		int eSum = 0, oSum = 0, tSum = 0;
		
		for (int i=1; i<=num; i++) {
			if(i%2==0) {
				eSum += i;
			} else {
				oSum += i;
			}
			tSum += i;
		}
		System.out.printf("짝수 합계 : %d\n", eSum);
		System.out.printf("홀수 합계 : %d\n", oSum);
		System.out.printf("총 합계 : %d\n", tSum);
	}

}
