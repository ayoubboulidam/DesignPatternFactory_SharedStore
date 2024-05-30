package ayb.JAVAProjects.myfilechecker.checker;

public class LinuxFactory implements OSAbstractFactory{
    @Override
    public FileChecker createFileChecker() {
        return new LinuxFileChecker();
    }
}
