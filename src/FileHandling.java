import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileHandling {
    public static void main(String[] args) {
        FileReader in=null;
        int c;

        try{
            in=new FileReader("C:\\Users\\Dell\\OneDrive\\Desktop\\Input.txt");
            while ((c= in.read())!=-1)
            {
                System.out.print((char)c);
            }
        }
        catch (Exception f)
        {
            System.out.println(f);
        }
    }
}
