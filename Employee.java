package my_project;

public class Employee {
    String fullName;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Employee (String fullName, String position, String email, String phoneNumber, int salary, int age)
    {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo () {
        System.out.println ("ФИО: " + fullName);
        System.out.println ("Должность: " + position );
        System.out.println ("Еmail: " + email);
        System.out.println ("Номер телефона: " + phoneNumber);
        System.out.println ("Зарплата: " + salary);
        System.out.println ("Возраст: " + age);
    }

    public int getAge ()
    {
        return age;
    }
}