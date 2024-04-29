import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        List<Employee> employees = employeeManager.getAll();
        System.out.println("Employees : ");
        for (Employee employee : employees){
            System.out.println(employee.getId() + employee.getFirstName() + employee.getLastName() +
                    employee.getEmail() + employee.getDepartment());
        }
        System.out.println("--------------------");
        Employee employee3 = new Employee(3,"Arda","Sandal","ardas@gmail.com","1987","İnsan kaynakları");
        employeeManager.add(employee3);
        System.out.println("Employee added" + "\n" + "---------------------");

        Employee updatedEmployee = new Employee(1,"İpek","Yenigürbüz","ipeksandal@gmail.com",
                "12345","Yazılım mühendisi");
        employeeManager.update(updatedEmployee);
        System.out.println("Employee updated " + "\n" + "-----------------------");

        employeeManager.delete(3);
        System.out.println("Employee deleted");
        System.out.println("Employees : ");
        for (Employee employee : employees){
            System.out.println(employee.getId() + employee.getFirstName() + employee.getLastName() + employee.getDepartment());
        }
    }
}
