package com.adnan.projectpbo.layouts;

import java.util.Scanner;

import com.adnan.projectpbo.layouts.components.DeleteData;
import com.adnan.projectpbo.layouts.components.EditData;
import com.adnan.projectpbo.layouts.components.InsertData;
import com.adnan.projectpbo.layouts.components.ReadData;

public class Menu {
    public static void showMenu() {
        System.out.println();
        System.out.println("================================");
        System.out.println("WELCOME TO DB - CRUD OPERATIONS");
        System.out.println("================================");
        System.out.println("1.] Read Data");
        System.out.println("2.] Insert Data");
        System.out.println("3.] Edit Data");
        System.out.println("4.] Delete Data");
        System.out.println("5.] Exit");
        System.out.println("================================");
        System.out.print("Pilih: ");
        selectMenu();
    }

    public static void selectMenu() {
        Scanner sc = new Scanner(System.in);

        try {
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    ReadData.showReadData();
                    break;
                case 2:
                    InsertData.showInsertData();
                    break;
                case 3:
                    EditData.showEditData(null);
                    break;
                case 4:
                    DeleteData.showDeleteData();
                    break;
                case 5:
                    System.out.println("================================");
                    System.out.println("Terima Kasih...");
                    System.out.println("--------------------------------");
                    System.exit(0);
                default:
                    System.out.println("================================");
                    System.out.println("Maaf Menu yang Dipilih Tidak Ada");
                    System.out.println("--------------------------------");
                    showMenu();
            }
        } catch (Exception e) {
            System.out.println("================================");
            System.out.println("Maaf Inputan Error");
            System.out.println("--------------------------------");
            System.exit(0);
        }

        sc.close();
    }
}
