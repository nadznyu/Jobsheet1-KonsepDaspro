import java.util.Scanner;

public class TugasSatu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char kodePlat[] = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char kota[][] = {
                { 'B', 'A', 'N', 'T', 'E', 'N' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'B', 'O', 'G', 'O', 'R' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' },
                { 'T', 'E', 'G', 'A', 'L' },
        };

        System.out.print("Masukkan kode plat: ");
        char inputKode = sc.next().charAt(0);

        boolean ditemukan = false;
        int indexKode = -1;

        for (int i = 0; i < 10; i++) {
            if (kodePlat[i] == inputKode) {
                ditemukan = true;
                indexKode = i;
                break;
            }
        }
        if (ditemukan == true) {
            System.out.print("Nama kota: ");

            for (int j = 0; j < kota[indexKode].length; j++) {
                if (kota[indexKode][j] != '\0') {
                    System.out.print(kota[indexKode][j]);
                }
            }
            System.out.println();
        } else {
            System.out.println("Kota tidak ditemukan");
        }
    }
}
