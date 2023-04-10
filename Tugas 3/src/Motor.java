public class Motor {

    String noplat;
    int gigi = 0;
    int kecepatan = 0;

    public Motor(String noplat) {
        this.noplat = noplat;
    }

    public void gas(){
        if((this.kecepatan<10 && this.gigi == 1) ||
                (this.kecepatan>=10 && this.kecepatan<20 && this.gigi==2) ||
                (this.kecepatan>=20 && this.kecepatan<30 && this.gigi==3) ||
                this.kecepatan>=30 && this.gigi==4 ){
            kecepatan+=5;
            System.out.println("kecepatan e saiki = " + kecepatan);
        }else if(this.gigi==0){
            System.out.println("lebokne sek gigi e");
        } else if((this.kecepatan<10 && this.gigi > 1) ||
                (this.kecepatan>=10 && this.kecepatan<20 && this.gigi>2) ||
                (this.kecepatan>=20 && this.kecepatan<30 && this.gigi>3)){
            System.out.println("kelongi sek gigi e");
        }else{
            System.out.println("Unggahke sek gigi e");
        }
    }

    public void rem(int a){
        if(kecepatan!=0){
            kecepatan-=a;
            System.out.println("kecepatan sekarang = " + kecepatan);
        }
    }

    public void naikanGigi(){
        if((this.kecepatan==0 || this.kecepatan==10 || this.kecepatan==20 || this.kecepatan==30) && this.gigi!=4){
            gigi+=1;
        }else if(this.kecepatan==0 && this.gigi==4){
            gigi=0;
        }System.out.println("motor mu sekarang ada di gigi : " + gigi);
    }

    public void turunkanGigi(){
        if(this.gigi>0 && this.gigi<=4){
            gigi-=1;
        }
        System.out.println("motor mu sekarang ada di gigi : " + gigi);
    }

    public void cekGigi(){
        System.out.println(gigi);
    }

    public void cekKecepatan(){
        System.out.println(kecepatan);
    }

    public void nabrakemakemak(){
        kecepatan=0;
        System.out.println("bar ngono mbok e nesu nesu");
    }
}
