package patterns.structural.lightweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDepartment {
    private final Map<String, Employee> employeeDepartment = new HashMap<>();

    public Employee getEmployee(String type) throws Exception {
        Employee result;
        if (employeeDepartment.containsKey(type)) {
            result = employeeDepartment.get(type);
        } else {
            switch (type) {
                case "Accountant":
                    result = new Accountant();
                    employeeDepartment.put(type, result);
                    break;
                case "Lawyer":
                    result = new Lawyer();
                    employeeDepartment.put(type, result);
                    break;
                default:
                    throw new Exception("It is not possible");
            }
        }
        return result;
    }
}