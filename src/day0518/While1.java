package day0518;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		
		/* 숫자를 입력받아 숫자의 각 자리수의 합계를 계산
		 * 1234 => 1+2+3+4의 합계를 출력 */
		
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력 > ");
		int num = scan.nextInt();
		
//		while (num!=0) {
//			sum += num%10;
//			num /= 10; // num = num / 10
//		}
//		System.out.println(sum);
		
		
//		for (; num>0;) {
//			sum += num%10;
//			num /= 10;
//		}
		for (; num>0; num/=10) {
			sum += num%10;
			System.out.printf("sum : %d, num : %d\n", sum, num);
		}
		
	}

}
