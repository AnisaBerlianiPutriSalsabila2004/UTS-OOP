public class Testmotor {
    public static void main(String[] args) {
        Motor bebek = new Motor("AB62178GHY");
        bebek.naikanGigi();
        bebek.gas();
        bebek.gas();
        bebek.gas();
        bebek.naikanGigi();
        bebek.gas();
        bebek.rem(5);
        bebek.rem(5);
        bebek.gas();
        bebek.turunkanGigi();
        bebek.gas();
        bebek.naikanGigi();
        bebek.gas();
        bebek.gas();
        bebek.naikanGigi();
        bebek.gas();
        bebek.gas();
        bebek.naikanGigi();
        bebek.gas();
        bebek.gas();
        bebek.gas();
        bebek.gas();
        bebek.gas();
        bebek.gas();
        bebek.rem(60);
        bebek.gas();
        bebek.cekGigi();
        bebek.naikanGigi();
        bebek.cekKecepatan();
    }
}