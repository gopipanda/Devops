import java.io.FileReader;
import java.io.File;
class FileNotFound
{
    public static void main(String[] args)throws Exception
     {
        File f=new File("file.txt");
        FileReader r=new FileReader(f); 
    }
}