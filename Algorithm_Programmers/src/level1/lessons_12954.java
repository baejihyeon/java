package level1;

public class lessons_12954 { /*03-28*/
    public long[] solution(int x, int n) {
        long[] answer = new long[n]; ;
        for(int i=0; i<n; i++)
        {
            long b = i+1;      //�����÷ο� ���� �׻� �����ϱ� 
            answer[i] = x * b; //����ȯ ū�ɷ� long���� ��ȯ�ȴ�.
        }
        return answer;
    }
}
