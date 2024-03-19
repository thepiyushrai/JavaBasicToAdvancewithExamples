package com.example.java.oops.iterfaces;

/**
 * @author Piyush Rai
 * @date 19/03/24
 * @time 10:10 am
 */
public class ChasePaymentProcessor  implements PaymentProcessor, PaymentValidator {


    @Override
    public void processPayment(PaymentData payment) {

    }

    @Override
    public void someDefaultMethod() {
        PaymentProcessor.super.someDefaultMethod();
    }

    @Override
    public boolean validatePayment(PaymentData payment) {
        return false;
    }
}
