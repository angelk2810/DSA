import java.util.Scanner;
public class Pattern_6{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
     for (int i = 0; i < a; i++) {
            for (int j = a; j > i; j--) {
                System.out.print((a- j + 1) + " ");
            }
            System.out.println();
  }
  sc.close(); 
} 
}

