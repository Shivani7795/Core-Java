package com.xworkz.payment.dto;

public class PaymentDto {
    private String paymentMethod;
    private String transactionId;
    private String amount;
    private String paymentDate;
    private String customerName;

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getAmount() {
        return amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    @Override
    public String toString() {
        return "PaymentDto{" +
                "paymentMethod='" + paymentMethod + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", amount='" + amount + '\'' +
                ", paymentDate='" + paymentDate + '\'' +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
