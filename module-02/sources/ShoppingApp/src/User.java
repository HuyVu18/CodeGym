public class User {
    String id;
    String name;
    String password;
    String phone;
    Address address;

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
        this.phone = "phone";
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

    public String getAddressString() {
        return address.getAddressString();
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
