import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Department dept = new Department("Human Resoource", "Regular", "Antonio Lim");
            Employee emp1 = new Employee("6", "Andrea Mae Villanueva", "HR Manager", 80000, dept);
        Employee emp2 = new Employee("7", "Brad San Jose", "HR Team Leader", 60000, dept);

        LocalDate startDate = LocalDate.of(2024, Month.MAY, 1);
        LocalDate endDate = LocalDate.of(2024, Month.MAY, 31);

        PayrollSystem payrollSystem = new PayrollSystem(startDate, endDate);
        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        payrollSystem.calculatePayroll();

        Report emp1Report = payrollSystem.generateEmployeeReport(emp1);
        System.out.println(emp1Report.getContent());

        Report payrollReport = payrollSystem.generatePayrollReport();
        System.out.println(payrollReport.getContent());
    }
}
