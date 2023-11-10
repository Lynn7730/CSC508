import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // To insert some data at front of the list
        JOptionPane.showMessageDialog(null, "Inserting customer data at the front of the list", "Customer From Front",
                JOptionPane.INFORMATION_MESSAGE);
        String stFront = JOptionPane.showInputDialog("How many would you like to add?");
        int intFront = Integer.parseInt(stFront);
        for (int i = 0; i < intFront; i++) {
            String stName = JOptionPane.showInputDialog("Enter customer name");
            String stIc = JOptionPane.showInputDialog("Enter customer IC");
            String stAddress = JOptionPane.showInputDialog("Enter customer address");
            String stPhoneNo = JOptionPane.showInputDialog("Enter customer phone number");
            int intIc = Integer.parseInt(stIc);
            int intPhoneNo = Integer.parseInt(stPhoneNo);
            Customer customer = new Customer(stName, intIc, stAddress, intPhoneNo);
            linkedList.insertAtFront(customer);
        }

        // To insert some data at back of the list
        JOptionPane.showMessageDialog(null, "Inserting customer data at the back of the list", "Customer From Back",
                JOptionPane.INFORMATION_MESSAGE);
        String stBack = JOptionPane.showInputDialog("How many would you like to add?");
        int intBack = Integer.parseInt(stBack);
        for (int n = 0; n < intBack; n++) {
            String stName = JOptionPane.showInputDialog("Enter customer name");
            String stIc = JOptionPane.showInputDialog("Enter customer IC");
            String stAddress = JOptionPane.showInputDialog("Enter customer address");
            String stPhoneNo = JOptionPane.showInputDialog("Enter customer phone number");
            int intIc = Integer.parseInt(stIc);
            int intPhoneNo = Integer.parseInt(stPhoneNo);
            Customer customer = new Customer(stName, intIc, stAddress, intPhoneNo);
            linkedList.insertAtBack(customer);
        }

        // To remove some data based on ic
        boolean deletion = true;
        while (deletion) {
            Object cust = linkedList.removeFromFront();
            LinkedList temp = new LinkedList();
            String stRemoveIc = JOptionPane.showInputDialog("Enter customer IC for deletion");
            int intRemoveIc = Integer.parseInt(stRemoveIc);

            while (cust != null) {
                Customer currCustomer = (Customer) cust;
                linkedList.getFirst();
                if (currCustomer.getIc() == intRemoveIc) {
                    int confirm = JOptionPane.showConfirmDialog(null,
                            "Do you wish to remove this customer?" + "\n" + currCustomer.toString());
                    if (confirm == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "Successfully Deleted.", "Alert",
                                JOptionPane.WARNING_MESSAGE);
                    } else {
                        temp.insertAtFront(currCustomer);
                    }
                    cust = linkedList.removeFromFront();
                }

                cust = temp.removeFromFront();

                while (cust != null) {
                    linkedList.insertAtFront(cust);
                    cust = temp.removeFromFront();
                }
            }

            int cont = JOptionPane.showConfirmDialog(null, "Do you wish to continue removing data?");
            if (cont == JOptionPane.YES_OPTION) {
                deletion = true;
            } else {
                deletion = false;
            }

        }

        // To find and display the customer info. based on phoneNumber
        String stFindPhoneNo = JOptionPane.showInputDialog("Enter customer phone number to search");
        int intFindPhoneNo = Integer.parseInt(stFindPhoneNo);
        Customer c = null;
        Object pnData = linkedList.getFirst();
        while (pnData != null) {
            c = (Customer) pnData;
            if (c.getPhoneNumber() == intFindPhoneNo) {
                JOptionPane.showMessageDialog(null,
                        "Customer information with " + intFindPhoneNo + " phone number: " + "\n" + c.toString(),
                        "Customer Information", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            pnData = linkedList.getNext();
        }

        // To count how many cust in the list
        Object countData = linkedList.getFirst();
        int noOfCust = 0;
        while (countData != null) {
            noOfCust++;
            countData = linkedList.getNext();
        }
        JOptionPane.showMessageDialog(null, "Number of customer in the list: " + noOfCust, "Number of customer",
                JOptionPane.INFORMATION_MESSAGE);
    }
}