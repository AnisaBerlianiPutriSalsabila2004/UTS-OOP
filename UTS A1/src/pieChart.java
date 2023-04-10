import java.util.Arrays;

public class pieChart {
    subject[] listsubject;
    private int jmlsubject = 0;
    int total = 0;

    public pieChart(int slot) {
        this.listsubject = new subject[slot];
    }

    public void add(subject i) {
        listsubject[jmlsubject]=i;
        jmlsubject+=1;
    }

    public int getmatkul() {
        for (int i = 0; i<jmlsubject; i++) {
            total += ( listsubject[i].getMatkul() * listsubject[i]));
        }
        return total;
    }

    public void seeALLItem() {
        System.out.println("your subject in pieChart worth : " + getMatkul() + " with subject as listed below:");
        for (int i = 0; i < jmlsubject; i++) {
            System.out.println(listsubject[i].toString());
        }
    }
}

