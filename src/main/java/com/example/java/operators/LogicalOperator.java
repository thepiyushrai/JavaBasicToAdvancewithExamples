package com.example.java.operators;

public class LogicalOperator {
    public class LogicalOperatorsExample {
        public static void main(String[] args) {
            boolean a = true;
            boolean b = false;

            // AND Operator
            boolean andResult = a && b;
            System.out.println("a && b = " + andResult); // Output: a && b = false

            // OR Operator
            boolean orResult = a || b;
            System.out.println("a || b = " + orResult);  // Output: a || b = true

            // NOT Operator
            boolean notResultA = !a;
            boolean notResultB = !b;
            System.out.println("!a = " + notResultA);   // Output: !a = false
            System.out.println("!b = " + notResultB);   // Output: !b = true
        }
    }

}
