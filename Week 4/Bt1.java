import java.net.Inet4Address;
import java.net.InetAddress;

public class Bt1 {

    public class void main(String[] args) {
       try {
        //tạo đối tượng bằng tên máy chủ
        InetAddress addByName=InetAddress.getByName("www.google.com");

        InetAddress addByIP=InetAddress.getByName("192.168.200.1");
       System.out.println("Address by Name: "+addByName);
       System.out.println("Address by IP: "+addByIP);
        
       } catch (Exception e) {
        
       }
        
