package com.tactfactory.microservice.frontend;

import java.math.BigDecimal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="netflix-zuul-api-gateway-server")
public interface CurrencyConvertionServiceProxy {

    @GetMapping("/currency-conversion-service/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    FormDto convertCurrencyFeign(@PathVariable("from") String from, @PathVariable("to") String to, @PathVariable("quantity") BigDecimal quantity);
}
