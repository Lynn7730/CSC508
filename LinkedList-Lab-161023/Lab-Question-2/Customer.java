public class Customer {
    private String name;
    private int ic;
    private String address;
    private int phoneNumber;

    public Customer() {
        name = "";
        ic = 0;
        address = "";
        phoneNumber = 0;
    }

    public Customer(String name, int ic, String address, int phoneNumber) {
        this.name = name;
        this.ic = ic;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void setCustomer(String n, int i, String ad, int pn) {
        name = n;
        ic = i;
        address = ad;
        phoneNumber = pn;
    }

    public String getName() {
        return name;
    }

    public int getIc() {
        return ic;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String toString() {
        return ("Customer name = " + name + "\n" + "Customer ic = " + ic + "\n" + "Customer address  = " + address
                + "\n" + "Customer phone number = " + phoneNumber);
    }
}