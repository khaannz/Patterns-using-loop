package patterns;
import java.util.Scanner;
public class pattern9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int n1 = (n+1)/2;
		int n2 = n / 2;
		int i = 1;
		while (i <= n1) {
			int spaces = 1;
			while (spaces <= n1 -i) {
				System.out.print(" ");
				spaces++;
			}
			int j = 1;
			while (j <= 2*i - 1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;			
		}		
		int j = n2;
		while (j >= 1) {
			int spaces = 1;
			while(spaces <= n2-j+1) {
				System.out.print(" ");
				spaces++;
			}
			int k = 1;
			while(k <= 2*j-1 ){
				System.out.print("*");
				k++;
			}
			System.out.println();
			j--;
		}
			
	}
}
