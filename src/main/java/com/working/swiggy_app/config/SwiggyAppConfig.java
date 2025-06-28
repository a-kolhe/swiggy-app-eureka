package com.working.swiggy_app.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configurable
@Configuration
public class SwiggyAppConfig {

	@Bean
	@LoadBalanced
	public RestTemplate template() {
		return new RestTemplate();
	}
}
