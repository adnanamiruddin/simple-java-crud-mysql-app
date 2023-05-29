package com.adnan.projectpbo.layouts;

import java.util.Scanner;

import com.adnan.projectpbo.controllers.DbController;

public class InsertData {
    public static void showInsertData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("Silahkan Input Data Produk");
        System.out.println("================================");

        System.out.print("Nama Produk : ");
        String name = sc.nextLine();
        System.out.print("Harga : ");
        long harga = sc.nextLong();
        System.out.print("Stok : ");
        int stok = sc.nextInt();
        System.out.println("================================");

        if (DbController.insertData(name, harga, stok)) {
            System.out.println("Berhasil Insert Data");
        } else {
            System.out.println("Gagal Insert Data");
        }

        System.out.println("--------------------------------");
        Menu.showMenu();
        sc.close();
    }
}
