/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author mlarrubia
 */
public class JavaIdentificationCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Happy Coding!

        // substring
        // indexOf
        // lastIndexOf
        // length
        // toUpperCase
        // concatenate

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter your name: ");
        String name = input.nextLine();

        System.out.println("PLease enter your location: ");
        String location = input.nextLine();

        System.out.println("Please enter your DOB");
        String dob = input.nextLine();

        System.out.println("Please Enter your Gender: ");
        String gender = input.nextLine();

        // First Letter of First Name
        String firstLetterFirstname = name.substring(0, 1);

        int indexOfSpace = name.indexOf(" ");
        int beginningIndex = indexOfSpace + 1;
        int endingIndex = indexOfSpace + 2;

        String firstLetterLastName = name.substring(beginningIndex, endingIndex);

        String hyphen = "-";

        // Last 3 of zip code
        String zipcode = location.substring(location.length() - 3);
        // last 2 of DOB
        String yearDOB = dob.substring(dob.length() - 2);

        // First letter of gender
        String genderLetter = gender.substring(0, 1);

        // State
        int indexOfComma = location.indexOf(", ");
        String state = location.substring(indexOfComma + 2, indexOfComma + 4);

        String id = firstLetterFirstname + firstLetterLastName + hyphen + zipcode + yearDOB + hyphen + genderLetter
                + state;

        String finalID = id.toUpperCase();

        System.out.println("Code: " + finalID);

    }

}
