public class subject {
    private String matkul;
    private String beban;
    private String nama;

    public subject(String matkul, String beban, String nama) {
        this.matkul = matkul;
        this.beban = beban;
        this.nama = nama;
    }

    public String getMatkul() {
        return matkul;
    }

    public String getBeban() {
        return beban;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return " " + nama + " " +  beban + " " + "worth:" + " " + matkul;
    }
}
