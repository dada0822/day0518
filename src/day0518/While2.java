package day0518;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		
		/* while, Scanner, if문 이용
		 * 랜덤수는 1부터 300까지의 숫자 중 발생
		 * 숫자 입력 : xxx
		 * 만약 랜덤수보다 작은 수를 입력하면
		 * 	'난수보다 입력한 값이 작습니다. 큰 수를 입력하세요' 출력
		 * 난수보다 큰 수를 입력하면
		 *	'난수보다 입력한 값이 큽니다. 작은 수를 입력하세요' 출력
		 * 만약 정답이면
		 *	'정답입니다. x번만에 맞추셨습니다!' */
		
		int result = (int)(Math.random()*300)+1;
//		int result = 100;
		int count = 0;
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 입력 > ");
			int num = s.nextInt();
			count++;
			
			if (num<result) {
				System.out.println("난수보다 입력한 값이 작습니다. 큰 수를 입력하세요.");
			} else if (num>result) {
				System.out.println("난수보다 입력한 값이 큽니다. 작은 수를 입력하세요.");
			} else {
				System.out.println("정답입니다. " + count + "번만에 맞추셨습니다!");
				break;
			}
		}

		s.close();
	}

}
