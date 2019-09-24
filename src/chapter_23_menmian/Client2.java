package chapter_23_menmian;

public class Client2 {

    public static void main(String[] args) {
        ModenPostOffice modenPostOffice = new ModenPostOffice();



        String address = "Happy Road No.999 Lixin";
        String context = "This is Lixin is Write Letter";
        modenPostOffice.sendLetter(context,address);
    }

}
