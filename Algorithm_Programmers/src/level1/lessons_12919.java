package level1;

public class lessons_12919 {
    public String solution(String[] seoul) {
        String answer = "";
        String kim = "Kim";
        for(int i=0; i<seoul.length; i++)
        {
        	if(seoul[i].equals(kim) == true) {
        		answer = "�輭����"+i+"��"+"�ִ�"; //seoul[i].equals(kim) �̶�� �� ��������. equals!
        	}
        }
        return answer;
    }
}
