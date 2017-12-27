package oop_lab6;

public class myString {
    public static void main(String[] args) {
        char []c ={'H','e','l','l','o'};
        String str1 = new String(c);
        System.out.println(str1);
        String str2 = "Anuttaree Srisaart";
        System.out.println(str2);

        //String Concatenation
        //type 1 (+)
        String str3 = str1 +" "+ str2; //การเอา Sting มาต่อกัน
        System.out.println(str3);
        //type 2 (concat() method)
        String str4 = str3.concat(" RMUTSV");//การต่อ Sting
        System.out.println(str4);

        // String Methods การใช้งาน
        System.out.println(str4.length());         //นับตัวอักษรว่ามีกี่อักขระ นับรวมเคาะด้วย
        System.out.println(str4.substring(10,20)); //ตัดข้อความบางส่วนออกมาแสดงผล อันนี้คือเริ่มต้นที่อักขระที่10กับอักขระที่20
        System.out.println(str4.toUpperCase());    //ทำเป็นตัวพิมพ์ใหญ่ทั้งหมด
        System.out.println(str4.toLowerCase());    //ทำเป็นตัวพิมพ์เล็กทั้งหมด
        System.out.println(str4.replace('r','t'));  //การเปลี่ยนแปลง จากตัวอย่างคือจากตัว r เป็นตัว t













    }//main

}//class
