package com.xworkz.servlets;

public class LaboratoryDto {
    private String studentName;
    private String rollNumber;
    private String labName;
    private String purpose;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getStudentName() {
        return studentName;
    }
    public String getRollNumber() {
        return rollNumber;
    }
    public String getLabName() {
        return labName;
    }
    public String getPurpose() {
        return purpose;
    }
    @Override
    public String toString() {
        return "LaboratoryDto{" +
                "studentName='" + studentName + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                ", labName='" + labName + '\'' +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}
