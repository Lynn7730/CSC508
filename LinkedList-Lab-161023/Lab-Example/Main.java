import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        LinkedList theList = new LinkedList();

        // to input 5 students into the list
        for (int i = 0; i < 5; i++) {
            String sIdStd = JOptionPane.showInputDialog("Enter student id");
            String nameStd = JOptionPane.showInputDialog("Enter name");
            String sPart = JOptionPane.showInputDialog("Enter part");
            String sCgpa = JOptionPane.showInputDialog("Enter cgpa");
            int iIdStd = Integer.parseInt(sIdStd);
            int iPart = Integer.parseInt(sPart);
            double dCgpa = Double.parseDouble(sCgpa);
            Student stud = new Student(iIdStd, nameStd, iPart, dCgpa);
            theList.insertAtFront(stud); // OR theList.insertAtBack(stud); }
            // to display all students in the linked list
            System.out.println("LIST OF STUDENTS:");
            Student S = null;
            Object data = theList.getFirst();
            while (data != null) {
                S = (Student) data;
                System.out.println(S.toString());
                data = theList.getNext();
            } // while
              // to find the best student
              // to count the number of students in part 4
              // to count the number of students who reach cgpa 3.0
            Student NewStudent = new Student();
            data = theList.getFirst();
            int part4 = 0;
            int scorer = 0;
            while (data != null) {
                double cg = 0.0;
                S = (Student) data;
                if (S.getCgpa() > cg) {
                    cg = S.getCgpa();
                    NewStudent = S;
                }
                if (S.getPart() == 4)
                    part4++;
                if (S.getCgpa() > 3.00)
                    scorer++;
                data = theList.getNext();
            } // while
            System.out.println("The best student is :");
            System.out.println(NewStudent.toString());
            System.out.println("There are " + part4 + " part 4 students");
            System.out.println("There are " + scorer + "students who score 3.0 and above");
            // to delete a student
            data = theList.removeFromFront(); // OR data = theList.removeFromBack();
            if (data != null) {
                S = (Student) data;
                System.out.println("DATA DELETED");
                System.out.println(S.toString());
            } else
                System.out.println("CANNOT DELETE - LIST EMPTY");
        } // main
    }
}
// LinkListApp