package level1;

public class lessons_12943 {
	 public int solution(long num) {
	        int answer = 0;
			while (true) { //무한루프로 시작해서 break문 어디에 거는지 중요한 문제!
				if (num == 1) {
					break;
				}
				else if (answer == 500) {
					answer = -1;
					break;
				} else if (num % 2 == 0) {
					num = num / 2;
					answer += 1;
				} else if (num % 2 == 1) {
					num = (num * 3) + 1;
					answer += 1;
				}
			} 
			
			return answer;
		}
}
