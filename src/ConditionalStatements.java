import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {

        int temperature;

        Scanner input = new Scanner(System.in);

        System.out.print(" Please, enter the temperature : ");
        temperature = input.nextInt();

        if (temperature < 5)
            System.out.println(" You may go skiing. ");
        else if (temperature >= 5 && temperature <= 15) {
            System.out.println(" You may go to the cinema. ");
        } else if (temperature >= 15 && temperature <= 25) {
            System.out.println(" You may go to the picnic. ");
        } else if (temperature > 25) {
            System.out.println(" You may go swimming. ");
        }
    }
}

