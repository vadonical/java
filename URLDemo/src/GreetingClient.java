import java.net.*;
import java.io.*;

public class GreetingClient
{
    public static void main(String [] args)
    {
        String serverName = args[0];
        int port = Integer.parseInt(args[1]);
        try
        {
            System.out.println("Conneting the Host" + serverName + ",The port is:" + port);
            Socket client = new Socket(serverName, port);
            System.out.println("The address of Remote Host:" + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);
            System.out.println("The Server connecting..." + in.readUTF());
            client.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}