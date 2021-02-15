package com.codecool.wasterecycling;

import java.util.ArrayList;
import java.util.Scanner;

public class InputDisplayManager {

    public static String messageWithScannerInString(boolean inputTrigger, String message) {
        System.out.println(message);
        if (inputTrigger) {
            Scanner scanner = new Scanner(System.in);
            return inputOrQuit(scanner);
        }
        return "";
    }
    public static int messageWithScannerInInt(boolean inputTrigger, String message) {
        try {
            return Integer.parseInt(messageWithScannerInString(inputTrigger, message));
        } catch (Exception ex) {
            System.out.println();
            return -1;
        }
    }

    public static String displayWelcome() {
            return "\nWelcome to Waste Recycling whatever...!";
    }

    public static String displayMenu() {
        String represent = "\n 1. Create new dustbin"
                + "\n 2. Throw garbage into chosen dustbin"
                + "\n 3. Clear all dustbins"
                + "\n 4. List all bins with garbage"
                + "\n" + displayLeaveProgram();
        return represent;
    }
    public static String displayCreateDustbin() {
        return "Name the dustbin (Green, blue etc.):\n";
    }
    public static String displayAllDustbins(ArrayList<Dustbin> dustbins) {
            String represent = "\nChoose a dustbin:";
            for (int i = 0; i < dustbins.size(); i++) {
                    represent += "\n " + (i + 1) + ". " + dustbins.get(i);
            }
            return represent;
    }
    public static String displayGarbageType(Dustbin dustbin) {
        String represent = "\nChoose garbage type you want to throw into the '"
                + dustbin.getColor() + "':"
                + "\n 1. Paper content"
                + "\n 2. Plastic content"
                + "\n 3. Waste garbage"
                + "\n 4. Go back"
                + "\n" + displayLeaveProgram();
        return represent;
    }
    public static String displayGarbageName() {
        return "\nThe name of the garbage:";
    }
    public static String displaySqueeze() {
        return "\nDo you want to squeeze it?";
    }
    public static String displayClean() {
        return "\nDo you want to clean it?";
    }

    public static String inputOrQuit(Scanner userInput) {
        String input = userInput.nextLine();
        if (input.toLowerCase().equals("exit") || input.toLowerCase().equals("quit")) {
            System.out.println("Thank you for your time! Come back soon visiting the dustbins!");
            System.exit(0);
        }
        return input;
    }

    public static String displayFalseInput() {
        return "False input, choose yes or no (true or false)!";
    }

    public static String displayLeaveProgram() {
        return "Type 'quit' or 'exit' to leave the program!";
    }

}
