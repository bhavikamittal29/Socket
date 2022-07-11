import java.io.*;
import java.net.*;

public class ClientFile
{
    public static void main(String[] args) throws Exception {
        byte b[]=new byte[20002];
        Socket skt=new Socket("localhost",4001);
        InputStream fis=skt.getInputStream();
        FileOutputStream fos=new FileOutputStream("E:\\abcdefghi.txt");
        fis.read(b,0,b.length);
        fos.write(b,0,b.length);
        skt.close();
    }
}
