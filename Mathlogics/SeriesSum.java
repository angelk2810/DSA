import java.util.*;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long digit = sc.nextLong();
        int n = sc.nextInt();
        long term = 0;
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            term = term * 10 + digit;
            sum += term;
            System.out.print(term);
            if (i < n) {
                System.out.print(" + ");
            }
        }

        System.out.println();
        System.out.print(sum);
    }
}