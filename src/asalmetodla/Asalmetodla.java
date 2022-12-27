/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asalmetodla;

import java.util.Scanner;

public class Asalmetodla {

    public static boolean asalSayi(int sayi) {
        boolean sonuc = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % 2 == 0) {
                sonuc = false;
            }
        }
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Lütfen sayıyı giriniz: ");
        int sayi = giris.nextInt();
        boolean sonuc = asalSayi(sayi);
        if (sonuc == false) {
            System.out.println("Sayi asal değil." + sonuc);
        } else {
            System.out.println("Sayi asal." + sonuc);
        }
    }
}
