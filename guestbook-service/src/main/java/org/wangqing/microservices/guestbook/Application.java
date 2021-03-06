package org.wangqing.microservices.guestbook;

import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;
import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.wangqing.microservices.guestbook.model.StudentDataRestRepository;

@SpringBootApplication
@EnableDiscoveryClient
@EnablePrometheusEndpoint
@EnableSpringBootMetricsCollector
//@EnableHystrixDashboard
public class Application {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentDataRestRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
