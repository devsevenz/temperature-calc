import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double input;
        String input1;
        String[] temp = {"Farenheit", "Celsius", "Kelvin"};
        double kelvin = 0.0;
        double celcius = 0.0;
        double farenheit = 0.0;
        boolean choice = true;


        System.out.println("TEMPERATURE CALCULATOR!");
        //input
        do {
            System.out.print("Please enter the temperature: ");

            if (!sc.hasNextDouble()){
                System.out.println("Please enter a valid temperature!");
                return;
            }else {
                input = sc.nextDouble();
            }
            System.out.print("Enter if its celsius, farenheit, or kelvin: ");
            input1 = sc.next().toLowerCase();

           if (!input1.equalsIgnoreCase("farenheit") && !input1.equalsIgnoreCase("celsius") && !input1.equalsIgnoreCase("kelvin")){
               System.out.println("Please enter a valid temperature!");
               return;
           }

           //process
            if(input1.equals("farenheit")){
                celcius = (5 / 9) * (input - 32);
                kelvin = (5 / 9) * (input - 32) + 273.15;
            } else if (input1.equals("celsius")) {
                farenheit = (input * 9/5) + 32;
                kelvin = input + 273.15;
            } else if (input1.equals("kelvin")) {
                celcius = input - 273.15;
                farenheit = (9/5) * (input - 273.15) + 32;

            }

            //output
            System.out.println("CONVERTED TEMPERATURES: "  );
            System.out.println("Celsius: " + celcius);
            System.out.println("Kelvin: " + kelvin);
            System.out.println("Farenheit: " + farenheit);

            //loop
            System.out.print("Do you want to perform another calculation? (y/n): ");
            choice = sc.next().equalsIgnoreCase("y");
        }while (choice);
    }
}