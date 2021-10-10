package user_input;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        //////////////Input Name////////////////

        Scanner nameInput = new Scanner(System.in);

        System.out.println("What is your name?");

        String name = nameInput.nextLine();

        //////////////Input Food////////////////

        Scanner foodInput = new Scanner(System.in);

        System.out.println("What is your favorite food?");

        String food = foodInput.nextLine();

        System.out.println("Your name is: " + name + ".");
        System.out.println("And your favorite food is: " + food + ".");
        System.out.println();

        //////////////Input Age/////////////////

        Scanner inputNumber = new Scanner(System.in);

        System.out.println("What is you age?");

        int standardNumber, ageGet;

        standardNumber = 40;

        ageGet = inputNumber.nextInt();

        if (ageGet > standardNumber) {
            System.out.println("You are older than 40 years old!");
        }
        else if (ageGet == standardNumber) {
            System.out.println("You are currently 40 years old!");
        }
        else {
            System.out.println("You are younger than 40 years old!");
        }
        System.out.println();

        ////////////Adding Integers/////////////

        System.out.println("Get ready to add to integers together.");

        int num1, num2, sum;
        Scanner add = new Scanner(System.in);

        System.out.println("Type the first integer.");
        num1 = add.nextInt();

        System.out.println("Type the second integer.");
        num2 = add.nextInt();

        sum = num1 + num2;

        System.out.println("The sum of the integers provided equals: " + sum);
        System.out.println("Great job!");

        nameInput.close();
        foodInput.close();
        inputNumber.close();
        add.close();
    }
}
