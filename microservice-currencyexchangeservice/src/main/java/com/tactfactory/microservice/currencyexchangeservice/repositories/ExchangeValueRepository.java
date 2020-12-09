package com.tactfactory.microservice.currencyexchangeservice.repositories;

import com.tactfactory.microservice.currencyexchangeservice.entities.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	ExchangeValue findByFromAndTo(String from, String to);
}
