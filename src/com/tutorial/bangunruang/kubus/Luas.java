package com.tutorial.bangunruang.kubus;

import java.util.Scanner;

public class Luas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int sisi;
            double hasil;

            System.out.println("Program Menghitung Luas Kubus");
            System.out.println("=============================");

            // logic
            System.out.print("Masukan sisi kubus: ");
            sisi = input.nextInt();

            // hitung luas kubus;
            hasil = 6 * (sisi * sisi);

            System.out.println("Luas Kubus adalah " + hasil + " cm2");
        } finally {
            input.close();
        }
    }
}
