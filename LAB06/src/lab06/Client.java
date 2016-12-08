package lab06;

import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;

public class Client {

    public void run() {

        Socket s = null;
        BufferedReader bs = null;
        BufferedReader bi = null;
        PrintWriter print = null;
        String line = "";

        try {
            String host = JOptionPane.showInputDialog("Enter the Server ip address");
            int port = Integer.parseInt(JOptionPane.showInputDialog(null,"Port #:", "Port",0));

            s = new Socket( host, port);
            bs = new BufferedReader(new InputStreamReader(System.in));
            bi = new BufferedReader(new InputStreamReader(s.getInputStream()));

            print = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));

            do {
                line = JOptionPane.showInputDialog(null,"To Server\t\t\t(type end or close window to exit)", "Message",0);
                print.println(line);
                print.flush();
                line = bi.readLine();
                JOptionPane.showMessageDialog(null, "Server Echoed: " + line, "Message",0, null);

            } while (!(line.equalsIgnoreCase("end")));
        } catch ( IOException e) {
            e.printStackTrace();
        }



    } //end public
} //end class

