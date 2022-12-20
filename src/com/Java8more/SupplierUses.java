package com.Java8more;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierUses {
    public static void main(String[] args) {
        //No chaning as dont take any input only returns
        Supplier<Date> dateSupplier = () -> new Date();
        Supplier<String> stringSupplier = () -> "Hello Supplier";
        System.out.println(stringSupplier.get() + " " + dateSupplier.get());
    }
}
