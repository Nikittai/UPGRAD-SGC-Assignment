
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int reverse = reverseNum(number);
		System.out.println(reverse);

	}
	public static int reverseNum(int num) {
		
		int n= num;
		int reverse = 0;
		while(n>0) {
		reverse = reverse*10 + n%10 ;
		if (reverse == Integer.MAX_VALUE%10 && n/10 >7) {
			return 0;
		}
		n=n/10;
		}
		return reverse;
	}

}
