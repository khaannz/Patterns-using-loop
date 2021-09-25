package patterns;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
//		1 
//		2 3 
//		4 5 6
//		7 8 9 10
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		
		int i = 1;
		int val = 1;
		while(i<=n) {
			int j = 1;
			while (j <= i) {
				System.out.print(val+" ");
				val += 1;
				j += 1;
			} 
			System.out.print("\n");
			i += 1;
			
		}

	}

}
