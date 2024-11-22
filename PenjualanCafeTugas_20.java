package Pertemuan13;
import java.util.Scanner;

public class PenjualanCafeTugas_20 {
    static int[][] jmlPenjualan;
    static String[] namaMenu;

    public static void inputDataPenjualan() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < jmlPenjualan.length; i++) {
            System.out.println("Masukkan Jumlah Penjualan untuk " +namaMenu[i]+ " : ");
            for (int j = 0; j < jmlPenjualan[i].length; j++) {
                System.out.print("Hari ke-" + (j+1) + " : ");
                jmlPenjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void inputDataMenu(int jmlMenu) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < jmlMenu; i++) {
            System.out.print("Masukkan menu ke-" +(i+1)+ " : ");
            namaMenu[i] = sc.nextLine();
        }
        
    }

    public static void tampilkanData(int jmlHari) {
        System.out.println("Data Jumlah Penjualan : ");
        System.out.print("Menu\t");
        for (int i = 0; i < jmlHari; i++) {
            System.out.print("\tH"+ (i+1));
        }
        System.out.println();
        for (int i = 0; i < jmlPenjualan.length; i++) {
            System.out.print(namaMenu[i] + "\t");
            if (namaMenu[i].length() < 8)
                System.out.print("\t");
            for (int j = 0; j < jmlPenjualan[i].length; j++) {
                System.out.print(jmlPenjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void penjualanTertinggi() {
        int maxTotal = 0;
        String maxMenu = "";

        for (int i = 0; i < jmlPenjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < jmlPenjualan[i].length; j++) {
                total += jmlPenjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                maxMenu = namaMenu[i];
            }
        }

        System.out.println("Menu dengan penjualan tertinggi: " + maxMenu);
        System.out.println("Total penjualan: " + maxTotal);
        System.out.println();
    }

    public static void rataRataPerMenu() {
        for (int i = 0; i < jmlPenjualan.length; i++) {
            double total = 0;
            for (int j = 0; j < jmlPenjualan[i].length; j++) {
                total += jmlPenjualan[i][j];
            }
            double rata = total / jmlPenjualan[i].length;
            System.out.printf("Rata-rata penjualan menu %s dalam %d hari: %.2f%n", namaMenu[i], jmlPenjualan[i].length, rata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu : ");
        int jmlMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari : ");
        int jmlHari = sc.nextInt();
        System.out.println();

        jmlPenjualan = new int[jmlMenu][jmlHari];
        namaMenu = new String[jmlMenu];

        inputDataMenu(jmlMenu);
        inputDataPenjualan();
        tampilkanData(jmlHari);
        penjualanTertinggi();
        rataRataPerMenu();
    }
}
