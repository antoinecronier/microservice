package com.tactfactory.microservice.currencyconvertionservice.feigns;

//import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.tactfactory.microservice.currencyconvertionservice.beans.CurrencyConversion;

//@RibbonClient(name="currency-exchange-service")
@FeignClient(name="currency-exchange-service")
public interface CurrencyExchangeServiceProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	CurrencyConversion convertCurrencyFeign(@PathVariable("from") String from, @PathVariable("to") String to);
}
