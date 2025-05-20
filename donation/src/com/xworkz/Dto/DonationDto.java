package com.xworkz.Dto;

public class DonationDto {
    private String name;
    private String amount;
    private String cause;
    private String email;

    public void setName(String name) {
        this.name = name;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public void setCause(String cause) {
        this.cause = cause;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public String getAmount() {
        return amount;
    }
    public String getCause() {
        return cause;
    }
    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return "DonationDto{" +
                "name='" + name + '\'' +
                ", amount='" + amount + '\'' +
                ", cause='" + cause + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
