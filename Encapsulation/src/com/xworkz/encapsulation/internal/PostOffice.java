package com.xworkz.encapsulation.internal;

public class PostOffice {

        private String name;
        private String location;
        private int numberOfEmployees;
        private boolean isOperational;
        private double revenue;

        public String getName() {
            return name;
        }

        public String getLocation() {
            return location;
        }

        public int getNumberOfEmployees() {
            return numberOfEmployees;
        }

        public boolean isOperational() {
            return isOperational;
        }

        public double getRevenue() {
            return revenue;
        }

        void setName(String name) {
            this.name = name;
        }

        void setLocation(String location) {
            this.location = location;
        }

        void setNumberOfEmployees(int numberOfEmployees) {
            this.numberOfEmployees = numberOfEmployees;
        }

        void setIsOperational(boolean isOperational) {
            this.isOperational = isOperational;
        }

        void setRevenue(double revenue) {
            this.revenue = revenue;
        }
    }

