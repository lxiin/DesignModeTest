package chapter_15_mingling;

public class AddRequirementCommand extends Command{
    @Override
    public void execute() {
        super.rg.find();
        super.rg.add();
        super.rg.plan();
    }
}
