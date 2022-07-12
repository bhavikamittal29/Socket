import java.io.*;
import java.net.*;

public class ClientFile
{
    public static void main(String[] args) throws Exception {
        byte[] b=new byte[20002];
        Socket skt=new Socket("localhost",4001);
        InputStream fis=skt.getInputStream();
        FileOutputStream fos=new FileOutputStream("E:\\File.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        fis.read(b,0,b.length);
        bos.write(b,0,b.length);
        bos.flush();
        System.out.println("File received");
        skt.close();
    }
}
