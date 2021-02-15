package com.codecool.wasterecycling;

public class PaperGarbage extends Garbage {

        private String name;
        private boolean isSqueezed;

        public PaperGarbage(String name, boolean isSqueezed) {
                super(name);
                this.name = name;
                this.isSqueezed = isSqueezed;
        }

        public boolean isSqueezed() {
                return isSqueezed;
        }

        public void squeeze() {
                isSqueezed = true;
        }
/*
        @Override
        public String toString() {
                return super.toString() + "\n  Paper content: " + name;
        }
        */
}
