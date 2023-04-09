import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Filewriter {
    public static void main(String[] args) {
        FileReader in=null;
        FileWriter out=null;
        int c;
        try{
            in= new FileReader("C:\\Users\\Dell\\OneDrive\\Desktop\\Input.txt");
            out=new FileWriter("C:\\Users\\Dell\\OneDrive\\Desktop\\Output.txt");
            while ((c=in.read())!=-1)
            {
                out.write((char)c);
            }
            System.out.println("Done");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            if (in !=null)
            {
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (out !=null)
            {
                try {
                    out.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
