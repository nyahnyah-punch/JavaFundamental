package Practice.Class;

public class Lottery {
	
	public static void GetNumber() {
		
		int[] Lotto = new int[6];

		for (int i = 0; i < Lotto.length; i++) {
			int random = (int) (Math.random() * 45) + 1; // double을 int로 케스팅
			Lotto[i] = random;

			// 절대 중복이 나오면 안됨 -> 중복체크 할 때 많이사용하는 코드
			boolean SameNumber = false; // SameNumber이 가짜여야한다
			// 중복체크
			for (int j = 0; j < i; j++) { // i가 몇번째 방을 도는지니까 6번째방보다 작을 때
				if (Lotto[j] == random) { // 위에 random이랑 중복되면
					SameNumber = true; // 불리안이 트루가 되고
					break;// 중복되면 그대로 빠져나가버리기
				}
			}
			if (!SameNumber) { // 만약 SameNumber조건과 맞지 않으면 중복이 아니다
				Lotto[i] = random; // 중복이 안되면 random에 집어넣어주고
			} else { // 얘가 없으면 중복되면 0으로 나옴 왜냐하면 중복된게 넘어가버려서
				i--; // i = i-1
			}
		}
		
	}
	
	public static void Ascending() {
		
		for (int i = 0; i < Lotto.length; i++) { // 로또 배열만큼 루프 한번 돌리기
			for (int j = 0; j < Lotto.length - (i + 1); j++) { // 5번 4번 3번 등등으로 줄어야 하니까
				if (Lotto[j] > Lotto[j + 1]) { // 0번방하고 1번방 크기 비교 >만 <로 바꾸면 내림차순 ㅋㅋㅋ
					int temp = Lotto[j + 1]; // 변수 선언해서 1번에 있는애를 저장
					Lotto[j + 1] = Lotto[j]; // 1번자리에 0번 넣어주기
					Lotto[j] = temp; // 0번 자리에 1번 넣어주기
				} // 이 코드는 실행하는데는 문제가 없지만 너무 많은 횟수를 돌려서 효율적이지 않다
			}
		}
		
	}

	public static void main(String[] args) {

		int[] Lotto = new int[6];

		for (int i = 0; i < Lotto.length; i++) {
			int random = (int) (Math.random() * 45) + 1; // double을 int로 케스팅
			Lotto[i] = random;

			// 절대 중복이 나오면 안됨 -> 중복체크 할 때 많이사용하는 코드
			boolean SameNumber = false; // SameNumber이 가짜여야한다
			// 중복체크
			for (int j = 0; j < i; j++) { // i가 몇번째 방을 도는지니까 6번째방보다 작을 때
				if (Lotto[j] == random) { // 위에 random이랑 중복되면
					SameNumber = true; // 불리안이 트루가 되고
					break;// 중복되면 그대로 빠져나가버리기
				}
			}
			if (!SameNumber) { // 만약 SameNumber조건과 맞지 않으면 중복이 아니다
				Lotto[i] = random; // 중복이 안되면 random에 집어넣어주고
			} else { // 얘가 없으면 중복되면 0으로 나옴 왜냐하면 중복된게 넘어가버려서
				i--; // i = i-1
			}
		}

		// 오름차순 코드
		for (int i = 0; i < Lotto.length; i++) { // 로또 배열만큼 루프 한번 돌리기
			for (int j = 0; j < Lotto.length - (i + 1); j++) { // 5번 4번 3번 등등으로 줄어야 하니까
				if (Lotto[j] > Lotto[j + 1]) { // 0번방하고 1번방 크기 비교 >만 <로 바꾸면 내림차순 ㅋㅋㅋ
					int temp = Lotto[j + 1]; // 변수 선언해서 1번에 있는애를 저장
					Lotto[j + 1] = Lotto[j]; // 1번자리에 0번 넣어주기
					Lotto[j] = temp; // 0번 자리에 1번 넣어주기
				} // 이 코드는 실행하는데는 문제가 없지만 너무 많은 횟수를 돌려서 효율적이지 않다
			}
		}

		for (int value : Lotto) {
			System.out.print(value + "\t");
		}
	}

}
