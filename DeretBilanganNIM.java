import java.util.Scanner;

public class DeretBilanganNIM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM : ");
        long NIM = sc.nextLong();

        int n = (int)(NIM % 100);

        if (n < 10) {
            n = n + 10;
        }

        System.out.println("n = " + n);
        System.out.println("Output: ");
        
        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            }
            if (i % 3 == 0) {
                System.out.print("# ");
            }
            else if (i % 2 == 1) {
                System.out.print("* ");
            }
            else {
                System.out.print(i + " ");
            }
        }
    }
    
}
