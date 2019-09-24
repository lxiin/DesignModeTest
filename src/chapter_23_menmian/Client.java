package chapter_23_menmian;

public class Client {

    public static void main(String[] args) {
        ILetterProcess letterProcess = new LetterProcessImpl();
        letterProcess.writeContext("Hello,I am lx nice to mmet toyu");
        letterProcess.fillEnvelope("长安街正中心,Lixin");
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }

}
