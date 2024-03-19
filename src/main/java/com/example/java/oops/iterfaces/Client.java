package com.example.java.oops.iterfaces;

/**
 * @author Piyush Rai
 * @date 19/03/24
 * @time 10:00 am
 */
public class Client {
    private PaymentProcessor paymentProcessor;

    {
        paymentProcessor = new PayPalPaymentProcessor();
    }

    public void checkout(PaymentData payment) {
        // ... some methods calls goes here
        paymentProcessor.processPayment(payment);
        PaymentProcessor.someStaticMethod(); // demo of static method invocation
    }

    public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }
}
