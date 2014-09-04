/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client;
import java.io.*;
import java.util.*;
import java.net.*;
/**
 * this is the client
 * @author madhura phatak
 * version 1.0
 */
public class Client {
    static BufferedReader br = null;
    static String p[] = new String[50];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception
    {
        createPacket();
        Packet packet = new Packet(p);
        sendPacket(packet);
    }
    
    /**
     * This method selects a packet from text files
     * @throws Exception 
     */
    public static void createPacket() throws Exception
    {
        int opt1,i;
        String line,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Normal Packet");
        System.out.println("2. Attack Packet");
        System.out.println("Enter your choice");
        opt1 = sc.nextInt();
        switch(opt1)
        {
            case 1:
            case 2:
                int opt2;
                System.out.println("1. DOS");
                System.out.println("2. U2R");
                System.out.println("3. R2L");
                System.out.println("4. Probing");
                System.out.println("Enter your choice");
                opt2 = sc.nextInt();
                switch(opt2)
                {
                    case 1: 
                        i=0;
                        br = new BufferedReader(new FileReader("C:\\Users\\phatak\\Documents\\NetBeansProjects\\Client\\src\\client\\DOS.txt"));
                        line = br.readLine();
                        StringTokenizer st1  = new StringTokenizer(line," ",true);
                        while(st1.hasMoreElements())
                        {
                            temp = st1.nextElement().toString();
                            if(temp.equals(" ")){continue;}
                            else
                            {
                                p[i] = temp;
                                i++;
                            }
                        }
                        break;
                    case 2:
                        i=0;
                        br = new BufferedReader(new FileReader("C:\\Users\\phatak\\Documents\\NetBeansProjects\\Client\\src\\client\\U2R.txt"));
                        line = br.readLine();
                        StringTokenizer st2  = new StringTokenizer(line," ",true);
                        while(st2.hasMoreElements())
                        {
                            temp = st2.nextElement().toString();
                            if(temp.equals(" ")){continue;}
                            else
                            {
                                p[i] = temp;
                                i++;
                            }
                        }
                        break;
                    case 3:
                        i=0;
                        br = new BufferedReader(new FileReader("C:\\Users\\phatak\\Documents\\NetBeansProjects\\Client\\src\\client\\R2L.txt"));
                        line = br.readLine();
                        StringTokenizer st3  = new StringTokenizer(line," ",true);
                        while(st3.hasMoreElements())
                        {
                            temp = st3.nextElement().toString();
                            if(temp.equals(" ")){continue;}
                            else
                            {
                                p[i] = temp;
                                i++;
                            }
                        }
                        break;
                    case 4:
                        i=0;
                        br = new BufferedReader(new FileReader("C:\\Users\\phatak\\Documents\\NetBeansProjects\\Client\\src\\client\\Probing.txt"));
                        line = br.readLine();
                        StringTokenizer st4  = new StringTokenizer(line," ",true);
                        while(st4.hasMoreElements())
                        {
                            temp = st4.nextElement().toString();
                            if(temp.equals(" ")){continue;}
                            else
                            {
                                 p[i] = temp;
                                 i++;
                            }
                        }
                        break;
                }
        }
    }
    
    /**
     * This method establishes connection with the server and sends the packet 
     * @param packet Object of class packet
     * @throws Exception 
     */
    public static void sendPacket(Packet packet)throws Exception
    {
        Socket ss = new Socket("localhost",6789);
        OutputStream os = ss.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(packet);
        System.out.println("Packet sent");
        oos.close();
        os.close();
        ss.close();
    }
    
}
