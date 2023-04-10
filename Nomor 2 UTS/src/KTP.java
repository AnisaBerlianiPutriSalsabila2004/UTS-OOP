public class KTP {
    private String nomortelepon;
    private String tanggallahir;

    public KTP(String nomortelepon, String tanggallahir) {
        this.nomortelepon = nomortelepon;
        this.tanggallahir = tanggallahir;
    }

    public String getNomortelepon() {
        return nomortelepon;
    }

    public void setNomortelepon(String nomortelepon) {
        this.nomortelepon = nomortelepon;
    }

    public String getTanggallahir() {
        return tanggallahir;
    }

    public void setTanggallahir(String tanggallahir) {
        this.tanggallahir = tanggallahir;
    }
}
