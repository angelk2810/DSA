import java.util.*;

public class SmallestPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int num = n + 1;

        while (count < 5) {
            boolean isPrime = true;

            if (num < 2) {
                isPrime = false;
            } else {
                for (int i = 2; i * i <= num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(num);
                count++;
            }

            num++;
        }
    }
}