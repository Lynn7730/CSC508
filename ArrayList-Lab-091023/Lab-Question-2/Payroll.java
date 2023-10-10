public class Payroll {
    private int employeeID;
    private int hours;
    private double payRate;
    private double wages;

    public Payroll() {
        employeeID = 0;
        hours = 0;
        payRate = 0.0;
        wages = 0.0;
    }

    public Payroll(int employeeID, int hours, double payRate, double wages) {
        this.employeeID = employeeID;
        this.hours = hours;
        this.payRate = payRate;
        this.wages = wages;
    }

    public void setPayroll(int id, int hr, double pr, double wg) {
        employeeID = id;
        hours = hr;
        payRate = pr;
        wages = wg;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public int getHours() {
        return hours;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getWages() {
        return wages;
    }
}