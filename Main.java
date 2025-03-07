class Perusahaan {
    // Atribut final untuk menyimpan nama perusahaan
    private final String namaPerusahaan;

    // Konstruktor untuk inisialisasi nama perusahaan
    public Perusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    // Method untuk mendapatkan nama perusahaan
    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }
}

class Karyawan {
    // Atribut untuk menyimpan nama karyawan
    private String nama;
    // Atribut untuk menyimpan gaji pokok karyawan
    private double gajiPokok;
    // Atribut referensi ke objek Perusahaan (association)
    private Perusahaan perusahaan;

    // Konstruktor untuk inisialisasi karyawan
    public Karyawan(String nama, double gajiPokok, Perusahaan perusahaan) {
        setNama(nama); // Validasi nama dilakukan di setter
        this.gajiPokok = gajiPokok;
        this.perusahaan = perusahaan;
    }

    // Setter untuk nama dengan validasi minimal 4 karakter
    public void setNama(String nama) {
        if (nama.length() >= 4) {
            this.nama = nama;
        } else {
            throw new IllegalArgumentException("nama harus memiliki minimal 4 karakter");
        }
    }

    // Getter untuk mendapatkan nama karyawan
    public String getNama() {
        return nama;
    }

    // Getter untuk mendapatkan gaji pokok karyawan
    public double getGajiPokok() {
        return gajiPokok;
    }

    // Getter untuk mendapatkan perusahaan tempat karyawan bekerja
    public Perusahaan getPerusahaan() {
        return perusahaan;
    }

    // Method untuk menampilkan informasi karyawan
    public void info() {
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Gaji Pokok    : " + gajiPokok);
        System.out.println("Perusahaan    : " + perusahaan.getNamaPerusahaan());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek perusahaan
        Perusahaan perusahaan = new Perusahaan("PT Filkom abadi jaya");
        
        // Membuat objek karyawan yang bekerja di perusahaan tersebut
        Karyawan karyawan1 = new Karyawan("Alip", 7000000, perusahaan);
        Karyawan karyawan2 = new Karyawan("Agus", 5000000, perusahaan);
        
        // Menampilkan informasi karyawan
        karyawan1.info();
        karyawan2.info();
    }
}
