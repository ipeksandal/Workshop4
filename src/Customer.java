public class Customer extends User {
    private int phoneNumber;
    private String address;
    public Customer(){

    }
    public Customer(Integer id, String firstName, String lastName,
                    String email,String password, int phoneNumber, String address){
        super(id, firstName, lastName,email, password);
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
