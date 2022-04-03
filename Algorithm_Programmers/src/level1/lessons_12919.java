package level1;

public class lessons_12919 {
    public String solution(String[] seoul) {
        String answer = "";
        String kim = "Kim";
        for(int i=0; i<seoul.length; i++)
        {
        	if(seoul[i].equals(kim) == true) {
        		answer = "김서방은"+i+"에"+"있다"; //seoul[i].equals(kim) 이라는 것 잊지말기. equals!
        	}
        }
        return answer;
    }
}
