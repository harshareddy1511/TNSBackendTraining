//Java Program to check the student grades
class Grades {
    public static void main (String[] args) {
        int marks = 74;
        if (marks >= 90) {
            System.out.println("A Grade");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks <= 60) {
            System.out.println("Failed");
        }
    }
}
