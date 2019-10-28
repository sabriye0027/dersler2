/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author Admin
 */
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        
        String clientmsg = null , msg; 
        System.out.println("Hello Word");
        ServerSocket s1 = new ServerSocket(300);
        Socket s = s1.accept();
        Scanner sc = new Scanner(s.getInputStream());
        Scanner sc1 = new Scanner(System.in);
        clientmsg = sc.nextLine();
        System.out.println(clientmsg);
        PrintStream p = new PrintStream(s.getOutputStream());
        p.println("deneme,"+clientmsg);
        System.out.println("deneme,"+clientmsg);
        clientmsg = sc.nextLine();
        
        while(!("son".equals(clientmsg))) {
            System.out.println(clientmsg);
            msg = sc1.nextLine();
            p.println(msg);
            clientmsg = sc.nextLine();
        }
        
        System.out.println(clientmsg);
        System.out.println("son");
            
    }
    
}