public class Staff {
    private String staffName;
    private String staffDepartment;
    private int staffPhoneNo;
    private String staffEmail;

    public Staff() {
        staffName = "";
        staffDepartment = "";
        staffPhoneNo = 0;
        staffEmail = "";
    }

    public Staff(String staffName, String staffDepartment, int staffPhoneNo, String staffEmail) {
        this.staffName = staffName;
        this.staffDepartment = staffDepartment;
        this.staffPhoneNo = staffPhoneNo;
        this.staffEmail = staffEmail;
    }

    public void setStaff(String name, String department, int phoneNo, String email) {
        staffName = name;
        staffDepartment = department;
        staffPhoneNo = phoneNo;
        staffEmail = email;
    }

    public String getName() {
        return staffName;
    }

    public String getDepartment() {
        return staffDepartment;
    }

    public int getPhoneNo() {
        return staffPhoneNo;
    }

    public String getEmail() {
        return staffEmail;
    }

    public String toString() {
        return ("Staff name = " + staffName + "\n" + "Staff department = " + staffDepartment + "\n"
                + "Staff phone number  = "
                + staffPhoneNo + "\n" + "Staff email = " + staffEmail);
    }
}