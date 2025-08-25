// java program to demonstrate Switch statement with respect to exception handling
import java.util.Scanner;
public class SwitchExercise {
    public static void main (String[] args) {
        int choice;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any number Between 1 to 6 of your choice: ");
        choice =sc.nextInt();
        switch (choice) {
            case 1: System.out.println("SUV");
            break;
            case 2: System.out.println("Micro");
            break;
            case 3: System.out.println("sedan");
            break;
            case 4: System.out.println("Offroader");
            break;
            case 5: System.out.println("Hatchback");
            break;
            case 6: System.out.println("Limousine");
            break;
            default: System.out.println("Invalid Choice");


        }

    }
}

