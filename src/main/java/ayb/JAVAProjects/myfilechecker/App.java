package ayb.JAVAProjects.myfilechecker;

import ayb.JAVAProjects.myfilechecker.checker.FileChecker;
import ayb.JAVAProjects.myfilechecker.checker.FileCheckerFactory;
import ayb.JAVAProjects.myfilechecker.checker.OS;

public class App {
    public static void main(String[] args) {
        String filename = "example.doc1";
        String directory = "path/to/directory";
        OS os = OS.WINDOWS; // ou OS.LINUX selon votre système d'exploitation

        FileChecker fileChecker = FileCheckerFactory.getFileChecker(os);

        if (fileChecker.isValidFile(filename, directory)) {
            System.out.println("Le fichier est valide.");
        } else {
            System.out.println("Le fichier n'est pas valide.");



            // Ajoutez des messages pour spécifier pourquoi le fichier n'est pas valide
            if (os == OS.WINDOWS) {
                System.out.println("Les fichiers sous Windows doivent avoir l'extension .doc, .docx, .xls ou .xlsx.");
            } else if (os == OS.LINUX) {
                System.out.println("Les fichiers sous Linux doivent avoir l'extension .sh, .bin ou .run.");
            }
        }
    }
}
