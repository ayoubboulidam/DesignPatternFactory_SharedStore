package ayb.JAVAProjects.myfilechecker.checker;

public class WindowsFileChecker implements  FileChecker{
    @Override
    public boolean isValidFile(String filename, String directory) {
        String[] validExtensions = {".doc", ".docx", ".xls", ".xlsx"};
        for (String ext : validExtensions) {
            if (filename.endsWith(ext)) {
                return true;
            }
        }
        return false;
    }
}
