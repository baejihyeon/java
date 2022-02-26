package algorithm_study.codeup.answer;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Answer{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
 
//        System.out.println("Hello"); // 1001
 
//        System.out.println("Hello World"); // 1002
 
//        System.out.println("Hello \nWorld"); // 1003
 
//        System.out.println("'Hello'"); // 1004
 
//        System.out.println("\"Hello World\""); // 1005
 
//        System.out.println("\"!@#$%^&*()\""); // 1006
 
//        System.out.println("\"C:\\Download\\hello.cpp\""); // 1007
 
//        System.out.println("\u250c\u252c\u2510\n\u251c\u253c\u2524\n\u2514\u2534\u2518"); // 1008
 
//        int n = sc.nextInt();
//        System.out.println(n); // 1010
 
//        char ch = sc.next().charAt(0);
//        System.out.println(ch); // 1011
 
//        float f = sc.nextFloat();
//        String str = String.format("%.6f", f);
//        System.out.println(str); // 1012
 
//        int a = sc.nextInt(), b = sc.nextInt();
//        System.out.println(a + " " + b); // 1013
 
//        char ch1 = sc.next().charAt(0), ch2 = sc.next().charAt(0);
//        System.out.println(ch2 + " " + ch1); // 1014
 
//        float f = sc.nextFloat();
//        float f2 = Math.round(f*100)/(float)100;
//        String str = String.format("%.2f", f2);
//        System.out.println(str); // 1015
 
//        int n = sc.nextInt();
//        System.out.println(n + " " + n + " " + n); // 1017
 
//        String time = sc.nextLine();
//        System.out.println(time); // 1018
 
//        String ymd = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(ymd, ".");
//        int[] arr = new int[3];
//        int i=0;
//        while(st.hasMoreTokens()) {
//            arr[i]=Integer.parseInt(st.nextToken());
//            i+=1;
//        }
//        String year = String.format("%04d", arr[0]);
//        String month = String.format("%02d", arr[1]);
//        String day = String.format("%02d", arr[2]);
//        System.out.println(year+"."+month+"."+day); // 1019
 
//        String number = sc.nextLine();
//        String front = number.substring(0, 6);
//        String back = number.substring(7);
//        System.out.println(front+back); // 1020
 
//        String str = sc.nextLine();
//        System.out.println(str); // 1021
 
//        String str = sc.nextLine();
//        System.out.println(str); // 1022
 
//        String number = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(number, ".");
//        String[] numbers = new String[2];
//        int i=0;
//        while(st.hasMoreTokens()) {
//            numbers[i]=st.nextToken();
//            i++;
//        }
//        System.out.println(numbers[0]+"\n"+numbers[1]); // 1023
 
//        String str = sc.nextLine();
//        for(int i=0 ; i<str.length() ; i++) {
//            System.out.println("\'"+str.charAt(i)+"\'");
//        } // 1024
 
//        int n = sc.nextInt();
//        System.out.println("["+(n/10000)*10000+"]\n["+(n/1000%10)*1000+"]\n["+(n/100%10)*100+"]\n["+(n/10%10)*10+"]\n["+n%10+"]");
//        System.out.println(); // 1025
 
//        String time = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(time, ":");
//        String[] str = new String[3];
//        int i=0;
//        while(st.hasMoreTokens()) {
//            str[i]=st.nextToken();
//            i++;
//        }
//        int min = Integer.parseInt(str[1]);
//        System.out.println(min); // 1026 1번째 방법
//        String[] times = time.split(":");                
//        System.out.println(times[1]); // 1026 2번째 방법
 
//        String ymd = sc.nextLine();
//        String[] ymds = ymd.split("\\.");
//        System.out.println(ymds[2]+"-"+ymds[1]+"-"+ymds[0]); // 1027
 
//        long n = sc.nextLong();
//        System.out.println(n); // 1028
 
//        double d = sc.nextDouble();
//        double d2 = Math.round(d*Math.pow(10, 11))/(double)Math.pow(10, 11);
//        String str = String.format("%.11f", d2);
//        System.out.println(str); // 1029
 
//        long l = sc.nextLong();
//        System.out.println(l); // 1030
 
//        int n = sc.nextInt();
//        String octalString = Integer.toOctalString(n);
//        System.out.println(octalString);// 1031
 
//        int n = sc.nextInt();
//        System.out.printf("%h", n); // 1032
 
//        int n= sc.nextInt();
//        System.out.printf("%X", n); // 1033
 
//        String num = sc.nextLine();
//        int n = Integer.parseInt(num, 8);
//        System.out.println(n); // 1034
 
//        String num = sc.nextLine();
//        int n = Integer.parseInt(num, 16);
//        System.out.printf("%o", n); // 1035 1번째 방법
//        String octal = Integer.toOctalString(n);
//        System.out.println(octal); // 1035 2번째 방법
 
//        char ch = sc.next().charAt(0);
//        System.out.println((int)ch); // 1036
 
//        int n = sc.nextInt();
//        System.out.println((char)n); // 1037
 
//        long n1=sc.nextInt(), n2=sc.nextInt();
//        System.out.println(n1+n2); // 1038
 
//        String str=sc.nextLine();
//        String[] strs=str.split(" ");
//        long a=Long.parseLong(strs[0]);
//        long b=Long.parseLong(strs[1]);
//        System.out.println(a+b); // 1039 1번째 방법
 
//        String nums = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(nums, " ");
//        String[] arr = new String[2];
//        int i=0;
//        while(st.hasMoreTokens()) {
//            arr[i]=st.nextToken();
//            i++;
//        }
//        long a=Long.parseLong(arr[0]);
//        long b=Long.parseLong(arr[1]);
//        System.out.println(a+b); // 1039 2번째 방법
 
//        int n = sc.nextInt();
//        System.out.println(n*-1); // 1040
 
//        char ch=sc.next().charAt(0);
//        System.out.println((char)(ch+1)); // 1041
 
//        int a = sc.nextInt(), b = sc.nextInt();
//        System.out.println(a/b); // 1042
 
//        int a = sc.nextInt(), b = sc.nextInt();
//        System.out.println(a%b); // 1043
 
//        long n = sc.nextInt();
//        System.out.println(n+1); // 1044
 
//        int a = sc.nextInt(), b = sc.nextInt();
//        double d = (double)a/(double)b;
//        double d2 = Math.round(d*100)/(double)100;
//        String str = String.format("%.2f", d2);
//        System.out.println((a+b)+"\n"+(a-b)+"\n"+(a*b)+"\n"+(a/b)+"\n"+(a%b)+"\n"+str); // 1045
 
//        int a = sc.nextInt(), b = sc.nextInt(),c = sc.nextInt();
//        double avg = (double)(a+b+c)/(double)3;
//        double d = Math.round(avg*10)/(double)10;
//        String str = String.format("%.1f", d);
//        System.out.println((a+b+c)+"\n"+str); // 1046
 
//        int n = sc.nextInt();
//        System.out.println(n<<1); // 1047
 
//        int a = sc.nextInt(), b = sc.nextInt();
//        System.out.println((int)(a*Math.pow(2, b))); // 1048
 
//        int a = sc.nextInt(), b = sc.nextInt();
//        if(a>b)
//            System.out.println(1);
//        else if(a<=b)
//            System.out.println(0); // 1049
 
//        int a = sc.nextInt(), b = sc.nextInt();
//        if(a==b)
//            System.out.println(1);
//        else
//            System.out.println(0); // 1050
 
//        int a = sc.nextInt(), b = sc.nextInt();
//        if(b>=a)
//            System.out.println(1);
//        else
//            System.out.println(0); // 1051
 
//        int a = sc.nextInt(), b = sc.nextInt();
//        if(a!=b)
//            System.out.println(1);
//        else
//            System.out.println(0); // 1052
 
//        int n = sc.nextInt();
//        if(n==1)
//            System.out.println(0);
//        else if(n==0)
//            System.out.println(1); // 1053
 
//        int a = sc.nextInt(), b = sc.nextInt();
//        if(a==1&&b==1)
//            System.out.println(1);
//        else
//            System.out.println(0); // 1054
 
//        int a = sc.nextInt(), b = sc.nextInt();
//        if (a == 1 || b == 1)
//            System.out.println(1);
//        else
//            System.out.println(0); // 1055
 
//        int a = sc.nextInt(), b = sc.nextInt();
//        if(a!=b)
//            System.out.println(1);
//        else
//            System.out.println(0); // 1056
 
//        int a = sc.nextInt(), b = sc.nextInt();
//        if(a==b)
//            System.out.println(1);
//        else
//            System.out.println(0); // 1057
 
//        int a = sc.nextInt(), b = sc.nextInt();
//        if(a==0&&b==0)
//            System.out.println(1);
//        else
//            System.out.println(0); // 1058
 
//        int n = sc.nextInt();
//        if(n>=0)
//            System.out.println(n*-1-1);
//        else if(n<0)
//            System.out.println(n*-1-1); // 1059        
 
//        int a = sc.nextInt(), b = sc.nextInt();
//        System.out.println(a&b); // 1060
 
//        int a = sc.nextInt(), b = sc.nextInt();
//        System.out.println(a|b); // 1061
 
//        int a = sc.nextInt(), b = sc.nextInt();
//        System.out.println(a^b); // 1062
 
//        int a = sc.nextInt(), b = sc.nextInt();
//        System.out.println(a>=b?a:b); // 1063
 
//        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
//        System.out.println((a>=b?b:a)>=c?c:(a>=b?b:a)); // 1064
 
//        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
//        if(a%2==0)
//            System.out.println(a);
//        if(b%2==0)
//            System.out.println(b);
//        if(c%2==0)
//            System.out.println(c); // 1065
 
//        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
//        if (a % 2 == 0)
//            System.out.println("even");
//        else
//            System.out.println("odd");
//        if (b % 2 == 0)
//            System.out.println("even");
//        else
//            System.out.println("odd");
//        if (c % 2 == 0)
//            System.out.println("even");
//        else
//            System.out.println("odd"); // 1066
 
//        int n = sc.nextInt();
//        if(n>=0)
//            System.out.println("plus");
//        else
//            System.out.println("minus");
//        if(n%2==0)
//            System.out.println("even");
//        else
//            System.out.println("odd"); // 1067
 
//        int n = sc.nextInt();
//        switch (n / 10) {
//        case 10:
//            System.out.println("A");
//            break;
//        case 9:
//            System.out.println("A");
//            break;
//        case 8:
//            System.out.println("B");
//            break;
//        case 7:
//            System.out.println("B");
//            break;
//        case 6:
//            System.out.println("C");
//            break;
//        case 5:
//            System.out.println("C");
//            break;
//        case 4:
//            System.out.println("C");
//            break;
//        default:
//            System.out.println("D");
//        } // 1068
 
//        char str = sc.next().charAt(0);
//        switch (str) {
//        case 'A':
//            System.out.println("best!!!");
//            break;
//        case 'B':
//            System.out.println("good!!");
//            break;
//        case 'C':
//            System.out.println("run!");
//            break;
//        case 'D':
//            System.out.println("slowly~");
//            break;
//        default:
//            System.out.println("what?");
//        } // 1069
 
//        int n = sc.nextInt();
//        switch(n) {
//        case 12: System.out.println("winter");break;
//        case 1: System.out.println("winter");break;
//        case 2: System.out.println("winter");break;
//        case 3: System.out.println("spring");break;
//        case 4: System.out.println("spring");break;
//        case 5: System.out.println("spring");break;
//        case 6: System.out.println("summer");break;
//        case 7: System.out.println("summer");break;
//        case 8: System.out.println("summer");break;
//        case 9: System.out.println("fall");break;
//        case 10: System.out.println("fall");break;
//        case 11: System.out.println("fall");break;
//        } // 1070
 
//        while(true) {
//            int n = sc.nextInt();
//            if(n!=0)
//                System.out.println(n);
//            else
//                break;
//        } // 1071
 
//         int n1 = sc.nextInt(), n2;
//        for(int i=0;i<n1;i++) {
//            n2=sc.nextInt();
//            System.out.println(n2);
//        } // 1072
 
//        while (true) {
//            int n = sc.nextInt();
//            if (n == 0)
//                break;
//            System.out.println(n);
//        } // 1073
 
//        for(int i=sc.nextInt();i>0;i--) {
//            System.out.println(i);
//        } // 1074
 
//        for (int i = sc.nextInt(); i > 0; i--) {
//            System.out.println(i-1);
//        } // 1075
 
//        char ch=sc.next().charAt(0);
//        for(char c=97;c<=ch;c++) {
//            System.out.print(c+" "); 
//        } // 1076
 
//        int n=sc.nextInt();
//        for(int i=0;i<=n;i++) {
//            System.out.println(i);
//        } // 1077
 
//        int n=sc.nextInt();
//        int result=0;
//        for(int i=0;i<=n;i++) {
//            if(i%2==0)
//                result+=i;                
//        }
//        System.out.println(result); //1078
 
//        while(true) {
//            char ch=sc.next().charAt(0);
//            if(ch=='q') {
//                System.out.println(ch);
//                break;
//            }
//            System.out.println(ch);
//        } // 1079
 
//        int n=sc.nextInt();
//        int result=0, i=1;
//        while(true) {
//            result+=i;
//            if(result>=n) {
//                System.out.println(i);
//                break;
//            }
//            i++;
//        } // 1080
 
//        int a=sc.nextInt(), b=sc.nextInt();
//        for(int i=1;i<=a;i++) {
//            for(int j=1;j<=b;j++) {
//                System.out.println(i+" "+j);
//            }
//        } // 1081
 
//        String str = sc.nextLine();
//        int n = Integer.parseInt(str, 16);
//        for(int i=1;i<16;i++) {
//            System.out.printf("%X*%X=%X\n",n,i,n*i);
//        } // 1082
 
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++) {
//            if(i%3==0)
//                System.out.print("X ");
//            else
//                System.out.print(i+" ");
//        } // 1083
 
//        int r=sc.nextInt(), g=sc.nextInt(), b=sc.nextInt();
//        int result=0;
//        for(int i=0;i<r;i++) {
//            for(int j=0;j<g;j++) {
//                for(int z=0;z<b;z++) {
//                    System.out.println(i+" "+j+" "+z);
//                    result++;
//                }
//            }
//        }
//        System.out.println(result); // 1084
 
//        String str = sc.nextLine();
//        String[] strs = str.split(" ");
//        long h=Integer.parseInt(strs[0]);
//        long b=Integer.parseInt(strs[1]);
//        long c=Integer.parseInt(strs[2]);
//        long s=Integer.parseInt(strs[3]);
//        double total=0;
//        if(h>0&&h<=48000&&
//           b>0&&b<=32&&b%8==0&&
//           c>0&&c<=5&&
//           s>0&&s<=4000) {
//            total=h*b*c*s;
//        }
//        double result=((total/8)/Math.pow(2, 10))/Math.pow(2, 10);
//        System.out.printf("%.1f MB", result); // 1085
 
//        double result=0;
//        int w=sc.nextInt(), h=sc.nextInt(),b=sc.nextInt();
//        if(w>=1&&w<=1024&&
//           h>=1&&h<=1024&&
//           b<=40&&b%4==0) {
//        result = w*h*b;
//        }
//        
//        System.out.printf("%.2f MB", result/8.0/1024.0/1024.0); // 1086
 
//        int n=sc.nextInt();
//        int sum=0;
//        for(int i=1;i<=n;i++) {
//            sum+=i;
//            if(sum>=n) {
//                System.out.println(sum);
//                break;
//            }
//        } // 1087
 
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            if (i % 3 != 0)
//                System.out.print(i + " ");
//        } // 1088
 
//        int a = sc.nextInt(), d = sc.nextInt(), n = sc.nextInt();
//        int i = 1;
//        while (true) {
//            a = a + d;
//            i++;
//            if (i == n) {
//                System.out.println(a);
//                break;
//            }
//        } // 1089
 
//        long a = sc.nextInt(), d = sc.nextInt(), n = sc.nextInt();
//        long i=1;
//        while(true) {
//            a=a*d;
//            i++;
//            if(i==n) {
//                System.out.println(a);
//                break;
//            }
//        } // 1090
 
//        long a = sc.nextInt(), m = sc.nextInt(), d = sc.nextInt(), n = sc.nextInt();
//        for (int i = 1; i < n; i++) {
//            a = a * m + d;
//        }
//        System.out.println(a); // 1091
 
//        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
//        int day = 1;
//        while (day % a != 0 || day % b != 0 || day % c != 0) {
//            day++;
//        }
//        System.out.println(day); // 1092
 
//        int[] nums = new int[24];
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = 0;
//        }
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            int j = sc.nextInt();
//            nums[j] += 1;
//        }
//        for (int i = 1; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        } // 1093
 
//        int n=sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<arr.length;i++) {
//            arr[i]=sc.nextInt();
//        }
//        for(int i=arr.length-1;i>=0;i--) {
//            System.out.print(arr[i]+" ");
//        } // 1094
 
//        int[] nums = new int[24];
//        int cnt = 0;
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            int j = sc.nextInt();
//            nums[j] = 1;
//        }
//        for (int i = nums.length - 1; i > 0; i--) {
//            if (nums[i] == 1) {
//                cnt = i;
//            }
//        }
//        System.out.println(cnt); // 1095
 
//        int[][] arr = new int[19][19];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = 0;
//            }
//        }
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            int a=sc.nextInt(),b=sc.nextInt();
//            arr[a-1][b-1]=1;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        } // 1096
 
//        int[][] arr = new int[19][19];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            int a = sc.nextInt(), b = sc.nextInt();
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[a - 1][j] == 0)
//                    arr[a - 1][j] = 1;
//                else
//                    arr[a - 1][j] = 0;
//            }
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[j][b - 1] == 0)
//                    arr[j][b - 1] = 1;
//                else
//                    arr[j][b - 1] = 0;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        } // 1097
 
//        int h = sc.nextInt(), w = sc.nextInt(); // 격자판 세로, 가로
//        int[][] arr = new int[h][w];
//        for (int i = 0; i < h; i++) {
//            for (int j = 0; j < w; j++) {
//                arr[i][j] = 0;
//            }
//        }
//        int n = sc.nextInt(); // 막대의 개수
//        int l, d, x, y; // 막대의 길이, 방향(가로는 0, 세로는 1), 방향에 따른 가장 왼쪽 또는 위쪽의 좌표
//        for (int i = 0; i < n; i++) {
//            l = sc.nextInt();
//            d = sc.nextInt();
//            x = sc.nextInt();
//            y = sc.nextInt();
//            for (int j = 0; j < l; j++) {
//                if (d == 0) {
//                    arr[x-1][y++-1] = 1;
//                } else if (d == 1) {
//                    arr[x++-1][y-1] = 1;
//                }
//            }
//        }
//        for (int i = 0; i < h; i++) {
//            for (int j = 0; j < w; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        } // 1098
 
//        int[][] arr = new int[10][10];
//        int ant = 9, end = 0;
//        int x = 1, y = 1;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        while (end == 0) {
//            if (arr[x][y] == 2) { // 먹이 발견
//                arr[x][y] = ant;
//                end = 1;
//            }
//            else {
//                arr[x][y] = ant;
//                if (arr[x][y + 1] == 0) // 오른쪽 뚫림
//                    y++;
//                else if (arr[x][y + 1] == 1) { // 오른쪽 막힘
//                    if (arr[x + 1][y] == 1) // 아래도 막힘
//                        end = 1;
//                    else
//                        x++;
//                }
//            }
//        }
//        
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        } // 1099
 
    }
}