package day0518;

public class If2 {

	public static void main(String[] args) {
		
//		int num = (int)(Math.random() * 10); 0~9
//		int num = (int)(Math.random() * 10)+ 1; // 1~10
//		
//		System.out.println(num);
		
		// 랜덤으로 주사위를 던져서 결과값 확인하기
		// 만약 주사위의 값이 1이 나오면
		// 1번이 나왔습니다. 라고 출력
		// if 사용
		
		int num = (int)(Math.random() * 6) + 1;
		
		if(num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else if (num == 6) {
			System.out.println("6번이 나왔습니다.");
		}

	}

}
