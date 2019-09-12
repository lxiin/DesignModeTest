package chapter_15_mingling;

public class Invoker {

    private Command command;

    public void sendCommand(Command command){
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }

}
