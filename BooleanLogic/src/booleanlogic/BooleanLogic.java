package booleanlogic;

import java.util.Scanner;

public class BooleanLogic {

//    public static void main(String[] args) {
//            boolean isActive = true;
//            boolean isBanned = false;
//            int age = 23;
//            
//            if(isActive && !isBanned && age>= 18){
//                System.out.println("isActive :" + isActive);
//                System.out.println("isBanned :" + isBanned);
//                System.out.println("Age :" + age);
//            }
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isActive = true;
        boolean isBanned = false;
        int age = 18;
        boolean hasPaidFee = true;

        System.out.println("Enter Username");
        String username = scanner.nextLine();

        if (username == null || username.isBlank()) {
            System.out.println("Please enter username");
        } else if (!isActive) {
            System.out.println("you accout not active");
        } else if (isBanned == true) {
            System.out.println("your accountr is bandded");
        } else if (age < 18) {
            System.out.println("age must upper 18+");
        } else if (hasPaidFee == false) {
            System.out.println("Please pay the fee first");
        } else {
            System.out.println("Welecome");
        }

        scanner.close();
        System.out.println("Active | Banned | Age>=18 | Paid | Eligible");
        System.out.println(isActive && !isBanned && age >= 18 && hasPaidFee);
        System.out.println(!isActive && !isBanned && age >= 18 && !hasPaidFee);
        System.out.println(!isActive && isBanned && age >= 18 && hasPaidFee);
        System.out.println(isActive && isBanned && age >= 18 && !hasPaidFee);
    }

}
