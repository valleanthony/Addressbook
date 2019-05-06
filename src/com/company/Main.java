package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean mainSwitch = false;
        String userEntry;
        String nameMain;
        String phone;
        String address;
        String city;
        String state;
        String zip;
        String email;



        Scanner keyboard = new Scanner(System.in);
        System.out.println("Would you like to add a contact (Y/N)?");
        userEntry = keyboard.nextLine();

        if (userEntry.equalsIgnoreCase("Y")){
            mainSwitch = true;
        }


        else{
            mainSwitch = false;
        }

        while(mainSwitch == true) {
            System.out.println("Enter a name:");
            nameMain = keyboard.nextLine();
            Contact u1= new Contact();
            u1.setName(nameMain);
            System.out.println("Enter a phone:");
            phone = keyboard.nextLine();
            u1.setPhone(phone);
            System.out.println("Enter a Address");
            address = keyboard.nextLine();
            u1.setAddress(address);
            System.out.println("Enter a city");
            city = keyboard.nextLine();
            u1.setCity(city);
            System.out.println("Enter a state");
            state = keyboard.nextLine();
            u1.setState(state);
            System.out.println("Enter zip code");
            zip = keyboard.nextLine();
            u1.setZip(zip);
            System.out.println("Enter Email");
            email = keyboard.nextLine();
            u1.setEmail(email);

            System.out.println("Would you like to add another user(Y/N)?");
            userEntry = keyboard.nextLine();

            if(userEntry.equalsIgnoreCase("N")){
                mainSwitch = false;
            }
            else {

            }





        }

    }
}
