public class Setan {
    private String nama;
    private double pendapatan;

    public Penduduk(String nama, int pendapatan) {
        this.nama = nama;
        this.pendapatan = pendapatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(int pendapatan) {
        this.pendapatan = pendapatan;
    }
}
