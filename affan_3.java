package affanP1;
import java.util.Scanner;

public class affan_3 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a number: ");
	        int n = scanner.nextInt();

	        for (int i = n - 1; i >= 0; i--) {
	            System.out.print(i + " ");
	        }
	    }
	}



