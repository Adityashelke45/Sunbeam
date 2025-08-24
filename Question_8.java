import java.util.*;

class Student {
    String studentName;
    String rollNo;
    double totalMarks;

    // Function to read student details
    void readStudent(Scanner sc) {
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Roll Number (alphanumeric): ");
        rollNo = sc.nextLine();

        System.out.print("Enter Total Marks: ");
        totalMarks = sc.nextDouble();
        sc.nextLine(); // consume leftover newline
    }

    // Function to display student details
    void displayStudent() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name       : " + studentName);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Total Marks: " + totalMarks);
    }
}

public class Question_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create student object
        Student s = new Student();

        // Read and display
        s.readStudent(sc);
        s.displayStudent();

        sc.close();
    }
}
