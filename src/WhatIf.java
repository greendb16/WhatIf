import java.util.Scanner;


public class WhatIf {
    public static void main(String[] args) {
        double num1, num2;

        Scanner key = new Scanner(System.in);


        while (true) {
            System.out.println("First number? : ");
            num1 = key.nextDouble();

            System.out.println("Second Number? : ");
            num2 = key.nextDouble();
            key.nextLine();

            double sum = (num1 + num2);
            double product = (num1 * num2);
            double average = ((num1 + num2) / 2);

            if (sum < 1000 && sum > 200) {
                System.out.printf("Sum is ~%.02f*\n", sum); //+ sum + "*");
            } else if (sum < 1000) {
                System.out.printf("Sum is ~%.02f\n", sum);
            } else {
                System.out.printf("Sum is %.02f*\n", sum);
            }
            System.out.printf("Product is %.02f\n", product);
            System.out.printf("Average is %.02f\n", average );
            System.out.println("\nWould you like to go again ?");
            String answer = key.nextLine();
            if (answer.equalsIgnoreCase("yes")){
                System.out.println("Hooray!!!!\n");}
                else{
                System.out.println("Goodbye")
                    ;break;}
            }
        }

    }
