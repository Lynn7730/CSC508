import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {

        Payroll pr = new Payroll();

        // Test
        String hours = JOptionPane.showInputDialog("Enter employee " + pr.getEmployeeId(0) + " hours worked.");
        String payRate = JOptionPane.showInputDialog("Enter employee " + pr.getEmployeeId(0) + " pay rate.");
        int intHours = Integer.parseInt(hours);
        double doublePayRate = Double.parseDouble(payRate);
        pr.setHours(0, intHours);
        pr.setPayRate(0, doublePayRate);

        pr.calcWages(pr.getEmployeeId(0));
        System.out.println("Employee " + pr.getEmployeeId(0) + " wages is " + pr.getWages(0));

        // Main code
        /*
         * for (int i = 0; i < pr.employeeId.size(); i++) {
         * String hours = JOptionPane.showInputDialog("Enter employee " +
         * pr.getEmployeeId(i) + " hours worked.");
         * String payRate = JOptionPane.showInputDialog("Enter employee " +
         * pr.getEmployeeId(i) + " pay rate.");
         * int intHours = Integer.parseInt(hours);
         * double doublePayRate = Double.parseDouble(payRate);
         * pr.setHours(i, intHours);
         * pr.setPayRate(i, doublePayRate);
         * }
         * 
         * for (int x = 0; x < pr.employeeId.size(); x++) {
         * pr.calcWages(pr.getEmployeeId(x));
         * System.out.println("Employee " + pr.getEmployeeId(x) + " wages is " +
         * pr.getWages(x));
         * }
         */
    }
}
