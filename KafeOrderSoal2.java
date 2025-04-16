import java.util.Scanner; // Import Scanner dari java.util

public class KafeOrderSoal2 { // Class KafeOrderSoal2
    public static void main(String[] args) { // Method main 
        Scanner input = new Scanner(System.in); // Membuat objek input dari class Scanner

        // Array Data menu makanan dan harganya
        String[] menu = {"Nasi Goreng",
                         "Mie Goreng", 
                         "Roti Bakar", 
                         "Kentang Goreng", 
                         "Teh Tarik", 
                         "Cappucino", 
                         "Chocolate Ice"}; // Array untuk menyimpan nama menu
        int[] harga = {20000, 15000, 12000, 10000, 8000, 20000, 25000}; // Array untuk menyimpan harga menu 

        
        int[] jumlahPesanan = new int[menu.length];  // Array untuk menyimpan jumlah pesanan setiap menu
        int pilihan; // Variabel untuk menyimpan pilihan menu

        System.out.println("=== Selamat Datang di Kafe ==="); // Output Selamat Datang di Kafe   
        

        do { // bisa menjalankan perulangan berulangkali - kali sampai kita memilih untuk berhenti
            // Menu Utama
            System.out.println("\nPilih Menu Utama berikut:");
            System.out.println("1. Tambah Pesanan"); 
            System.out.println("2. Lihat Daftar Pesanan");
            System.out.println("3. Hitung Total Biaya");
            System.out.println("4. Selesai");
            System.out.print("Masukkan pilihan Anda: "); 
            pilihan = input.nextInt(); // Input pilihan menu


            switch (pilihan) {  // Switch case untuk memilih menu
                case 1: // Case 1 untuk menambah pesanan
                // Lihat Daftar Menu
                System.out.println("\n=== DAFTAR MENU ==="); 
                    for (int i = 0; i < menu.length; i++) {  // Looping untuk menampilkan menu
                        System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]); // Menampilkan menu dan harga
                    }
                    System.out.print("Masukkan nomor menu yang ingin dipesan: ");
                    int nomorMenu = input.nextInt();
                    if (nomorMenu < 1 || nomorMenu > menu.length) { // Jika nomor menu tidak valid
                        System.out.println("Menu tidak valid!");
                    } else { // Jika nomor menu valid
                        System.out.print("Masukkan jumlah pesanan: ");
                        int jumlah = input.nextInt();
                        System.out.println(" ");
                        jumlahPesanan[nomorMenu - 1] += jumlah; // Menambahkan jumlah pesanan
                        System.out.println(jumlah + " " + menu[nomorMenu - 1] + " berhasil ditambahkan ke pesanan.");
                    }
                    break; // Break untuk menghentikan case 1
                case 2: //
                    // Lihat Daftar Pesanan
                    System.out.println("\n=== Daftar Pesanan ===");
                    boolean Pesanan = false; // Boolean untuk mengecek apakah ada pesanan atau tidak
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

                case 3: // Case 3 untuk menghitung total biaya
                    // Hitung Total Biaya
                    int totalBiaya = 0;
                    System.out.println("\n=== Total Biaya ===");
                    for (int i = 0; i < menu.length; i++) { // Looping untuk menghitung total biaya
                        if (jumlahPesanan[i] > 0) {
                            int biaya = jumlahPesanan[i] * harga[i];
                            System.out.println(menu[i] + " x " + jumlahPesanan[i] + " = Rp" + biaya);
                            totalBiaya += biaya;
                        }
                    }
                    System.out.println("Total Biaya: Rp" + totalBiaya);

                    break;

                case 4:
                    // Keluar dari pemograman
                    System.out.println("\nTerima kasih! Selamat tinggal.");
                    System.out.println(" ");
                    break;

                default: // Default jika pilihan tidak valid
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while(pilihan != 4); // Perulangan akan berhenti jika pilih = 4

        input.close();
    }
}