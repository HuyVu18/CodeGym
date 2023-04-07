public class Address {
    String street;
    String number;
    String ward;
    String district;

    public Address(String street, String number, String ward, String district) {
        this.street = street;
        this.number = number;
        this.ward = ward;
        this.district = district;
    }

    public Address() {
        this.street = "street";
        this.number = "number";
        this.ward = "ward";
        this.district = "district";
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddressString() {
        return String.format("%s %s, ward %s, district %s", number, street, ward, district);
    }
}
