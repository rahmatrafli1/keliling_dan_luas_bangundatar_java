package com.tutorial.bangunruang.kubus;

import java.util.Scanner;

public class Keliling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int sisi;
            double hasil;

            System.out.println("Program Menghitung Keliling Kubus");
            System.out.println("=============================");

            // logic
            System.out.print("Masukan sisi kubus: ");
            sisi = input.nextInt();

            // hitung keliling kubus;
            hasil = 12 * sisi;

            System.out.println("Keliling Kubus adalah " + hasil + " cm");
        } finally {
            input.close();
        }
    }
}
