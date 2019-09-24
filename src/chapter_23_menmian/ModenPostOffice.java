package chapter_23_menmian;

import utils.P;

public class ModenPostOffice {

    private ILetterProcess process = new LetterProcessImpl();

    private Police letterPolice = new Police();

    public void sendLetter(String context,String address){
        process.writeContext(context);
        process.fillEnvelope(address);
        letterPolice.checkLetter(process);
        process.letterIntoEnvelope();
        process.sendLetter();
    }


}
