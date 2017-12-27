package oop_lab6;

import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {

        String msg = "Hello, RMUTSV Anuttaree Srisaart";
        StringTokenizer myToken = new StringTokenizer(msg);
        System.out.println(myToken.countTokens());                       //การนับคำ

        while (myToken.hasMoreTokens()){                                 //อ่านค่าไปทีละคำ
            StringBuffer myBuf = new StringBuffer(myToken.nextToken());  //การreverseคำ [สลับทีละคำ]
            System.out.print(myBuf.reverse()+" ");
        }//while


    }//main

}//class
