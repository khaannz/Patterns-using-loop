package patterns;
import java.util.Scanner;
public class pattern4 {
	public static void main(String[] args) {
		/* 1
		   23
		   345
		   4567 */
		
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        while(i <= n){
            int val = i;
            int j=1;
            while (j <= i){
                System.out.print(val);
                val += 1;
                j += 1;
            }
            System.out.println();
            i += 1;
        }
		
	}

}
