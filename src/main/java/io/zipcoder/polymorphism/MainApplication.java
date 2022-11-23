package io.zipcoder.polymorphism;

import io.zipcoder.pet.Cat;
import io.zipcoder.pet.Dog;
import io.zipcoder.pet.Dragon;
import io.zipcoder.pet.Pet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MainApplication <T extends Pet>{
    public static void main(String[] args) {

        Pet salamon = new Dog();
        salamon.setName("Salamon");
        Pet gatomon = new Cat();
        gatomon.setName("Gatomon");
        Pet magnadramon = new Dragon();
        magnadramon.setName("Magnadramon");

        List<Pet> petList = new ArrayList<Pet>();
        petList.add(salamon);
        petList.add(gatomon);
        petList.add(magnadramon);

        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO MY PET KINGDOM! PRESS 1 FOR NUMBER OF PETS!");
        int response = scanner.nextInt();
        scanner.nextLine();

        while(true) {
            if(response == 1) {
                System.out.println("THERE ARE CURRENTLY " + petList.size() + " PETS IN MY KINGDOM.\n");
                break;
            } else {
                System.out.println("NOT THE RIGHT OPTION. PLEASE TRY AGAIN");
                response = scanner.nextInt();
            }
        }
        System.out.println("PRESS 1 TO GET NAMES OF EACH PETS");
        response = scanner.nextInt();
        scanner.nextLine();

        while(true) {
            if(response == 1) {
                for (int i = 0; i < petList.size(); i++) {
                    System.out.println("PET " + (i+1) + " IS " + petList.get(i).getName());
                }
                break;
            }
            if (petList.size() == 0) {
                System.out.println("THERE ARE NO PETS");
                break;
            }
            if(response != 1) {
                System.out.println("NOT THE RIGHT OPTION. PLEASE TRY AGAIN");
                response = scanner.nextInt();
            }
        }

        System.out.println("\nPRESS 1 TO HEAR THEM SPEAK");
        response = scanner.nextInt();
        scanner.nextLine();

        while(true) {
            if(response == 1) {
                for (int i = 0; i < petList.size(); i++) {
                    System.out.println("PET " + petList.get(i).getName() + " says " + petList.get(i).speak());
                }
                break;
            }
            if(petList.size() == 0) {
                System.out.println("THERE ARE NO PETS");
                break;
            }
            if(response != 1) {
                System.out.println("NOT THE RIGHT OPTION. PLEASE TRY AGAIN");
                response = scanner.nextInt();
            }
        }
    }
}

