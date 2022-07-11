import java.io.*;
import java.net.*;
import java.sql.SQLOutput;

public class ServerFile {

    public static void main(String[] args) throws Exception {
        ServerSocket s=new ServerSocket(4001);
        Socket skt=s.accept();
        System.out.println("Server Started");
        FileInputStream fis=new FileInputStream("C:\\Users\\Bhavika Mittal\\Documents\\abcd.txt");
        byte b[]=new byte[20002];
        fis.read(b,0,b.length);
        OutputStream os=skt.getOutputStream();
        skt.close();

    }
}
