public class Main {
    public static void main(String[] args) {
        subject i1 = new subject("IPA", "5", "Sutarmi");
        subject i2 = new subject("B. IND", "15", "Painem");
        subject i3 = new subject("B. ING", "30", "Bambang");
        pieChart B = new pieChart(10);
        B.add(i1);
        B.add(i2);
        B.add(i3);
        B.seeALLItem();
    }
}