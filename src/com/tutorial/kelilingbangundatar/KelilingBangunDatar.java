package com.tutorial.kelilingbangundatar;

import java.util.Scanner;

public class KelilingBangunDatar {
    private static int HitungKelilingPersegi(int sisi) {
        // Rumus Keliling Persegi = 4 * sisi
        int keliling = 4 * sisi;
        return keliling;
    }

    private static int HitungKelilingPersegiPanjang(int panjang, int lebar) {
        // Rumus Keliling Persegi Panjang = 2 * (panjang + lebar)
        int keliling = 2 * (panjang + lebar);
        return keliling;
    }

    private static double HitungKelilingSegitiga(int a, int b, int c) {
        // Rumus Keliling Segitiga = a + b + c
        double keliling = a + b + c;
        return keliling;
    }

    private static double HitungKelilingLingkaran(int diameter) {
        // Rumus keliling Lingkaran = 2 * phi * r
        // r = 1/2 * diamter (jari-jari)
        // phi bisa 22/7 dan 3.14
        double r = 0.5 * diameter;
        double keliling = 0;
        if (r % 7 == 0) {
            keliling = 2 * 22 * (r / 7);
        } else {
            keliling = 2 * 3.14 * r;
        }
        return keliling;
    }

    private static boolean CekValue(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        // Pilihan untuk hitung luas
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Silahkan keliling apa yang akan anda hitung !");
            System.out.println("A. Persegi");
            System.out.println("B. Persegi Panjang");
            System.out.println("C. Segitiga");
            System.out.println("D. Lingkaran");
            System.out.println();
            System.out.print("Masukan pilihan anda : ");
            String choise = input.nextLine();
            System.out.println("=================================================");
            switch (choise.toLowerCase()) {
                case "a":
                    System.out.println("Menghitung Keliling Persegi");
                    System.out.print("Masukan Nilai Sisi : ");
                    String sisi = input.nextLine();
                    if (CekValue(sisi)) {
                        int s = Integer.parseInt(sisi);
                        int keliling = HitungKelilingPersegi(s);
                        System.out.println("Keliling Persegi anda : " + keliling);
                    } else {
                        System.out.println("Nilai yang anda masukan harus integer");
                    }
                    break;
                case "b":
                    System.out.println("Menghitung Keliling Persegi Panjang");
                    System.out.print("Masukan Nilai Panjang : ");
                    String panjang = input.nextLine();
                    System.out.print("Masukan Nilai Lebar : ");
                    String lebar = input.nextLine();
                    if (CekValue(panjang) && CekValue(lebar)) {
                        int p = Integer.parseInt(panjang);
                        int l = Integer.parseInt(lebar);
                        int keliling = HitungKelilingPersegiPanjang(p, l);
                        System.out.println("Keliling Persegi Panjang anda : " + keliling);
                    } else {
                        System.out.println("Nilai yang anda masukan harus integer");
                    }
                    break;
                case "c":
                    System.out.println("Menghitung Keliling Segitiga");
                    System.out.print("Masukan Nilai a : ");
                    String a = input.nextLine();
                    System.out.print("Masukan Nilai b : ");
                    String b = input.nextLine();
                    System.out.print("Masukan Nilai c : ");
                    String c = input.nextLine();
                    if (CekValue(a) && CekValue(b) && CekValue(c)) {
                        int alas1 = Integer.parseInt(a);
                        int alas2 = Integer.parseInt(b);
                        int alas3 = Integer.parseInt(c);
                        double keliling = HitungKelilingSegitiga(alas1, alas2, alas3);
                        System.out.println("Keliling Segitiga anda : " + keliling);
                    } else {
                        System.out.println("Nilai yang anda masukan harus integer");
                    }
                    break;
                case "d":
                    System.out.println("Menghitung Keliling Lingkaran");
                    System.out.print("Masukan Nilai Diamter : ");
                    String diameter = input.nextLine();
                    if (CekValue(diameter)) {
                        int d = Integer.parseInt(diameter);
                        double keliling = HitungKelilingLingkaran(d);
                        System.out.println("Keliling Lingkaran anda : " + keliling);
                    } else {
                        System.out.println("Nilai yang anda masukan harus integer");
                    }
                    break;
                default:
                    System.out.println("WARNING : Pilihan anda tidak terdaftar");
            }

            System.out.println("=================================================");

        } finally {
            input.close();
        }
    }
}
