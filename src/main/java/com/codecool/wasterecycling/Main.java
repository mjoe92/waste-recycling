package com.codecool.wasterecycling;

import java.util.ArrayList;

import static com.codecool.wasterecycling.InputDisplayManager.*;

public class Main {

    private static final ArrayList<Dustbin> dustbins = new ArrayList<>();

    public static void main(String[] args) {

        boolean trigger = true;
        while (trigger) {
                int option;
                if (dustbins.size() == 0) {
                        messageWithScannerInString(false, displayWelcome());
                        option = 1;
                } else {
                        String displayBeginning = "Choose an option:\n" + displayMenu();
                        option = messageWithScannerInInt(true, displayBeginning);
                }

                switch (option) {
                    case 1:
                            String nameOfDustbin = messageWithScannerInString(true, displayCreateDustbin());
                            Dustbin newDustbin = new Dustbin(nameOfDustbin);
                            Dustbin theDustbin;
                            dustbins.add(newDustbin);
                            break;
                    case 2:
                            Dustbin chosenDustbin = dustbins.get(0);
                            if (dustbins.size() != 1) {
                                    int indexOfDustbin = messageWithScannerInInt(true, displayAllDustbins(dustbins)) - 1;
                                    chosenDustbin = dustbins.get(indexOfDustbin);
                            } else {
                                    System.out.println("The chosen bin (the only available): " + chosenDustbin);
                            }
                            theDustbin = chosenDustbin;
                            boolean isThrowGarbage = true;
                            while (isThrowGarbage) {
                                    int typeOfGarbage = messageWithScannerInInt(true, displayGarbageType(theDustbin));
                                    String nameOfGarbage = messageWithScannerInString(true, displayGarbageName());
                                    Garbage garbage;
                                    boolean isProcessed = true;
                                    switch (typeOfGarbage) {
                                            case 1: //paper
                                                    boolean isSqueezed = false;
                                                    while (isProcessed) {
                                                            try {
                                                                    isSqueezed = Boolean.parseBoolean(messageWithScannerInString(true, displaySqueeze()));
                                                                    isProcessed = false;
                                                            } catch (Exception ex) {
                                                                    displayFalseInput();
                                                            }
                                                    }
                                                    garbage = new PaperGarbage(nameOfGarbage, isSqueezed);
                                                    break;
                                            case 2: //plastic
                                                    boolean isCleaned = false;
                                                    while (isProcessed) {
                                                            try {
                                                                    isCleaned = Boolean.parseBoolean(messageWithScannerInString(true, displayClean()));
                                                                    isProcessed = false;
                                                            } catch (Exception ex) {
                                                                    displayFalseInput();
                                                            }
                                                    }
                                                    garbage = new PlasticGarbage(nameOfGarbage, isCleaned);
                                                    break;
                                            case 3: //waste
                                                    garbage = new Garbage(nameOfGarbage);
                                                    break;
                                            case 4: //go back to menu
                                                    garbage = null;
                                                    isThrowGarbage = false;
                                                    break;

                                            default: //other
                                                    garbage = null;
                                    }
                                    if (garbage != null || theDustbin != null) theDustbin.throwOutGarbage(garbage);
                            }
                            break;
                    case 3:
                            for (Dustbin dustbin : dustbins) {
                                    dustbin.emptyContents();
                            }
                            dustbins.clear();
                            break;
                    case 4:
                            for (int i = 0; i < dustbins.size(); i++) {
                                    dustbins.get(i).displayContents();
                            }
                            messageWithScannerInInt(true, "\n(Press any key to continue)");
                            break;

                }


        }
    }
}
