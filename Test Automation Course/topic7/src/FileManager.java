import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.Reader;

public class FileManager {
    static void scriereaInformatieiTextInFisier() {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    static void citireDateDinFisier() throws IOException {
        File file = new File("Hello1.txt");

        file.createNewFile();

        FileWriter writer = new FileWriter(file);

        writer.write("Aloha\n to\n everyone\n here!\n");
        writer.flush();
        writer.close();

        FileReader fr = new FileReader(file);
        char[] a = new char[50];
        fr.read(a);

        for (char c : a)
            System.out.print(c);
        fr.close();
    }
}