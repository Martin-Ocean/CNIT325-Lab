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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Socket s = new Socket("time-A.timefreq.bldrdoc.gov", 13);
            try {
                InputStream inStream = s.getInputStream();
                Scanner in = new Scanner(inStream);
                while (in.hasNextLine())
                {
                    String line = in.nextLine();
                    System.out.println(line);
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
