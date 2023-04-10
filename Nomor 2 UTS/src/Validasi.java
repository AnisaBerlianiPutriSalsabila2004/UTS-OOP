public class Validasi{
    private int index = 0;
    private String[] nomortelepon;
    private String[] tanggallahir;

    public Validasi() {
        this.nomortelepon = new String[99];
        this.tanggallahir = new String[99];
    }

    public void addKTP(KTP A){
        Boolean istrue = true;
        for(int i = 0; i<index; i++) {
            if (A.getNomortelepon() == nomortelepon[i]){
                istrue = false;
            }
        }
        if(istrue == true){
            nomortelepon[index] = A.getNomortelepon();
            tanggallahir[index] = A.getTanggallahir();
            index+=1;
            System.out.println("Data yang dicek sudah sesuai");
        }else{
            System.out.println("Mohon maaf data saat dicek tidak sesuai");
        }
    }

    public void login(String nomortelepon, String tanggallahir){
        for(int i = 0; i<index; i++) {
            if (nomortelepon == nomortelepon[i] && tanggallahir == tanggallahir[i]) {
                System.out.println("Data sudah sesuai!");
            }else{
                System.out.println("Data tidak sesuai!");
            }
        }
    }
//        public void encrypt(String n){
//        String tmp
//            System.out.println();

}
