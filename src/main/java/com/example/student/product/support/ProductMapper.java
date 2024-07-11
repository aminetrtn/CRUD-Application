package com.example.student.product.support;
import com.example.student.product.api.request.UpdateProductRequest;
import com.example.student.product.api.response.ProductResponse;
import com.example.student.product.api.request.ProductRequest;
import com.example.student.product.domain.Product;
import org.springframework.stereotype.Component;
@Component
public class ProductMapper {

    public Product toProduct(ProductRequest productRequest){

        return new Product(productRequest.getName());
    }
    public Product toProduct(Product product, UpdateProductRequest updateProductRequest)
    {
        product.setName(updateProductRequest.getName());
return product;
    }
    public ProductResponse toProductResponse(Product product){
        return new ProductResponse(product.getId(), product.getName());
    }
}
