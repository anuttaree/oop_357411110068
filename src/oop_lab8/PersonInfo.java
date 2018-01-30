package oop_lab8;

public class PersonInfo {
    public static void main(String[] args) {
        Student student = new Student(
                "1801700076079",
                "anuttaree",
                "Female",
                23,
                "357411110068",
                "IS : Management Technology");
        System.out.println(student.toString());

        System.out.println(student.getName());

        Employee employee = new Employee(
                "180163131211",
                "john",
                "Male",
                22,
                "002",
                "art",
                30000);
        System.out.println(employee.toString());


    }//main
}//class
