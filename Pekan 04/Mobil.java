// Nama file: Mobil.java
public class Mobil {

    // Modifier: private (hanya bisa diakses dalam class ini)
    private String merk;
    private int tahun;

    // Modifier: public (bisa diakses dari mana saja)
    public Mobil(String merk, int tahun) {
        // this keyword digunakan untuk membedakan variabel instance dan parameter
        this.merk = merk;
        this.tahun = tahun;
    }

    // Konstruktor tanpa parameter (overloading constructor)
    public Mobil() {
        this("Tidak diketahui", 0); // memanggil konstruktor lain
    }

    // Method dengan modifier public
    public void tampilkanInfo() {
        System.out.println("Merk: " + this.merk);
        System.out.println("Tahun: " + this.tahun);
    }

    // Method dengan modifier private
    private void pesanRahasia() {
        System.out.println("Ini method private!");
    }

    public static void main(String[] args) {
        // Membuat objek dengan konstruktor berparameter
        Mobil m1 = new Mobil("Toyota", 2022);
        m1.tampilkanInfo();

        System.out.println();

        // Membuat objek dengan konstruktor default
        Mobil m2 = new Mobil();
        m2.tampilkanInfo();
    }
}
