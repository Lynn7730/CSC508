import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        for (int i = 0; i < 3; i++) {
            String stName = JOptionPane.showInputDialog("Enter staff name");
            String stDepartment = JOptionPane.showInputDialog("Enter staff department");
            String stPhoneNo = JOptionPane.showInputDialog("Enter staff phone number");
            String stEmail = JOptionPane.showInputDialog("Enter staff email");
            int intPhoneNo = Integer.parseInt(stPhoneNo);
            Staff staff = new Staff(stName, stDepartment, intPhoneNo, stEmail);
            stack.push(staff);
        }

        Object staffData;
        Staff st;

        while (!stack.isEmpty()) {
            staffData = stack.pop();
            st = (Staff) staffData;
            JOptionPane.showMessageDialog(null, st.toString(), "Staff Information", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}