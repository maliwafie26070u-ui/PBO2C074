// Nama file: Mahasiswa.java
public class Mahasiswa {
    String nama;
    int umur;

    // Konstruktor sederhana
    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }

    public static void main(String[] args) {
        // Membuat objek menggunakan konstruktor
        Mahasiswa mhs1 = new Mahasiswa("Budi", 20);
        mhs1.tampilkanData();
    }
}
