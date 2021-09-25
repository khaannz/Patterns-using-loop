package patterns;
import java.util.*;
public class pattern1 {

	public static void main(String[] args) {
//		1
//		1 2
//		1 2 3
//		1 2 3 4
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		
		int i = 1;
		while(i<=n) {
			int j = 1;
			while(j<=i) {
				System.out.print(j+" ");
				j +=1;
			}
			System.out.print("\n");
			i +=1;
		}
		

	}

}
