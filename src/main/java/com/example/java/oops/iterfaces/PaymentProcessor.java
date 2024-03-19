package com.example.java.oops.iterfaces;

/**
 * @author Piyush Rai
 * @date 19/03/24
 * @time 9:56 am
 */
public interface PaymentProcessor {
    int RETRY_ATTEPMPTS = 5;

    void processPayment(PaymentData payment);

    default void someDefaultMethod() {
        System.out.println("This is the default method");
    }

    static void someStaticMethod() {
        System.out.println("This is the static method");
    }
}
