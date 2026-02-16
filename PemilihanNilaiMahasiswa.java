import java.util.Scanner;

public class PemilihanNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        double nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double nilaiUAS = sc.nextDouble();
        System.out.println("==============================");

        if (nilaiTugas < 0 || nilaiTugas > 100) {
            System.out.println("nilai tidak valid");
        } else if (nilaiKuis < 0 || nilaiKuis > 100) {
            System.out.println("nilai tidak valid");
        } else if (nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("nilai tidak valid");
        } else if (nilaiUTS < 0 || nilaiUTS > 100) {
            System.out.println("nilai tidak valid");
        } else {
            double nilaiAkhir = (nilaiTugas * 0.20) + (nilaiKuis * 0.20) + (nilaiUAS * 0.30) + (nilaiUTS * 0.30) / 4;
            System.out.println("Nilai Akhir: " + nilaiAkhir);

            int NilaiHuruf = (int) nilaiAkhir;
            String pesan;
            if (NilaiHuruf >= 80 && NilaiHuruf <= 100) {
                pesan = "A";
            } else if (NilaiHuruf > 73 && NilaiHuruf <= 80) {
                pesan = "B+";
            } else if (NilaiHuruf > 65 && NilaiHuruf <= 73) {
                pesan = "B";
            } else if (NilaiHuruf > 60 && NilaiHuruf <= 65) {
                pesan = "C+";
            } else if (NilaiHuruf > 50 && NilaiHuruf <= 60) {
                pesan = "C";
            } else if (NilaiHuruf > 39 && NilaiHuruf <= 50) {
                pesan = "D";
            } else {
                pesan = "E";
            }
            System.out.println("Nilai Huruf: " + pesan);
            System.out.println("==============================");
            System.out.println("==============================");

            String StatusSemester = " ";
            if (nilaiAkhir >= 60 && nilaiAkhir <= 100) {
                StatusSemester = "SELAMAT ANDA LULUS";
            } else {
                StatusSemester = "ANDA TIDAK LULUS";
            }

            System.out.println(StatusSemester);

        }

    }

}
