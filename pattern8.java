package patterns;
import java.util.Scanner;
public class pattern8 {
	public static void main(String[] args) {
//		   1
//		  232
//		 34543
//		4567645 
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1 ;
		while(i <= n) {
			
			int spaces = 1;
			while (spaces <= n-i) {
				System.out.print(" ");
				spaces ++;
			}
			
			
			int j = 1;
			int p = i;
			while(j <= i) {
				System.out.print(p);
				p++;
				j++;
			}
			
			j = 1;
			p = 2*i-2;
			while(j<=i-1) {
				System.out.print(p);
				j ++;
				p--;
			}
			
			System.out.println();
			i++;
	}

}
}