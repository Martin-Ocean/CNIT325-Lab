/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cnitlab06;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 *
 * @author gong62
 */
public class EchoServer {
    public void start() {
        try {
            ServerSocket s = new ServerSocket(8189); // server socket
            boolean over = false;
            while(!over) {
                Socket incoming = s.accept(); // accept a connection 
                try {
                    InputStream inStream = incoming.getInputStream(); // inputstream handler
                    OutputStream outStream = incoming.getOutputStream(); // output stream handler
                    
                    Scanner in = new Scanner(inStream); // setup of input
                    PrintWriter out = new PrintWriter(outStream, true); // sends output
                    
                    boolean done = false;
                    while(!done && in.hasNextLine()) { // while there are lines to read, for this connection
                        String lineIn = in.nextLine();
                        out.println(new Date().toString());
                        
                        if (lineIn.trim().equals("BYE")) // to kill the server, enter BYE from the client
                        {
                            done = true;
                        } // end if
                    } // end while
                } catch (Exception e1){
                    e1.printStackTrace();
                    System.out.println("Problem at e1(inner)");
                } // end try catch
            } //end while
        } catch(IOException e2) {
            e2.printStackTrace();
            System.out.println("Problem at e2(outter)");
        }
    }
    public static void main(String[] args) {
        EchoServer server = new EchoServer();
        server.start();
    }
    
}
    
