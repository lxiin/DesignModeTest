package chapter_15_mingling;

public class CancelDeletePageCommand extends Command {
    @Override
    public void execute() {
        super.pg.rollBack();
    }
}
