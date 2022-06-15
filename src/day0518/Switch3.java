package day0518;

public class Switch3 {

	public static void main(String[] args) {
		
		/* 현재 시각에 따라 스케쥴을 표시
		 * 8~12시 사이에 출근을 함
		 * 출근 시간은 랜덤으로 설정
		 * 8시 : 출근을 합니다.
		 * 9시 : 회의를 합니다.
		 * 10시 : 외근을 나갑니다.
		 * 나머지 시간에는 업무를 합니다. */

		int time = (int)(Math.random() * 5) + 8;
		
		System.out.println("현재 시간 : " + time + "시");
		switch(time) {
			case 8 :
				System.out.println("출근을 합니다.");
			case 9 :
				System.out.println("회의를 합니다.");
			case 10 :
				System.out.println("외근을 나갑니다.");
			default :
				System.out.println("업무를 합니다.");
		}

	}

}
