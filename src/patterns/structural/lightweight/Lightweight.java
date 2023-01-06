package patterns.structural.lightweight;

public class Lightweight {
    public static void main(String[] args) throws Exception {
        EmployeeDepartment employeeDepartment = new EmployeeDepartment();
        Employee employee1 = employeeDepartment.getEmployee("Lawyer");
        employee1.work();
        Employee employee2 = employeeDepartment.getEmployee("Accountant");
        employee2.work();
        Employee employee3 = employeeDepartment.getEmployee("Lawyer");
        employee1.work();
        Employee employee4 = employeeDepartment.getEmployee("Accountant");
        employee2.work();
        Employee employee5 = employeeDepartment.getEmployee("Lawyer");
        employee1.work();
        Employee employee6 = employeeDepartment.getEmployee("Accountant");
        employee2.work();
        Employee employee7 = employeeDepartment.getEmployee("Lawyer");
        employee1.work();
        Employee employee8 = employeeDepartment.getEmployee("Accountant");
        employee2.work();


    }
}
