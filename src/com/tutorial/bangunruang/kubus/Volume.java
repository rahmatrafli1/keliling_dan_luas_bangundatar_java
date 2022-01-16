package com.tutorial.bangunruang.kubus;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int sisi;
            double hasil;

            System.out.println("Program Menghitung Volume Kubus");
            System.out.println("=============================");

            // logic
            System.out.print("Masukan sisi kubus: ");
            sisi = input.nextInt();

            // hitung volume kubus;
            hasil = sisi * sisi * sisi;

            System.out.println("Volume Kubus adalah " + hasil + " cm3");
        } finally {
            input.close();
        }
    }
}
