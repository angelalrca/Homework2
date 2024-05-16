public class Department {
    private String departmentId;
    private String status;
    private String supervisor;

    public Department(String departmentId, String position, String supervisor) {
        this.departmentId = departmentId;
        this.status = status;
        this.supervisor = supervisor;
    }

    public String getDetails() {
        return "Department ID: " + departmentId + ", Status: " + status + ", Supervisor: " + supervisor;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
}
