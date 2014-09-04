/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client;
import java.io.*;
/**
 * This class is used in client part to create a Packet object
 * @author madhura phatak
 * version 1.0
 */
public class Packet implements Serializable {
    private long duration;
    private String protocol_type;
    private String service;
    private String flag;
    private long src_bytes;
    private long dst_bytes;
    private int	land;
    private int	wrong_fragment;
    private int	urgent;
    private int	hot;
    private int	num_failed_logins;
    private int	logged_in;
    private int	num_compromised;
    private int	root_shell;
    private int	su_attempted;
    private int	num_root;
    private int	num_file_creations;
    private int	num_shells;
    private int	num_access_files;
    private int	num_outbound_cmds;
    private int	is_host_login;
    private int	is_guest_login;
    private int	count;
    private int	srv_count;
    private float serror_rate;
    private float srv_serror_rate;
    private float rerror_rate;
    private float srv_rerror_rate;
    private float same_srv_rate;
    private float diff_srv_rate;
    private float srv_diff_host_rate;
    private int	dst_host_count;
    private int	dst_host_srv_count;
    private float dst_host_same_srv_rate;
    private float dst_host_diff_srv_rate;
    private float dst_host_same_src_port_rate;
    private float dst_host_srv_diff_host_rate;
    private float dst_host_serror_rate;
    private float dst_host_srv_serror_rate;
    private float dst_host_rerror_rate;
    private float dst_host_srv_rerror_rate;
    
 /**
 * Constructor just to initialize object of packet class
 */
 Packet(){}
    
 /**
 *Constructor Creates a new Packet object that represents a packet
 */
 Packet(String p[])
   {
    this.duration = Long.parseLong(p[0]);
    this.protocol_type = p[1];
    this.service = p[2];
    this.flag = p[3];
    this.src_bytes = Long.parseLong(p[4]);
    this.dst_bytes = Long.parseLong(p[5]);
    this.land = Integer.parseInt(p[6]);
    this.wrong_fragment = Integer.parseInt(p[7]);
    this.urgent = Integer.parseInt(p[8]);
    this.hot = Integer.parseInt(p[9]);
    this.num_failed_logins = Integer.parseInt(p[10]);
    this.logged_in = Integer.parseInt(p[11]);
    this.num_compromised = Integer.parseInt(p[12]);
    this.root_shell = Integer.parseInt(p[13]);
    this.su_attempted = Integer.parseInt(p[14]);
    this.num_root = Integer.parseInt(p[15]);
    this.num_file_creations = Integer.parseInt(p[16]);
    this.num_shells = Integer.parseInt(p[17]);
    this.num_access_files = Integer.parseInt(p[18]);
    this.num_outbound_cmds = Integer.parseInt(p[19]);
    this.is_host_login = Integer.parseInt(p[20]);
    this.is_guest_login = Integer.parseInt(p[21]);
    this.count = Integer.parseInt(p[22]);
    this.srv_count = Integer.parseInt(p[23]);
    this.serror_rate = Float.parseFloat(p[24]);
    this.srv_serror_rate = Float.parseFloat(p[25]);
    this.rerror_rate = Float.parseFloat(p[26]);
    this.srv_rerror_rate = Float.parseFloat(p[27]);
    this.same_srv_rate = Float.parseFloat(p[28]);
    this.diff_srv_rate = Float.parseFloat(p[29]);
    this.srv_diff_host_rate = Float.parseFloat(p[30]);
    this.dst_host_count = Integer.parseInt(p[31]);
    this.dst_host_srv_count = Integer.parseInt(p[32]);
    this.dst_host_same_srv_rate = Float.parseFloat(p[33]);
    this.dst_host_diff_srv_rate = Float.parseFloat(p[34]);
    this.dst_host_same_src_port_rate = Float.parseFloat(p[35]);
    this.dst_host_srv_diff_host_rate = Float.parseFloat(p[36]);
    this.dst_host_serror_rate = Float.parseFloat(p[37]);
    this.dst_host_srv_serror_rate = Float.parseFloat(p[38]);
    this.dst_host_rerror_rate = Float.parseFloat(p[39]);
    this.dst_host_srv_rerror_rate = Float.parseFloat(p[40]);
   }
 
 /**
  * this method displays the packet
  */
 public void displayPacket()
 {
     System.out.println("The packet is");
     System.out.println(this.duration+" "+this.protocol_type+" "+this.service+" "+this.flag+" "+this.src_bytes+" "+this.dst_bytes+" "+this.land+" "+
                        this.wrong_fragment+" "+this.urgent+" "+this.hot+" "+this.num_failed_logins+" "+this.logged_in+" "+this.num_compromised+" "+
                        this.root_shell+" "+this.su_attempted+" "+this.num_root+" "+this.num_file_creations+" "+this.num_shells+" "+this.num_access_files
                        +" "+this.num_outbound_cmds+" "+this.is_host_login+" "+this.is_guest_login+" "+this.count+" "+this.srv_count+" "+this.serror_rate
                        +" "+this.srv_serror_rate+" "+this.rerror_rate+" "+this.srv_rerror_rate+" "+this.same_srv_rate+" "+this.diff_srv_rate+" "+this.srv_diff_host_rate
                        +" "+this.dst_host_count+" "+this.dst_host_srv_count+" "+this.dst_host_same_srv_rate+" "+this.dst_host_diff_srv_rate+" "+
                        this.dst_host_same_src_port_rate+" "+this.dst_host_srv_diff_host_rate+" "+this.dst_host_serror_rate+" "+this.dst_host_srv_serror_rate
                        +" "+this.dst_host_rerror_rate+" "+this.dst_host_srv_rerror_rate);
 }
}
