package chapter_15_mingling;

public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        super.pg.find();
        super.rg.delete();
        super.rg.plan();
    }
}
