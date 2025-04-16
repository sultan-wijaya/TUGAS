PENJELASAN
Saya membuat WEB ini untuk memesan di cafe dan pengguna bisa melihat Menu, Harga, dan Total harga

1. Import Library
   * Program mengimport Scanner dari pustka java. util untuk memungkinkan pengguna memasukkan data melalui keyboard.

           import java.util.Scanner;

2. Deklarasi Kelas dan Method main

        public class KafeOrderSoal2 {
        public static void main(String[] args) {
    
    * public class KafeOrderSoal2 → Mendeklarasikan kelas dengan nama KafeOrderSoal2.
    * public static void main(String[] args) → Method utama yang akan dieksekusi pertama kali saat program dijalankan.

3. Membuat Scanner untuk Input Pengguna

        Scanner input = new Scanner(System.in);

Membuat objek input dari Scanner untuk membaca input pengguna.
    
4. Deklarasi Menu dan Harga

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {20000, 15000, 12000, 10000, 8000, 20000, 25000};

* Array menu[] menyimpan daftar nama makanan/minuman yang tersedia.
* Array harga[] menyimpan harga masing-masing menu berdasarkan indeks yang sama dengan array menu[].

        int[] jumlahPesanan = new int[menu.length];
    
* Array jumlahPesanan[] menyimpan jumlah pesanan untuk setiap menu.

        int pilihan;

* Variabel pilihan digunakan untuk menyimpan pilihan pengguna di menu utama.

5. Menampilkan Menu Utama dan Perulangan

        System.out.println("=== Selamat Datang di Kafe ===");
    
Menampilkan pesan selamat datang.

    do {

Menggunakan perulangan do-while agar program terus berjalan sampai pengguna memilih untuk keluar (pilihan == 4).

    System.out.println("\nPilih Menu Utama berikut:");
    System.out.println("1. Tambah Pesanan");
    System.out.println("2. Lihat Daftar Pesanan");
    System.out.println("3. Hitung Total Biaya");
    System.out.println("4. Selesai");
    System.out.print("Masukkan pilihan Anda: ");
    pilihan = input.nextInt();

* Menampilkan daftar menu utama untuk dipilih oleh pengguna.
* Menggunakan input.nextInt(); untuk membaca pilihan pengguna.
    
6. Switch Case untuk Mengolah Pilihan Pengguna

Program menggunakan switch-case untuk menangani setiap pilihan pengguna.

    Case 1: Tambah Pesanan
    
    case 1:
    System.out.println("\n=== DAFTAR MENU ===");
    for (int i = 0; i < menu.length; i++) {
        System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
    }
    System.out.print("Masukkan nomor menu yang ingin dipesan: ");
    int nomorMenu = input.nextInt();
    
    * Menampilkan daftar menu beserta harganya.
    * Pengguna memasukkan nomor menu yang ingin dipesan.

    if (nomorMenu < 1 || nomorMenu > menu.length) {
    System.out.println("Menu tidak valid!");
    } else {
    System.out.print("Masukkan jumlah pesanan: ");
    int jumlah = input.nextInt();
    jumlahPesanan[nomorMenu - 1] += jumlah;
    System.out.println(jumlah + " " + menu[nomorMenu - 1] + " berhasil ditambahkan ke pesanan.");
    }

* Memeriksa apakah nomor menu valid.
* Jika valid, pengguna memasukkan jumlah pesanan dan program menyimpannya ke dalam array jumlahPesanan[].

    Case 2: Lihat Daftar Pesanan

        case 2:
        System.out.println("\n=== Daftar Pesanan ===");
        boolean Pesanan = false;
        for (int i = 0; i < menu.length; i++) {
        if (jumlahPesanan[i] > 0) {
            System.out.println(menu[i] + " x " + jumlahPesanan[i]);
            Pesanan = true;
            }
        }
        if (!Pesanan) {
        System.out.println("Belum ada pesanan.");
        }
        break;
    
    Menampilkan daftar pesanan yang sudah ditambahkan sebelumnya.
    Jika tidak ada pesanan, program menampilkan pesan "Belum ada pesanan."

    Case 3: Hitung Total Biaya

        case 3:
            int totalBiaya = 0;
              System.out.println("\n=== Total Biaya ===");
              for (int i = 0; i < menu.length; i++) {
        if (jumlahPesanan[i] > 0) {
            int biaya = jumlahPesanan[i] * harga[i];
            System.out.println(menu[i] + " x " + jumlahPesanan[i] + " = Rp" + biaya);
            totalBiaya += biaya;
            }
        }
        System.out.println("Total Biaya: Rp" + totalBiaya);
        break;

* Menghitung total biaya berdasarkan jumlah pesanan yang dibuat pengguna.
* Menampilkan rincian biaya setiap pesanan dan total keseluruhan.

    Case 4: Selesai

        case 4:
        System.out.println("\nTerima kasih! Selamat tinggal.");
        break;

    Menampilkan pesan perpisahan dan keluar dari program.
    
    Default: Pilihan Tidak Valid

        default:
        System.out.println("Pilihan tidak valid. Silakan coba lagi.");

    Jika pengguna memasukkan angka selain 1-4, program akan menampilkan pesan error.

7. Perulangan do-while Berhenti Jika Pilihan = 4

        } while(pilihan != 4);

* Program akan terus berjalan hingga pengguna memilih opsi 4 (Selesai).

        input.close();

* Menutup Scanner untuk mencegah kebocoran memori.


Kesimpulan

Program ini adalah simulasi sistem pemesanan sederhana di kafe. Pengguna bisa:

1. Menambah pesanan dari daftar menu.
2. Melihat pesanan yang telah dibuat.
3. Menghitung total biaya berdasarkan jumlah pesanan.
4. Keluar dari program setelah selesai.
