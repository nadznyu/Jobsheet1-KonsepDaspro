import java.util.Scanner;

public class ArrayIPsemester {
    public static String konversiNilai(double nilaiAngka) {
        if (nilaiAngka > 80 && nilaiAngka <= 100) {
            return "A";
        } else if (nilaiAngka > 73 && nilaiAngka <= 80) {
            return "B+";
        } else if (nilaiAngka > 65 && nilaiAngka <= 73) {
            return "B";
        } else if (nilaiAngka > 60 && nilaiAngka <= 65) {
            return "C+";
        } else if (nilaiAngka > 50 && nilaiAngka <= 60) {
            return "C";
        } else if (nilaiAngka > 39 && nilaiAngka <= 50) {
            return "D";
        } else if (nilaiAngka <= 39) {
            return "E";
        } else {
            return "Nilai tidak valid";
        }
    }

    public static double nilaiSetara(String nilaiHuruf) {
        switch (nilaiHuruf) {
            case "A":
                return 4.00;
            case "B+":
                return 3.50;
            case "B":
                return 3.00;
            case "C+":
                return 2.50;
            case "C":
                return 2.00;
            case "D":
                return 1.00;
            case "E":
                return 0.00;
            default:
                return 0.00;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== MENGHITUNG IP SEMESTER ===");
        System.out.println();

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jmlMatkul = sc.nextInt();
        sc.nextLine();
        System.out.println();

        String[] namaMK = new String[jmlMatkul];
        String[] nilaiHuruf = new String[jmlMatkul];
        double[] nilaiAngka = new double[jmlMatkul];
        double[] nilaiSetara = new double[jmlMatkul];
        int[] sks = new int[jmlMatkul];

        System.out.println("=== INPUT PENDATAAN MATA KULIAH ===");
        for (int i = 0; i < jmlMatkul; i++) {
            System.out.println("Mata Kuliah ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah: ");
            namaMK[i] = sc.nextLine();
            System.out.print("Bobot SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Nilai angka: ");
            nilaiAngka[i] = sc.nextDouble();
            sc.nextLine();
            System.out.println();

            nilaiHuruf[i] = konversiNilai(nilaiAngka[i]);
            nilaiSetara[i] = nilaiSetara(nilaiHuruf[i]);

        }
        System.out.println("====================");
        System.out.println("HASIL KONVERSI NILAI");
        System.out.println("====================");

        System.out.printf("%-30s %-5s %-12s %-12s %-12s\n",
                "Mata Kuliah", "SKS", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalNilaiSKS = 0;
        int totalSKS = 0;

        for (int j = 0; j < jmlMatkul; j++) {
            String nilaiAngkaStr = String.format("%.1f", nilaiAngka[j]).replace(',', '.');

            System.out.printf("%-30s %-5d %-12s %-12s %-12.2f\n",
                    namaMK[j],
                    sks[j],
                    nilaiAngka[j],
                    nilaiHuruf[j],
                    nilaiSetara[j]);

            totalNilaiSKS += nilaiSetara[j] * sks[j];
            totalSKS += sks[j];
        }
        System.out.println();

        double ipSemester = totalNilaiSKS / totalSKS;
        System.out.printf("IP Semester: %.2f\n", ipSemester);
    }
}
