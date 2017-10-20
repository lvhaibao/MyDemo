package com.lhb;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootDemoApplication.class, args);
		//修改Banner的模式为OFF
		SpringApplication newRun= new SpringApplication(SpringBootDemoApplication.class);
		newRun.setBannerMode(Banner.Mode.OFF);
		newRun.run(args);
	}
}
