package oop_lab6;

public class StringBuf {
    public static void main(String[] args) {
        //StringBuffer
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        buffer.append(" Welcome");
        buffer.append(" to");
        buffer.append(" RMUTSV");
        System.out.println(buffer);
        System.out.println(buffer.length());    //การนับอักขระ
        buffer.replace(0,5,"OOP");  //การแทนที่
        System.out.println(buffer);
        System.out.println(buffer.reverse());   //การสลับคำจากหน้าไปหลัง หลังไปหน้า
        buffer.delete(0, 3);                    //ต้องการลบอักขระที่เท่าไหร่ หรือการเลือกลบ
        System.out.println(buffer);
    }//main

}//class
