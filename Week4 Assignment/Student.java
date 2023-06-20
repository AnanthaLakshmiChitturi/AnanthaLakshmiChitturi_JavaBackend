import java.util.ArrayList;

class MyStudent {
    private String firstName;
    private String lastName;
    private double gpa;

    public MyStudent(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (GPA: " + gpa + ")";
    }
}

class Student {
    public static void main(String[] args) {
        // Create an ArrayList of Students
        ArrayList<MyStudent> students = new ArrayList<>();
        students.add(new MyStudent("John", "Doe", 3.8));
        students.add(new MyStudent("Jane", "Smith", 4.0));
        students.add(new MyStudent("David", "Johnson", 3.5));
        students.add(new MyStudent("Emily", "Brown", 3.2));
        students.add(new MyStudent("Michael", "Davis", 3.9));

        // Calculate the average GPA
        double totalGpa = 0;
        for (MyStudent student : students) {
            totalGpa += student.getGpa();
        }
        double averageGpa = totalGpa / students.size();

        // Remove students with GPA less than the average GPA
        ArrayList<MyStudent> remainingStudents = new ArrayList<>();
        for (MyStudent student : students) {
            if (student.getGpa() >= averageGpa) {
                remainingStudents.add(student);
            }
        }

        // Print the remaining students
        System.out.println("Remaining students:");
        for (MyStudent student : remainingStudents) {
            System.out.println(student);
        }
    }
}
