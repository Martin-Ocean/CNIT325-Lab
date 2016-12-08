/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab06;

import javax.swing.JOptionPane;

public class main {
   public static void main(String[] args) {
//        EchoServer server = new EchoServer();
//        Client client = new Client();

       Object[] selectioValues = { "Server","Client"};
       String initialSection = "Server";

       Object selection = JOptionPane.showInputDialog(null, "Login as : ", "EchoServer", JOptionPane.QUESTION_MESSAGE, null, selectioValues, initialSection);
       if(selection.equals("Server")){

           new EchoServer().run();
       }else if(selection.equals("Client")){


           new Client().run();
       }


   }
}

