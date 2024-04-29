import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;
    public EmployeeManager(){
        employees = new ArrayList<>();
        Employee employee1 = new Employee(1, "Merve", "Öz", "merveÖ@gmail.com", "123",
                "İnsan Kaynakları");
        Employee employee2 = new Employee(2,"İpek","Kaya","ipek.kaya@gmail.com","abcde",
                "Yazılım Mühendisi");
        employees.add(employee1);
        employees.add(employee2);
    }
    public void add(Employee employee){
        employees.add(employee);
    }
    public List<Employee> getAll(){
        return employees;
    }
    public Employee getById(int id){
        for(Employee employee : employees){
            if(employee.getId() == id){
                return employee;
            }
        }return null;
    }
    public void update(Employee updateEmployee){
        for (Employee employee : employees){
            if (employee.getId() == updateEmployee.getId()){
                employee.setFirstName(updateEmployee.getFirstName());
                employee.setLastName(updateEmployee.getLastName());
                employee.setEmail(updateEmployee.getEmail());
                employee.setPassword(updateEmployee.getPassword());
                employee.setDepartment(updateEmployee.getDepartment());
            }
        }
    }
    public void delete(int id){
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            if (employee.getId() == id){
                iterator.remove();
            }
        }
    }
}
