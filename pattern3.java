package patterns;
import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 1;
		int val = 1;
		while(i <= n) {
			int s = 1;
			while (s <= (n-i)) {
				System.out.print(" ");
				s +=1;
			}
			int j = 1;
			while(j<=i) {
				System.out.print(val);
				val++;
				j++;
			}
			System.out.println();
			i +=1;
		}

	}

}
