
import java.io.File;
import java.io.IOException;

public class Search {

    public static void main(String[] args) throws IOException {

        File file = new File("dir2");
        File d = findAbsoluteFile(file, "fileOleg.txt");

    }


    public static File findAbsoluteFile(File dir, String fileName) {

        File[] files = new File(String.valueOf(dir)).listFiles();

        for (File file : files) {
            if (file.isDirectory()) {
                File newFile = new File(file.getPath());
                File foundfiles = findAbsoluteFile(newFile, fileName);
                if (foundfiles != null) return foundfiles;
            }
            if (file.getName().equals(fileName)) {
                return file;
            }
        }
        return null;

    }

}


    

