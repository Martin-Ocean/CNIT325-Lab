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
public class SocketTest {
    protected String host = "";
    protected int port = 0;
    protected String line = "";
    
    public void setHost(String h) {
        this.host = h;
    }
    public String getHost() 
    {
        return this.host;
    }
    
    public void setPort(int port) {
        this.port = port;
    }
    
    public int getPort() {
        return this.port;
    }
    public String getLine() {
        return line;
    }

    /**
     * @param args the command line arguments
     */
    public void connect() {
        
        try {
            Socket s = new Socket(getHost().trim(), getPort());
            try {
                InputStream inStream = s.getInputStream();
                Scanner in = new Scanner(inStream);
                while (in.hasNextLine())
                {
                    line = in.nextLine();
   
                }
            }//end try
            finally {
                s.close();
            }
        }//end try
        catch(IOException e) {
            e.printStackTrace();
        }//end catch
    }// end public 
    
}// end class
