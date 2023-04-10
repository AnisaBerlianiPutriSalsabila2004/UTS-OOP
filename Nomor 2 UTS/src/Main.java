public class Main {
    public static void main(String[] args) {
        Validasi validasi = new Validasi();
        KTP a = new KTP("085869887731", "29062004");
        KTP b = new KTP("085882553213", "08122001");
        validasi.addKTP(a);
        validasi.addKTP(b);
        validasi.login("085869887731", "29062004");
        validasi.login("085882553213", "08122001");
    }
}