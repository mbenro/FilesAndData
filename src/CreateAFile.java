import java.io.File;
import java.io.IOException;

public class CreateAFile {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\maria\\Downloads\\test.txt");
        if(f.createNewFile())
            System.out.println("File created");
        else
            System.out.println("Error - file already exists");
    }


}
