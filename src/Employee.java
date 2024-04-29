public class Employee extends User {
    private String department;
    public Employee(){

    }
    public Employee(Integer id, String firstName, String lastName, String email,
                    String password, String department){
        super(id,firstName, lastName, email, password);
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}
