import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerManager {
    private List<Customer> customers;
    public CustomerManager(){
        customers = new ArrayList<>();
        Customer customer1 = new Customer(1,"İpek","Sandal","ipeksandal@gmail.com",
                "12345",535922110,"Ankara");
        Customer customer2 = new Customer(2,"Merda","Yılmaz","merda@gmail.com,",
                "5432", 542111111, "İstanbul");
        customers.add(customer1);
        customers.add(customer2);
    }
    public void add(Customer customer){
        customers.add(customer);
    }
    public List<Customer> getAll(){
        return customers;
    }
    public Customer getById(int id){
        for (Customer customer : customers){
            if(customer.getId() == id){
                return customer;
            }
        }return null;
    }
    public void update(Customer updateCustomer){
        for (Customer customer : customers){
            if (customer.getId() == updateCustomer.getId()){
                customer.setFirstName(updateCustomer.getFirstName());
                customer.setLastName(updateCustomer.getLastName());
                customer.setEmail(updateCustomer.getEmail());
                customer.setPassword(updateCustomer.getPassword());
                customer.setPhoneNumber(updateCustomer.getPhoneNumber());
                customer.setAddress(updateCustomer.getAddress());

            }
        }
    }
    public void delete(int id){
        Iterator<Customer> iterator = customers.iterator();
        while (iterator.hasNext()){
            Customer customer = iterator.next();
            if (customer.getId() == id){
                iterator.remove();
            }
        }
    }
}
