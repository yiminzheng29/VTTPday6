package vttp.day6;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class MyWriter {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos = new FileOutputStream(args[0]);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        //Number of lines
        oos.writeInt(2);
        oos.writeUTF("She sells sea shell on the sea shore");
        oos.writeUTF("Big black bug bleeds black blood");

        oos.flush();
        oos.close();
        
    }
}
