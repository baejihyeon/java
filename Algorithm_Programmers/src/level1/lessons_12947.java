package level1;

public class lessons_12947 {
public static void main(String[] args) {
    boolean answer = true; 
    int x = 18;
    String s = String.valueOf(x); //string으로 변환.
    int result =0;
    for(int i=0; i<s.length(); i++)
    {
        result += Integer.parseInt(s.substring(i,i+1)); // 이부분 다시 공부해놓기.
    }
    
    if(x%result == 0) {
       answer = true;
    }else {
    	answer = false;
    }
    System.out.println(answer);
}
}

        			
        							 
        					
					
					
					
					
					

						
						
						