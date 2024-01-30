class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPersonInfo() {
        System.out.println("Person: Name - " + name + ", Age - " + age);
    }
}

class Employee extends Person {
    private int employeeId;
    private double salary;

    public Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayEmployeeInfo() {
        displayPersonInfo();
        System.out.println("Employee: Employee ID - " + employeeId + ", Salary - $" + salary);
    }
}

public class Person_Emplyee {
    public static void main(String[] args) {
        Person person = new Person("Anirudh Vijapuri", 30);
        Employee employee = new Employee("Akansha Singh", 25, 12345, 50000.0);

        person.displayPersonInfo();
        System.out.println(); 
        employee.displayEmployeeInfo();
    }
}