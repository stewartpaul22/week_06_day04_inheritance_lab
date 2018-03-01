public class Employee {

    //name, NI number and salary
    private String name;
    private String niNumber;
    private Double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(Double increment) {
        this.salary *= increment;
    }

    //Add a method called payBonus which returns 1% of the employees salary
    public Double payBonus() {
        return (this.salary * 0.01);
    }
}
