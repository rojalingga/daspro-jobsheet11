package Pertemuan13;

import java.util.Scanner;

public class Percobaan6_20 {
    static int hitungLuas (int pjg, int lb){
        int Luas=pjg*lb;
        return Luas;
    }

    static int hitungVolume (int tinggi, int a, int b){
        int volume=hitungLuas(a,b)*tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int panjang,lebar,tinggi;

        System.out.print("Masukkan panjang : ");
        panjang = input.nextInt();
        System.out.print("Masukkan lebar : ");
        lebar = input.nextInt();
        System.out.print("Masukkan tinggi : ");
        tinggi = input.nextInt();
        
        System.out.println("Luas Persegi Panjang adalah "+ hitungLuas(panjang, lebar));
        System.out.println("Volume Balok adalah "+ hitungVolume(tinggi, panjang, lebar));
    }
}
