package internal;

public interface PaymentGateway {
    void initiateTransaction();
    void cancelTransaction();
    void refund();
    void generateReceipt();
    void authenticate();
    void verifyAccount();
    void settleFunds();
}
