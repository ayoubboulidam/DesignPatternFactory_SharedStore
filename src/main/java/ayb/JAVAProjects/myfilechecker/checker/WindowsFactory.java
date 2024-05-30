package ayb.JAVAProjects.myfilechecker.checker;

public class WindowsFactory  implements  OSAbstractFactory{

    @Override
    public FileChecker createFileChecker() {
        return new WindowsFileChecker();
    }

}
