public class Employee {
    private String employeeId;
    private String name;
    private String position;
    private double salary;
    private Department department;

    public Employee(String employeeId, String name, String position, double salary, Department department) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.department = department;
    }

    public String getDetails() {
        return "Employee ID: " + employeeId + ", Name: " + name + ", Position: " + position + 
               ", Salary: $" + salary + ", Department: [" + department.getDetails() + "]";
    }

    public double calculatePay() {
        return salary;
    }
}
