package com.xworkz.encapsulation.internal;

public class Tank {

        private String type;
        private String model;
        private int capacity;
        private boolean armored;
        private double weight;

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public int getCapacity() {
            return capacity;
        }

        public boolean isArmored() {
            return armored;
        }

        public double getWeight() {
            return weight;
        }

        void setType(String type) {
            this.type = type;
        }

        void setModel(String model) {
            this.model = model;
        }

        void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        void setArmored(boolean armored) {
            this.armored = armored;
        }

        void setWeight(double weight) {
            this.weight = weight;
        }
    }

