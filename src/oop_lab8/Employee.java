package oop_lab8;

public class Employee extends Person {
    private String EmployeeID;
    private String position;
    private String salary;

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeID='" + EmployeeID + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                "} " + super.toString();
    }

    public Employee(String personID, String name, String gender, int age, String employeeID, String position, String salary) {
        super(personID, name, gender, age);
        EmployeeID = employeeID;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}//class
