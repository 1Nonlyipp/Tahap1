class Perusahaan {
    private final String namaPerusahaan;

    public Perusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }
}

class Karyawan {
    private String nama;
    private double gajiPokok;
    private Perusahaan perusahaan;

    public Karyawan(String nama, double gajiPokok, Perusahaan perusahaan) {
        setNama(nama); 
        this.gajiPokok = gajiPokok;
        this.perusahaan = perusahaan;
    }
    public void setNama(String nama) {
        if (nama.length() >= 4) {
            this.nama = nama;
        } else {
            throw new IllegalArgumentException("nama harus memiliki minimal 4 karakter");
        }
    }

    public String getNama() {
        return nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public Perusahaan getPerusahaan() {
        return perusahaan;
    }

    public void info() {
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Gaji Pokok    : " + gajiPokok);
        System.out.println("Perusahaan    : " + perusahaan.getNamaPerusahaan());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Perusahaan perusahaan = new Perusahaan("PT Filkom abadi jaya");

        Karyawan karyawan1 = new Karyawan("Alip", 7000000, perusahaan);
        Karyawan karyawan2 = new Karyawan("Agus", 5000000, perusahaan);
        
        karyawan1.info();
        karyawan2.info();
    }
}
