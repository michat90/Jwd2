package pl.edu.wszib.jwd.zajecia3;

public class Employee {
    String name;
    int age;
    int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

//    public String toString() {
//        return "[name = '" + name + "', age = " + age + ", salary = " + salary + "]";
//    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    } // wygenerowana generatorem
}
