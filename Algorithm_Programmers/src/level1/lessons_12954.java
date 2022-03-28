package level1;

public class lessons_12954 { /*03-28*/
    public long[] solution(int x, int n) {
        long[] answer = new long[n]; ;
        for(int i=0; i<n; i++)
        {
            long b = i+1;      //오버플로우 문제 항상 생각하기 
            answer[i] = x * b; //형변환 큰걸로 long으로 변환된다.
        }
        return answer;
    }
}
