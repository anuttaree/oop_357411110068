package oop_lap4;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//สร้าง method สำหรับรับค่าข้อมูลนักศึกษาประกอบด้วย
//1.ชื่อ-สกุล
//2.ที่อยู่
//3.รหัสนักศึกษา
//4.สาขาและมหาลัย
//5.email
public class StudentData {
    public static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
   public static String getName()throws IOException {
       System.out.print("Enter your name: ");
       return reader.readLine();
   }//getName
    public static String getAddress()throws IOException {
        System.out.print("Enter your address: ");
        return reader.readLine();
    }//getAddress
    public static String getStdID() throws IOException{
        System.out.print("Enter your ID: ");
        return reader.readLine();
    }//getID
    public static String getFaculty()throws IOException {
        System.out.print("Enter your major and faculty: ");
        return reader.readLine();
    }//getFaculty
    public static String getEmail() throws IOException{
        System.out.print("Enter your email: ");
        return reader.readLine();
    }//getEmail

    public static void main(String[] args) throws IOException{
      String name = getName();
      String address = getAddress();
      String id = getStdID();
      String fac = getFaculty();
      String email = getEmail();
      System.out.println(name+"\n"+address+"\n"+id+"\n"+fac+"\n"+email);
    }


}//class
