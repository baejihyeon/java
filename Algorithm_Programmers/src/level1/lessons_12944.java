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
//최대랑 최소를 찾은 후에 그 값 두개를 더해서 /2 해주는게 정답 아닌가