import java.util.ArrayList;

public class Payroll {

    protected ArrayList<Integer> employeeId = new ArrayList<Integer>();
    private ArrayList<Integer> hours = new ArrayList<Integer>();
    private ArrayList<Double> payRate = new ArrayList<Double>();
    private ArrayList<Double> wages = new ArrayList<Double>();

    public Payroll() {
        employeeId.add(556787);
        employeeId.add(987876);
        employeeId.add(654876);
        employeeId.add(231324);
        employeeId.add(986099);
        employeeId.add(554387);
        employeeId.add(765777);

        for (int i = 0; i < employeeId.size(); i++) {
            hours.add(0);
            payRate.add(0.0);
            wages.add(0.0);
        }
    };

    public int getEmployeeId(int i) {
        return employeeId.get(i);
    }

    public int getHours(int empId) {
        return hours.get(employeeId.indexOf(empId));
    }

    public double getPayRate(int empId) {
        return payRate.get(employeeId.indexOf(empId));
    }

    public double getWages(int empId) {
        return wages.get(employeeId.indexOf(empId));
    }

    public void setEmployeeId(int i, int empId) {
        employeeId.set(i, empId);
    }

    public void setHours(int i, int hrs) {
        hours.set(i, hrs);
    }

    public void setPayRate(int i, double pr) {
        payRate.set(i, pr);
    }

    public void calcWages(int empId) {
        double wg = getHours(empId) * getPayRate(empId);
        wages.set(employeeId.indexOf(empId), wg);
    }
}