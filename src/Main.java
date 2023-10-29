import java.io.File;

public class Main {
    public static void addFolderAndFileInFolder(String folderName, String fileName) {
        try {
            File folder = new File(folderName);
            if (!folder.exists()) {
                folder.mkdir();
            }
            File file = new File(folder.getAbsolutePath() + "/" + fileName);
            if (!file.exists()) {
                file.createNewFile();
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void deleteFolderAndFileInFolder(String folderName, String fileName) {
        try {
            File folder = new File(folderName);
            if (folder.isDirectory()) {
                File file = new File(folder.getAbsolutePath(), fileName);
                if (file.isFile()) {
                    System.out.println("Delete file : " + file.delete());
                }
                System.out.println("Delete folder : " + folder.delete());
            } else {
                System.out.println("Ok");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        String folderName = "Farid";
        String fileName="Abdullaev";
        Integer count=10;

        for (int i = 0; i < count; i++) {
            addFolderAndFileInFolder(folderName+i,fileName+i);
        }
    }
}