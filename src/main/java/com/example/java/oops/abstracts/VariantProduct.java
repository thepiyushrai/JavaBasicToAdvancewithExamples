package com.example.java.oops.abstracts;

/**
 * @author Piyush Rai
 * @date 12/03/24
 * @time 9:02 am
 */
public class VariantProduct  extends Product  {
    private MasterProduct[] variants;

    @Override
    public boolean isAvailableInStock() {
        for (MasterProduct masterProduct : variants) {
            if (masterProduct.isAvailableInStock()) {
                return true;
            }
        }
        return false;
    }
}
