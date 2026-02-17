import java.util.Scanner;

public class RoyalGarden {
    public static int hitungPendapatan(int Aglonema, int Keladi, int Alocasia, int Mawar) {
        int hargaAglonema = 75000;
        int hargaKeladi = 50000;
        int hargaAlocasia = 60000;
        int hargaMawar = 10000;

        int totalPendapatan = (Aglonema * hargaAglonema) + (Keladi * hargaKeladi) + (Alocasia * hargaAlocasia)
                + (Mawar * hargaMawar);
        return totalPendapatan;
    }

    public static void StatusCabang(int pendapatan) {
        if (pendapatan > 1500000) {
            System.out.println("Status : Sangat baik");
        } else {
            System.out.println("Status : Perlu evaluasi");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaAglonema = 75000;
        int hargaKeladi = 50000;
        int hargaAlocasia = 60000;
        int hargaMawar = 10000;

        String namaCabang[] = new String[4];
        namaCabang[0] = "RoyalGarden 1";
        namaCabang[1] = "RoyalGarden 2";
        namaCabang[2] = "RoyalGarden 3";
        namaCabang[3] = "RoyalGarden 4";

        int[][] stockBunga = new int[4][4];

        // Royal Garden 1
        stockBunga[0][0] = 10; // Aglonema
        stockBunga[0][1] = 5; // Keladi
        stockBunga[0][2] = 15; // Alocasia
        stockBunga[0][3] = 7; // Mawar

        // Royal Garden 2
        stockBunga[1][0] = 6; // Aglonema
        stockBunga[1][1] = 11; // Keladi
        stockBunga[1][2] = 9; // Alocasia
        stockBunga[1][3] = 12; // Mawar

        // Royal Garden 3
        stockBunga[2][0] = 2; // Aglonema
        stockBunga[2][1] = 10; // Keladi
        stockBunga[2][2] = 10; // Alocasia
        stockBunga[2][3] = 5; // Mawar

        // Royal Garden 4
        stockBunga[3][0] = 5; // Aglonema
        stockBunga[3][1] = 7; // Keladi
        stockBunga[3][2] = 12; // Alocasia
        stockBunga[3][3] = 9; // Mawar

        System.out.println("===== TOKO BUNGA ROYAL GARDEN =====");
        System.out.println();
        System.out.println("PENDAPATAN JIKA BUNGA HABIS TERJUAL");
        for (int i = 0; i < 4; i++) {
            System.out.println(namaCabang[i]);
            int pendapatan = hitungPendapatan(stockBunga[i][0], stockBunga[i][1], stockBunga[i][2], stockBunga[i][3]);

            System.out.println("Total Pendapatan: Rp." + pendapatan);
            StatusCabang(pendapatan);
            System.out.println();
        }

    }

}
