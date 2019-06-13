import java.util.Scanner;


public class WhatIf {
    public static void main(String[] args) {
        int num1, num2;

        Scanner key = new Scanner(System.in);


        while (true) {
            System.out.println("First number? : ");
            num1 = key.nextInt();

            System.out.println("Second Number? : ");
            num2 = key.nextInt();
            key.nextLine();

            int sum = (num1 + num2);
            int product = (num1 * num2);
            int average = ((num1 + num2) / 2);

            if (sum < 1000 && sum > 200) {
                System.out.println("Sum is ~" + sum + "*");
            } else if (sum < 1000) {
                System.out.println("Sum is ~" + sum);
            } else {
                System.out.println("Sum is " + sum + "*");
            }
            System.out.println("Product is " + product);
            System.out.println("Average is " + average);
            System.out.println("Would you like to go again ?");
            String answer = key.nextLine();
            if (answer.equalsIgnoreCase("yes")){
                System.out.println("Hooray!!!!");}
                else{
                System.out.println("Goodbye")
                    ;break;}
            }
        }

    }
