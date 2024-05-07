public class Pajak {
    private String vendor;
    private String tipe;
    private double harga;

    // Konstruktor
    public void Pajak(String vendor, String tipe, double harga) {
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }

    // Getter untuk vendor
    public String getVendor() {
        return vendor;
    }

    // Getter untuk tipe
    public String getTipe() {
        return tipe;
    }

    // Getter untuk harga
    public double getHarga() {
        return harga;
    }
    
}

