# App.java

Di dalam file (class) 'App.java' terdapat object main method yang isinya
Menu.showMenu() yang memanggil method static dari class Menu.

Menu.showMenu();
Akan print menu/list yang isinya Read Data, Insert Data, Edit Data,
Delete Data, maupun Exit dari program yang looping.

# com/adnan/projectpbo

Terdapat beberapa package/folder, yaitu:

1. config
2. controllers
3. layouts
4. models

## 1. config

DbConnect: Class untuk menghubungkan Java dengan MySQL (phpmyadmin)

## 2. controllers

DbController: Class yang memiliki method-method logic pengontrol operasi
CRUD dari koneksi database sebelumnya di DbConnect menuju layouts.
Sederhananya, inilah class yang berperan sebagai penghubung.

## 3. layouts

Di dalam package/folder layouts, terdapat lagi package/folder components
dan 1 class di luar package/folder components yaitu class Menu.

### 3.1. components

1. DeleteData: Class untuk menampilkan print output menu hapus data
   yang ada di database dari class Menu.
2. EditData: Class yang berisikan menu lagi, yaitu:
   a. Edit nama produk
   b. Edit harga produk
   c. Edit stok produk
   yang berfungsi untuk meng-update/mengubah data yang ada di database.
3. InsertData: Class yang berfungsi untuk menginput data produk baru
   dan memasukkannya ke database.
4. ReadData: Class yang berperan untuk menampilkan semua produk yang
   ada di database.

### 3.2. Menu

Menu: Class ini berada di luar package/folder components. Class ini akan
menampilkan menu secara keseluruhan dan memanggil method-method static
dari class components seusai dengan request input dari user.

## 4. models

Produk: Sesuai package/foldernya, class ini berperan sebagai model untuk Java
yang mana atribut-atributnya menggambarkan kolom-kolom tb_produk yang ada
di database. Salah satu peran dari model ini adalah pada method
getProdukByNama(String nama) yang ada pada class DbController,
di mana method tersebut akan me-return model Produk ini.
