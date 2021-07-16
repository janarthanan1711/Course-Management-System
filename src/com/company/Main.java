package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!...Welcome to the student course app");
        Scanner scan = new Scanner(System.in);
        System.out.println("Create new User ID: ");
        String pass0 = scan.next();
        System.out.println("Your User id is now: "+pass0);
        System.out.println("Please enter your user id!");
        String pass = scan.next();

        while(!pass.equals(pass0)){
            System.out.println("Incorrect User ID");
            System.out.println("Try Again");
            pass = scan.next();
        }

        System.out.println("create a new Password: ");
        String pass1 = scan.next();
        System.out.println("Your Password is now: "+pass1);
        System.out.println("Please enter your Password!");
        String pass2 = scan.next();

        while(!pass2.equals(pass1)){
            System.out.println("Your password is incorrect please try again");
            pass2 = scan.next();
        }
        System.out.println("ACCESS GRANTED");
        System.out.println("Are you willing to study yes or no!!!!");
        String ans1 = scan.next();

        if(ans1.equals("yes")) {
            System.out.println("Choose what you are going to study!!!!");
            System.out.println("Available courses:PYTHON,JAVA,C++");
            String ans2 = scan.next();

            while (!ans2.equals("python") && !ans2.equals("java") && !ans2.equals("c++")) {
                System.out.println("Sorry we don't have it what would you like between JAVA,PYTHON,C++");
                ans2 = scan.next();
            }
            if (ans2.equals("python") || ans2.equals("java") || !ans2.equals("c++")) {
                System.out.println("Do you like study Additional courses!!! yes or no: ");
                String ans3 = scan.next();

                while (!ans3.equals("yes") && !ans3.equals("no")) {
                    System.out.println("Wrong comment please try again");
                    ans3 = scan.next();
                }
                if (ans3.equals("yes")) {
                    System.out.println("which Additional you like to study IOT or AI");
                    String ans4 = scan.next();

                    while (!ans4.equals("IOT") && !ans4.equals("AI")) {
                        System.out.println("Sorry currently available");
                        System.out.println("please choose between IOT and AI");
                        ans4 = scan.next();
                    }
                    if (ans4.equals("IOT") || ans4.equals("AI")) {
                        System.out.println("Great you have choosed" + ans2 + "and" + ans4 + "THANK YOU!!!!");
                    }
                    System.out.println("Please confirm your Password");
                    pass2 = scan.next();

                    while (!pass2.equals(pass1)) {
                        System.out.println("Your password is incorrect please try again");
                        pass2 = scan.next();
                    }
                    System.out.println("Thank you!!!....");
                    System.out.println("Your courses is now ready to study");

                } else {
                    System.out.println("you have booked " + ans2);

                    System.out.println("Please confirm your Password");
                    pass2 = scan.next();

                    while (!pass2.equals(pass1)) {
                        System.out.println("Your password is incorrect please try again");
                        pass2 = scan.next();
                    }
                }
            }
        }else{
            System.out.println("Alright have a good day!!!!!!");
        }


    }
}
