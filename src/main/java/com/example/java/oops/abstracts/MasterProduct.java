package com.example.java.oops.abstracts;

/**
 * @author Piyush Rai
 * @date 09/03/24
 * @time 11:57 pm
 */
public class MasterProduct extends Product {
    private boolean isAvailableForLease;

    @Override
    public boolean isAvailableInStock() {
        return getRemainingAmountInStock() > 0;
    }
}
