package com.example.student.product.support;
import com.example.student.product.support.exception.ProductNotFoundException;

import java.util.function.Supplier;
public class ProductExceptionSupplier {
    public static Supplier<ProductNotFoundException> productNotFound(Long id){
        return ()-> new ProductNotFoundException(id);
    }
}
