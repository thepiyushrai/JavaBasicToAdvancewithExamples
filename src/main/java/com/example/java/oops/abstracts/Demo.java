package com.example.java.oops.abstracts;

/**
 * @author Piyush Rai
 * @date 12/03/24
 * @time 9:01 am
 */
public class Demo {
    public static void main(String[] args) {
        User user = new User();

//		// === init static nested class

        // === Abstract class demo
//		Product product = new Product(); // can't create instance of an abstract class
        MasterProduct masterProduct = new MasterProduct();
        VariantProduct variantProduct = new VariantProduct();

        masterProduct.setName("Mercedes S-klass");
        variantProduct.setDeliveryAvailable(true);

        // === Anonymous class demo
        Product product = new Product() {
            @Override
            public boolean isAvailableInStock() {
                return false;
            }
        };

    }
}
