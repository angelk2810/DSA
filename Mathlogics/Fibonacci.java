import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("Invalid input");
        }
        long a=0;
        long b=1;
        
        for(int i=0; i<n; i++){
            System.out.print(a + ",");
            long next=a+b;
            a=b;
            b=next;
        }
    }
}