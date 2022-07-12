import java.io.*;
import java.net.*;


public class ServerFile {

    public static void main(String[] args) throws Exception {
        ServerSocket s=new ServerSocket(4001);
        Socket skt=s.accept();
        System.out.println("Server Started");
        byte[] b=new byte[(int) 20002];
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Bhavika Mittal\\Documents\\abcd.txt"));
        bis.read(b,0,b.length);
        OutputStream os=skt.getOutputStream();
        os.write(b,0,b.length);
        os.flush();
        skt.close();

    }
}
