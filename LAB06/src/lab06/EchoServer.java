package lab06;

import javax.swing.*;
import java.io.*;
import java.net.*;

public class EchoServer {



    public void run()  {

        ServerSocket serverSocket; //the server socket
        Socket socket = null;
        //BufferedReader bs; // buffered system input
        BufferedReader bi; // buffered socket input
        PrintWriter out;
        String line;


        try {


            int host = Integer.parseInt(JOptionPane.showInputDialog("Enter the Server Port"));
            serverSocket = new ServerSocket(host);
            JOptionPane.showConfirmDialog(null,"Server is up and running, click to continue.", "Hi",0);
            while (true) {
                socket = serverSocket.accept();
                System.out.println("Client " + socket);
                //bs = new BufferedReader(new InputStreamReader(System.in));
                bi = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
                do {

                    line = bi.readLine();
                    out.println(line);
                    out.flush();
                } while (!(line.equalsIgnoreCase("end")));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
