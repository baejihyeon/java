package algorithm_study.codeup;

import java.util.Scanner;

public class Problem_1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x;
		String a[];
		x = sc.nextLine();
		a = x.split("\\.");
	
		int a1 = Integer.parseInt(a[0]);
		int a2 = Integer.parseInt(a[1]);
		int a3 = Integer.parseInt(a[2]);
		System.out.printf("%04d.%02d.%02d",a1,a2,a3);
	}
}
