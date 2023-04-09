public class User {
    private String id;
    private String name;
    private String password;
    private String phone;
    private Address address;

    public User(String id, String name, String password, String phone, Address address) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.address = address;
    }

    public User() {
        this.id = "id";
        this.name = "name";
        this.password = "password";
        this.phone = "not set";
        this.address = new Address();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void printUserInfo() {
        System.out.println("Username: " + getName());
        System.out.println("Phone number: " + getPhone());
        System.out.println("Address: " + address.getAddressString());
    }
}
