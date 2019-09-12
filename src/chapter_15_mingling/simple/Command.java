package chapter_15_mingling.simple;

public abstract class Command {

    protected final Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();

}
