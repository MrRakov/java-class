import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter GPA: ");
            double gpa = sc.nextDouble();

            UndergradStudent z = new UndergradStudent(age, gpa);
            GradStudent x = new GradStudent(age, gpa);
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}