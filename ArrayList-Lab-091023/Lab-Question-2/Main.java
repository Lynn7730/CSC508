import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        Payroll pr = new Payroll();

        // Main code
        for (int i = 0; i < pr.employeeId.size(); i++) {
            String hours = JOptionPane.showInputDialog("Enter employee " + pr.getEmployeeId(i) + " hours worked.");
            int intHours = Integer.parseInt(hours);
            while (intHours <= 0) {
                JOptionPane.showMessageDialog(null, "Employee working hours must not be zero or a negative number",
                        "Error", JOptionPane.ERROR_MESSAGE);
                hours = JOptionPane.showInputDialog("Enter employee " + pr.getEmployeeId(i) + " hours worked.");
                intHours = Integer.parseInt(hours);
            }

            String payRate = JOptionPane.showInputDialog("Enter employee " + pr.getEmployeeId(i) + " pay rate.");
            double doublePayRate = Double.parseDouble(payRate);
            while (doublePayRate < 6.0) {
                JOptionPane.showMessageDialog(null, "Employee pay rate must not be less than 6.0",
                        "Error", JOptionPane.ERROR_MESSAGE);
                payRate = JOptionPane.showInputDialog("Enter employee " + pr.getEmployeeId(i) + " pay rate.");
                doublePayRate = Double.parseDouble(payRate);
            }

            pr.setHours(i, intHours);
            pr.setPayRate(i, doublePayRate);
        }

        for (int x = 0; x < pr.employeeId.size(); x++) {
            pr.calcWages(pr.getEmployeeId(x));
            JOptionPane.showMessageDialog(null, "Employee " + pr.getEmployeeId(x) + " wages is " +
                    pr.getWages(pr.getEmployeeId(x)), "Wages", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
