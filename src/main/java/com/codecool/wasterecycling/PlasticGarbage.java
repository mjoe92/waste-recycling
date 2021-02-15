package com.codecool.wasterecycling;

public class PlasticGarbage extends Garbage {

        private String name;
        private boolean isClean;

        public PlasticGarbage(String name, boolean isClean) {
                super(name);
                this.name = name;
                this.isClean = isClean;
        }

        public boolean isClean() {
                return isClean;
        }

        public void clean() {
                isClean = true;
        }
/*
        @Override
        public String toString() {
                return super.toString() + "\n  Plastic content: " + name;
        }
        */
}
