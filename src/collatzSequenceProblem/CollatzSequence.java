package collatzSequenceProblem;

import java.util.Scanner;

public class CollatzSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);  
		int N=sc.nextInt();   
		int n=N;  
		System.out.print(N+" "); 
		while (n != 1)   
		{  
			if (n % 2 == 0) {
				n = n / 2;   
			}
			else {
				n = 3 * n + 1;  
			}
			System.out.print(n +" ");  
		}  
		System.out.print(N); 
	}

}
