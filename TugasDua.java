import java.util.Scanner;

public class TugasDua {
    public static String[][] inputJadwal(int n) {
        Scanner sc = new Scanner(System.in);
        String[][] jadwal = new String[n][4];

        System.out.println("=== INPUT JADWAL KULIAH ===");
        for (int i = 0; i < n; i++) {
            System.out.println("- " + "Jadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari Kuliah : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam Kuliah : ");
            jadwal[i][3] = sc.nextLine();
            System.out.println();
        }
        return jadwal;
    }

    public static void tampilkanJadwal(String[][] jadwal) {
        System.out.println();
        System.out.println("=== SELURUH JADWAL KULIAH ===");
        System.out.printf("| %-3s | %-20s | %-10s | %-8s | %-12s |\n", "No", "Mata Kuliah", "Ruang", "Hari", "Jam");

        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("| %-3d | %-20s | %-10s | %-8s | %-12s |\n",
                    (i + 1),
                    jadwal[i][0],
                    jadwal[i][1],
                    jadwal[i][2],
                    jadwal[i][3]);
        }
    }

    public static void tampilkanHari(String[][] jadwal, String hari) {
        boolean ditemukan = false;

        System.out.println("=== JADWAL KULIAH HARI " + hari.toUpperCase() + " ===");
        System.out.printf("| %-3s | %-20s | %-15s | %-8s | %-12s |\n",
                "No", "Mata Kuliah", "Ruang", "Hari", "Jam");

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("| %-3d | %-20s | %-15s | %-8s | %-12s |\n",
                        (i + 1),
                        jadwal[i][0],
                        jadwal[i][1],
                        jadwal[i][2],
                        jadwal[i][3]);

                ditemukan = true;
            }

        }
        if (!ditemukan) {
            System.out.println("TIDAK ADA JADWAL");
        }
    }

    public static void tampilkanMatkul(String[][] jadwal, String Matkul) {
        boolean ditemukan = false;

        System.out.println("=== JADWAL KULIAH MATKUL " + Matkul.toUpperCase() + " ===");
        System.out.printf("| %-3s | %-20s | %-15s | %-8s | %-12s |\n",
                "No", "Mata Kuliah", "Ruang", "Hari", "Jam");

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(Matkul)) {
                System.out.printf("| %-3d | %-20s | %-15s | %-8s | %-12s |\n",
                        (i + 1),
                        jadwal[i][0],
                        jadwal[i][1],
                        jadwal[i][2],
                        jadwal[i][3]);

                ditemukan = true;
            }

        }
        if (!ditemukan) {
            System.out.println("TIDAK ADA JADWAL");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] jadwal;

        System.out.println("=== JUMLAH JADWAL PERKULIAHAN ===");
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println();

        jadwal = inputJadwal(n);
        tampilkanJadwal(jadwal);
        System.out.println();

        System.out.println("=== PILIH MENU ===");
        System.out.println("1. Cari berdasarkan hari");
        System.out.println("2. Cari berdasarkan mata kuliah ");
        System.out.print("Pilih menu (1/2): ");
        int menu = sc.nextInt();
        sc.nextLine();

        if (menu == 1) {
            System.out.print("Masukkan hari yang ingin dicari: ");
            String hariKuliah = sc.nextLine();
            tampilkanHari(jadwal, hariKuliah);

        } else if (menu == 2) {
            System.out.print("Masukkan nama matkul yang ingin dicari: ");
            String mataKuliah = sc.nextLine();
            tampilkanMatkul(jadwal, mataKuliah);
        }
    }
}
