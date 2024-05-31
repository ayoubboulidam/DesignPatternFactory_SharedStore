package ayb.JAVAProjects.myfilechecker.checker;

public class LinuxFactory implements OSFactory{
    @Override
    public FileChecker createFileChecker() {
        return new LinuxFileChecker();
    }
}
