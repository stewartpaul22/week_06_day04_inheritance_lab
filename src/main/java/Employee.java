public class Employee {

    //name, NI number and salary
    private String name;
    private String niNumber;
    private Double salary;

    public Employee(String name, String niNumber, Double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public Double raiseSalary(Double increment) {

        return this.salary *= ((increment/100) + 1);
    }

    public Double payBonus() {
        return (this.salary * 0.01);
    }
}
