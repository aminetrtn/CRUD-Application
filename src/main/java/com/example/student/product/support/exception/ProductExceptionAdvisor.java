package com.example.student.product.support.exception;

import com.example.student.shared.api.response.ErrorMessageResponse;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.slf4j.LoggerFactory;
@ControllerAdvice

public class ProductExceptionAdvisor {
    private static final Logger LOG = LoggerFactory.getLogger(ProductExceptionAdvisor.class);
    @ExceptionHandler(ProductNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorMessageResponse ProductNotFound(Exception e)
    {
        LOG.error(e.getMessage(),e);
        return new ErrorMessageResponse(e.getLocalizedMessage());
    }
}
