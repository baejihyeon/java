package level1;

public class lessons_12944 {
    public double solution(int[] arr) {
        double answer = 0;
        double result = 0;
        
        for(int i=0; i<arr.length; i++){
            answer += arr[i];    
        }
        result = answer/arr.length;
        return result;
    }
}
//��հ� ���ϴ� ���� ��������.