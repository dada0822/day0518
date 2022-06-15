package day0518;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		

		/* 성적을 입력받아
		 * 100~90 A
		 * 80~89 B
		 * 70~79 C
		 * 60~69 D
		 * 나머지는 F */
		int score, number;
		char grade;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("성적 입력 > ");
		score = s.nextInt();
		number = score / 10;
		
		switch(number) {
		case 10 :
		case 9 :
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		case 6 :
			grade = 'D';
			break;
		default :
			grade = 'F';
		}
		
		System.out.println("학점 : " + grade);
		s.close();
	}

}
