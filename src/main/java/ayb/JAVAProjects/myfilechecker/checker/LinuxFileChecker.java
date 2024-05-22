package ayb.JAVAProjects.myfilechecker.checker;

import java.io.File;

public class LinuxFileChecker implements FileChecker {

    @Override
    public boolean isValidFile(String filename, String directory) {
        String[] validExtensions = {".sh", ".bin", ".run"};
        for (String ext : validExtensions) {
            if (filename.endsWith(ext)) {
                return true;
            }
        }
        return false;
    }

}
