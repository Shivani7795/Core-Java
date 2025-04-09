package com.xworkz.encapsulation.internal;

public class Occupation {

        private String title;
        private String field;
        private int yearsOfExperience;
        private boolean isFullTime;
        private double salary;

        public String getTitle() {
            return title;
        }

        public String getField() {
            return field;
        }

        public int getYearsOfExperience() {
            return yearsOfExperience;
        }

        public boolean isFullTime() {
            return isFullTime;
        }

        public double getSalary() {
            return salary;
        }

        void setTitle(String title) {
            this.title = title;
        }

        void setField(String field) {
            this.field = field;
        }

        void setYearsOfExperience(int yearsOfExperience) {
            this.yearsOfExperience = yearsOfExperience;
        }

        void setIsFullTime(boolean isFullTime) {
            this.isFullTime = isFullTime;
        }

        void setSalary(double salary) {
            this.salary = salary;
        }
    }

