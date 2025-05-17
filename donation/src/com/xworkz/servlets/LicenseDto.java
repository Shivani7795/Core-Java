package com.xworkz.servlets;

public class LicenseDto {
    private String applicantName;
    private String email;
    private String licenseType;
    private String address;

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public String getEmail() {
        return email;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public String getAddress() {
        return address;
    }
    @Override
    public String toString() {
        return "LicenseDto{" +
                "applicantName='" + applicantName + '\'' +
                ", email='" + email + '\'' +
                ", licenseType='" + licenseType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
