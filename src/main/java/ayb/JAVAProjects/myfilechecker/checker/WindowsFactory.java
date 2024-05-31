package ayb.JAVAProjects.myfilechecker.checker;

public class WindowsFactory  implements  OSFactory{

    @Override
    public FileChecker createFileChecker() {
        return new WindowsFileChecker();
    }

}
