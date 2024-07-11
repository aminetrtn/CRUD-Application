package com.example.student.product.api;
import com.example.student.product.api.request.UpdateProductRequest;
import com.example.student.product.api.response.ProductResponse;
import com.example.student.product.api.request.ProductRequest;
import com.example.student.product.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService){
        this.productService=productService;
    }
    @PostMapping

    public ResponseEntity<ProductResponse> create(@RequestBody ProductRequest productRequest){
        ProductResponse productResponse=productService.create(productRequest);
        return new ResponseEntity<>(productResponse, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse>find(@PathVariable Long id){
        ProductResponse productResponse =productService.find(id);
        return  ResponseEntity.status(HttpStatus.OK).body(productResponse);
    }
    @PutMapping("/{id}")


    public ResponseEntity<ProductResponse> update (@PathVariable Long id, @RequestBody UpdateProductRequest updateProductRequest){
        ProductResponse productResponse= productService.update(id,updateProductRequest);
        return ResponseEntity.status(HttpStatus.OK).body(productResponse);
    }
    @GetMapping
    public ResponseEntity<List<ProductResponse>>findAll(){
        List<ProductResponse>productResponses=productService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(productResponses);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void>delete(@PathVariable Long id){
productService.delete(id);
return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
