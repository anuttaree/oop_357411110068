package oop_lab9;

public class myPersonApp {

    public static void main(String[] args) {

        Person person = new Person("068888888888","Anuttaree Srisaart",
                new Address("58 M.9", "Nakornsithammarat","80110"),
                new Job("Student",25000));

        System.out.println(person.toString());

        person.getJob().setSalary(30000);

        System.out.println(person.getJob().getSalary());
        System.out.println(person.getAddress().getPostCode());

    }//main
}//class
