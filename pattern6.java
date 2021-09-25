package patterns;
import java.util.Scanner;
public class pattern6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
        int n = scan.nextInt();
        int i = 1;
        int k = 1;
        while (i <= n){
            int spaces = 1;
            while (spaces <= n-i){
                System.out.print(" ");
                spaces += 1;
            }
            int j = 1;
            while (j <= k){
                System.out.print("*");
                j++;
            }
            k +=2;
            System.out.println();
            i += 1;
        }
			
		}

	}
