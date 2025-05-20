package com.xworkz.Dto;

public class FIRDto {
    private String name;
    private String complaintName;
    private String phone;
    private String address;
    private String incidentDate;

    public void setName(String name) {
        this.name = name;
    }
    public void setComplaintName(String complaintName) {
        this.complaintName = complaintName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setIncidentDate(String incidentDate) {
        this.incidentDate = incidentDate;
    }

    public String getName() {
        return name;
    }
    public String getComplaintName() {
        return complaintName;
    }

    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }
    public String getIncidentDate() {
        return incidentDate;
    }
    @Override
    public String toString() {
        return "FIRDto{" +
                "complaintName='" + complaintName + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", incidentDate='" + incidentDate + '\'' +
                '}';
    }
}
