package com.codecool.wasterecycling;

import java.util.ArrayList;

public class Dustbin {

        private String color;

        public Dustbin(String color) {
                this.color = color;
        }

        private int houseWasteCount;
        private int paperCount;
        private int plasticCount;

        public String getColor() {
                return color;
        }

        public int getHouseWasteCount() {
                return houseWasteCount;
        }

        public int getPaperCount() {
                return paperCount;
        }

        public int getPlasticCount() {
                return plasticCount;
        }

        private ArrayList<Garbage> dustbinContents = new ArrayList<>();

        public ArrayList<Garbage> getDustbinContents() {
                return dustbinContents;
        }

        public void throwOutGarbage(Garbage garbage) {
                if (garbage instanceof PaperGarbage && ((PaperGarbage) garbage).isSqueezed()) {
                        dustbinContents.add(garbage);
                        paperCount++;
                } else if (garbage instanceof PlasticGarbage && ((PlasticGarbage) garbage).isClean()) {
                        dustbinContents.add(garbage);
                        plasticCount++;
                } else if (garbage instanceof Garbage) {
                        dustbinContents.add(garbage);
                        houseWasteCount++;
                } else {
                        try {
                                new DustbinContentException().wrongContentException();
                        } catch (Exception e) {
                                e.printStackTrace();
                        }
                }
        }

        public void emptyContents() {
                houseWasteCount = paperCount = plasticCount = 0;
                dustbinContents.clear();
        }

        public void displayContents() {
                System.out.println(dustbinContents);
        }

        @Override
        public String toString() {
                String houseWasteContents, paperContents, plasticContents;
                houseWasteContents = paperContents = plasticContents = "";
                for (int i = 0; i < dustbinContents.size(); i++) {
                        plasticContents += (dustbinContents.get(i) instanceof PlasticGarbage)
                                ? "\n  " + i + ".) " + dustbinContents.get(i) : "";
                        paperContents += (dustbinContents.get(i) instanceof PaperGarbage)
                                ? "\n  " + i + ".) " + dustbinContents.get(i) : "";
                        houseWasteContents += (!(dustbinContents.get(i) instanceof PaperGarbage) &&
                                !(dustbinContents.get(i) instanceof PaperGarbage))
                                ? "\n  " + i + ".) " + dustbinContents.get(i) : "";
                }
                return "\n" + getColor() + " dustbin!" +
                        "\n " + getHouseWasteCount() + " item(s) of house waste content." +
                        "\n  " + houseWasteContents +
                        "\n " + getPaperCount() + " item(s) of paper content." +
                        "\n  " + paperContents +
                        "\n " + getPlasticCount() + " item(s) of plastic content." +
                        "\n  " + plasticContents;
        }
}
