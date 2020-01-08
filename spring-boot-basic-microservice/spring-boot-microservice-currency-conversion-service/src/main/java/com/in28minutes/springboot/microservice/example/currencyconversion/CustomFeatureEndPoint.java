/**
 * 
 */
package com.in28minutes.springboot.microservice.example.currencyconversion;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

/**
 * @author RAMAVI
 *https://dzone.com/articles/spring-boot-actuator-in-spring-boot-20
 */
@Component
@Endpoint(id="testendpoint")
public class CustomFeatureEndPoint {

	private Map<String, Object> features = new ConcurrentHashMap<>();
	 
    @ReadOperation
    public Map<String, Object> features() {
    	features.put("customFeature", "Hello World!");
        return features;
    }
}

