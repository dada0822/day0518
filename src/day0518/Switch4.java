package day0518;

import java.util.Scanner;

public class Switch4 {

	public static void main(String[] args) {
		
		/* 현재 월을 입력받아 계절을 표시하시오
		 * 3~5 봄 / 6~8 여름 / 9~11 가을 / 12, 1, 2 겨울 */

		int month;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("현재 월 입력 > ");
		month = scan.nextInt();
		
		switch(month) {
		case 3 : case 4 : case 5 :
			System.out.println("봄입니다.");
			break;
		case 6 : case 7 : case 8 :
			System.out.println("여름입니다.");
			break;
		case 9 : case 10 : case 11 :	
			System.out.println("가을입니다.");
			break;
		case 12 : case 1 : case 2 :
			System.out.println("겨울입니다.");
			break;
		default :
			System.out.println("잘못된 입력입니다.");
		}
		
		scan.close();

	}

}
