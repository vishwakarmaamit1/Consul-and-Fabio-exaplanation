package com.vishwakarma.config;

import com.vishwakarma.infrastructure.feign.AddressProvider;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@EnableFeignClients(basePackageClasses = {AddressProvider.class})
@Configuration
public class FeignConfig {
}
