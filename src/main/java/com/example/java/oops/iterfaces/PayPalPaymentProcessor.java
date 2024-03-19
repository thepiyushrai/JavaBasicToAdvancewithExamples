package com.example.java.oops.iterfaces;

/**
 * @author Piyush Rai
 * @date 19/03/24
 * @time 9:59 am
 */
public class PayPalPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(PaymentData payment) {
        /* PayPalForm paymentForm = PayPalApi.getPaymentFormByAppId(APP_ID);
         * fillPaymentForm(paymentForm, payment);
         * paymentForm.submit();
         * ...
         */

    }}