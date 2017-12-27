package oop_lab6;

public class StringCompare {
    public static void main(String[] args) {
        //Compare String
        String str1 = "Hello";
        String str2 = "Hellooo";
        //type 1(==) true,false [[[คือการเปรียบเทียบ 2 ค่า ถ้าจริงบอก true ถ้าไม่จริงบอก false]]]
        if (str1==str2) System.out.println ("true");
        else System.out.println("false");
        //type 2 (equals() method)  [[ทำงานเหมือนอันที่ 1]]]
        if (str1.equals(str2))System.out.println ("true");
        else System.out.println("false");
        //type 3 (compareTo() method)
        //ผลลัพธ์จะมีค่า 3 แบบ คือ -,+,0 [[ถ้าผลลัพธ์เป็น 0 แสดงว่าค่าเท่ากัน]]
        if (str1.compareTo(str2)==0)
            System.out.println("true");
        else if (str1.compareTo(str2)>=1)
            System.out.println("str 2 more than str1");
        else
            System.out.println("str1 less than str2");





    }//main
}//class
