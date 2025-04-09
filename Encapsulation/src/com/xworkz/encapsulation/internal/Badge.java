package com.xworkz.encapsulation.internal;

public class Badge {

        private String id;
        private String ownerName;
        private String designation;
        private String department;
        private boolean isActive;

        public String getId() {
            return id;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public String getDesignation() {
            return designation;
        }

        public String getDepartment() {
            return department;
        }

        public boolean isActive() {
            return isActive;
        }

        void setId(String id) {
            this.id = id;
        }

        void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }

        void setDesignation(String designation) {
            this.designation = designation;
        }

        void setDepartment(String department) {
            this.department = department;
        }

        void setIsActive(boolean isActive) {
            this.isActive = isActive;
        }
    }

