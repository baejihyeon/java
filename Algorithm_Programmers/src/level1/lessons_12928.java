package level1;

public class lessons_12928 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<n+1; i++) //  0���� ���� �� �� ������ +1�� �� ������� 
        {
            if(n%i == 0)
                answer += i; 
        }
        return answer;
    }

}
