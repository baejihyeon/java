package level1;

public class lessons_12928 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<n+1; i++) //  0으로 나눌 수 가 없으니 +1을 꼭 해줘야함 
        {
            if(n%i == 0)
                answer += i; 
        }
        return answer;
    }

}
