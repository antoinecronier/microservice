package com.tactfactory.microservice.currencyconversionservice;

//import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@RibbonClient(name="currency-exchange-service")
//@FeignClient(name="currency-exchange-service")
@FeignClient(name="netflix-zuul-api-gateway-server")
public interface CurrencyExchangeServiceProxy {

    @GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
    //@GetMapping("/currency-exchange/from/{from}/to/{to}")
    CurrencyConversion convertCurrencyFeign(@PathVariable("from") String from, @PathVariable("to") String to);
}
