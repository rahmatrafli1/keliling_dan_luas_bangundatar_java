package com.tutorial.bangunruang.balok;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int panjang, lebar, tinggi;
            double hasil;

            System.out.println("Program Menghitung Volume Balok");
            System.out.println("=============================");

            // logic
            System.out.print("Masukan Panjang Balok: ");
            panjang = input.nextInt();
            System.out.print("Masukan Lebar balok: ");
            lebar = input.nextInt();
            System.out.print("Masukan Tinggi Balok: ");
            tinggi = input.nextInt();

            // hitung volume balok;
            hasil = panjang * lebar * tinggi;

            System.out.println("Volume Balok tersebut adalah: " + hasil);
        } finally {
            input.close();
        }
    }
}
