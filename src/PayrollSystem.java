import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {
    private List<Employee> employees;
    private LocalDate payPeriodStartDate;
    private LocalDate payPeriodEndDate;

    public PayrollSystem(LocalDate payPeriodStartDate, LocalDate payPeriodEndDate) {
        this.employees = new ArrayList<>();
        this.payPeriodStartDate = payPeriodStartDate;
        this.payPeriodEndDate = payPeriodEndDate;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void calculatePayroll() {
        for (Employee employee : employees) {
            double pay = employee.calculatePay();
            System.out.println("Compensation for " + employee.getDetails() + ": $" + pay);
        }
    }

    public Report generateEmployeeReport(Employee employee) {
        double pay = employee.calculatePay();
        String reportContent = "Compensation for " + employee.getDetails() + ": $" + pay;
        return new Report(reportContent);
    }

    public Report generatePayrollReport() {
        StringBuilder reportContent = new StringBuilder();
        reportContent.append("Payroll Report for Period: ")
                     .append(payPeriodStartDate)
                     .append(" to ")
                     .append(payPeriodEndDate)
                     .append("\n");
        
        for (Employee employee : employees) {
            double pay = employee.calculatePay();
            reportContent.append("Compensation for ").append(employee.getDetails()).append(": $").append(pay).append("\n");
        }
        
        return new Report(reportContent.toString());
    }
}
