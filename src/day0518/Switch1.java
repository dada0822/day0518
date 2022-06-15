package day0518;

public class Switch1 {

	public static void main(String[] args) {

		int level = 3;
		
		switch(level) {
		case 3 :
			System.out.println("삭제권한");
		case 2 :
			System.out.println("쓰기권한");
		case 1 :
			System.out.println("읽기권한");
		}

	}

}
