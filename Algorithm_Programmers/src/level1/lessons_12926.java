package level1;
import java.util.*;

public class lessons_12926 {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        int answer=0;
        char result =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <='z')
            {
                answer = (s.charAt(i)+ n -'a')%26;
                result = (char) (answer + 'a'); 
                sb.append(result);
            }else if(s.charAt(i) >= 'A' && s.charAt(i) <='Z'){
                answer = (s.charAt(i)+ n -'A')%26;
                result = (char) (answer + 'A');
                sb.append(result);
            }else if(s.charAt(i) == ' ') 
                sb.append(' ');
        }
        return  sb.toString();
    }
}
