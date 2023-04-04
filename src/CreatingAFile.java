import java.io.File;
public class CreatingAFile {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\maria\\Downloads\\Declaration form.docx");
        if(!f.exists())
            System.out.println("The file does not exist!");
        else
            System.out.println("File found");
    }


}
