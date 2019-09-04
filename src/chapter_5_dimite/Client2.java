package chapter_5_dimite;

public class Client2 {

    public static void main(String[] args) {
        InstallSoftWare invoker = new InstallSoftWare();
        invoker.installWizard(new Wizard());
    }

}
