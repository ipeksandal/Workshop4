import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        List<Customer> customers = customerManager.getAll();
        System.out.println("Customers : ");
        for (Customer customer : customers){
            System.out.println(customer.getId() + customer.getFirstName() + customer.getLastName() +
                     customer.getEmail());
        }
        System.out.println("--------------------");
        Customer customer3 = new Customer(3,"Arda","Sandal","ardas@gmail.com",
                "987",12312312,"Ankara");
        customerManager.add(customer3);
        System.out.println("Customer added" + "\n" + "---------------------");

        Customer updatedCustomer = new Customer(1,"İpek","Yenigürbüz","ipeksandal@gmail.com",
                "12345",535922110,"Ankara");
        customerManager.update(updatedCustomer);
        System.out.println("Customer updated " + "\n" + "-----------------------");

        customerManager.delete(3);
        System.out.println("Customer deleted");
        System.out.println("Customers : ");
        for (Customer customer : customers){
            System.out.println(customer.getId() + customer.getFirstName() + customer.getLastName());
        }
    }
}
