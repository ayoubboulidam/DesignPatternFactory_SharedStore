package ayb.JAVAProjects.myfilechecker.checker;

public class FileCheckerFactory {

    public static FileChecker getFileChecker(OS os) {
        switch (os) {
            case WINDOWS:
                return new WindowsFileChecker();
            case LINUX:
                return new LinuxFileChecker();
            default:
                throw new IllegalArgumentException("Unsupported OS");
        }
    }
}