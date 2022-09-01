package logicalprogram;

import java.util.Scanner;

public class Amstongnumber {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();int b=a;int c=b;
	int count=0;
	int sum=0;
	while (a>0) {
		count++;
		a=a/10;
}
	while (b>0) {
		int d=b%10;
		sum =(int)(sum *10+Math.pow(d, count));
	}
	if (sum==c) {
		System.out.println("its amstrong number");
	}
	else {
		System.out.println("its not palidrome number");
	}
}
}
