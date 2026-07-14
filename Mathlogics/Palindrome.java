import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int original = n;
        while (n > rev) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println(n == rev || n == rev / 10);
        sc.close();
    }
}
