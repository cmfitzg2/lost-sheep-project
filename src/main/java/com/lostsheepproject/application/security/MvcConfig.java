package com.lostsheepproject.application.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("home");
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/submit").setViewName("submit");
		registry.addViewController("/about-us").setViewName("about-us");
		registry.addViewController("/contact-us").setViewName("contact-us");
		registry.addViewController("/donate").setViewName("donate");
		registry.addViewController("/donate").setViewName("donate");
	}

}
