package day0518;

import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {

		// 사원이 실적 목표를 달성하였을 경우에는
		// 실적 목표를 초과한 금액의 10%를
		// 성과급으로 받는 프로그램을 작성
		// 실적 목표는 1000이고 상수로 설정
		// 실적목표, 사원의 실적, 보너스금액.. 
		
		final int TARGETSALES = 1000;
		int mySales;
		int bonus;
		String result;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("실적을 입력하세요 > ");
		mySales = scan.nextInt();
		
		
		if(mySales >= TARGETSALES) {
			result = "실적 달성!!";
			bonus = (mySales - TARGETSALES) / 10;
		} else {
			result = "실적 달성 못함";
			bonus = 0;
		}
		
		System.out.println(result + "\n" + "보너스 금액 : " + bonus);
		
		scan.close();

	}

}
