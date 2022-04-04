package level1;

public class lessons_12948 {
    public String solution(String phone_number) {
        String answer = "";
        String answer1 = phone_number.substring(phone_number.length()-4, phone_number.length());
		String answer2 = phone_number.substring(0,phone_number.length()-4);
        String answer3 ="";
        for(int i=0; i <answer2.length(); i++) {
			answer += "*";
		}
        answer3= answer+answer1;
        return answer3;
    }
}
